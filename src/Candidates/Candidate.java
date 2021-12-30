package Candidates;

import Enumerations.*;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Candidate implements Comparable<Candidate> {
    private String Name ;
    private String Lastname ;
    private String birthDate;
    private String partie;
    private byte[] photo;
    private String facebook ;
    private String twitter;
    private ActivtityType activity;
    private int period;
    private Support support;
    private int id;
    private double note;
    private String ReclamationAdmin;
    private String ReclamationElector;

    //constructeur nn param

    public Candidate() {
    }


    //constructeur param

    public Candidate(String name, String lastname, String birthDate, String partie, byte[] photo, String facebook, String twitter, ActivtityType activity, int period, Support support, int id, double note, String reclamationAdmin, String reclamationElector) {
        Name = name;
        Lastname = lastname;
        this.birthDate = birthDate;
        this.partie = partie;
        this.photo = photo;
        this.facebook = facebook;
        this.twitter = twitter;
        this.activity = activity;
        this.period = period;
        this.support = support;
        this.id = id;
        this.note = note;
        ReclamationAdmin = reclamationAdmin;
        ReclamationElector = reclamationElector;
    }


    //getters and setters


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPartie() {
        return partie;
    }

    public void setPartie(String partie) {
        this.partie = partie;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public ActivtityType getActivity() {
        return activity;
    }

    public void setActivity(ActivtityType activity) {
        this.activity = activity;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period){this.period=period;}

    public Support getSupport() {
        return support;
    }

    public void setSupport(Support support) {
        this.support = support;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public double getNote()
    {
        return note;
    }

    public void setNote(double note){
        this.note=note;

    }

    public String getReclamationAdmin() {
        return ReclamationAdmin;
    }

    public void setReclamationAdmin(String reclamationAdmin) {
        ReclamationAdmin = reclamationAdmin;
    }

    public String getReclamationElector() {
        return ReclamationElector;
    }

    public void setReclamationElector(String reclamationElector) {
        ReclamationElector = reclamationElector;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidate candidate = (Candidate) o;
        return period == candidate.period && id == candidate.id && Double.compare(candidate.note, note) == 0 && Objects.equals(Name, candidate.Name) && Objects.equals(Lastname, candidate.Lastname) && Objects.equals(birthDate, candidate.birthDate) && Objects.equals(partie, candidate.partie) && Arrays.equals(photo, candidate.photo) && Objects.equals(facebook, candidate.facebook) && Objects.equals(twitter, candidate.twitter) && activity == candidate.activity && support == candidate.support && Objects.equals(ReclamationAdmin, candidate.ReclamationAdmin) && Objects.equals(ReclamationElector, candidate.ReclamationElector);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(Name, Lastname, birthDate, partie, facebook, twitter, activity, period, support, id, note, ReclamationAdmin, ReclamationElector);
        result = 31 * result + Arrays.hashCode(photo);
        return result;
    }

    public void DonnerNote()
    {

        double actt,exp;
        switch (this.activity)
        {
            case political :
                actt=18;
                break;
            case economic:
                actt=14;
                break;
            case social:
                actt=9;
                break;
            case Humanitarian:
                actt=5;
                break;
            case scientific:
                actt=3;
                break;
            default:
                actt=1;

        }
        if (getPeriod()>=20){
            exp=25;
            note=actt+exp;
        }
        else if(getPeriod()>=10 && getPeriod()<20)
        {
            exp=15;
            note=actt+exp;
        }
        else
        {
            exp=10;
            note=actt+exp;
        }

        System.out.println(note);
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "Name='" + Name + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", partie='" + partie + '\'' +
                ", photo=" + Arrays.toString(photo) +
                ", facebook='" + facebook + '\'' +
                ", twitter='" + twitter + '\'' +
                ", activity=" + activity +
                ", period=" + period +
                ", support=" + support +
                ", id=" + id +
                ", note=" + note +
                ", ReclamationAdmin='" + ReclamationAdmin + '\'' +
                ", ReclamationElector='" + ReclamationElector + '\'' +
                '}';
    }

    @Override
    public int compareTo(Candidate o) {
        return (int) (this.note - o.note);
    }

    public void reclamation(){
        Scanner sc=new Scanner(System.in);
        Candidate c1=new Candidate();
        c1.setReclamationElector(sc.nextLine());

    }
}
