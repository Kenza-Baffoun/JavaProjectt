package Menu;

import Candidates.Candidate;
import Candidates.Icandidate;
import Enumerations.ActivtityType;
import Enumerations.Support;
import ListOfCandidates.ListCandidates;
import Users.*;

import java.util.Scanner;

public class Maintest {
    public static void setCandidate(Candidate c1) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Name ?");
        c1.setName(sc.nextLine());

        System.out.println("Lastname ?");
        c1.setLastname(sc.nextLine());

        System.out.println("Birthdate ?");
        c1.setBirthDate(sc.nextLine());

        System.out.println("Partie?");
        c1.setPartie(sc.nextLine());

        System.out.println("Photo?");

        System.out.println("facebook ?");
        c1.setFacebook(sc.nextLine());

        System.out.println("Twitter ?");
        c1.setTwitter(sc.nextLine());

        System.out.println("id?");
        c1.setId(sc.nextInt());

        System.out.println("Activity Type ?");
        System.out.println("1- Humanitarian ,\n" +
                "    2- social,\n" +
                "    3- economic,\n" +
                "    4- political,\n" +
                "    5- scientific,\n" +
                "    6- other");
        int choice1=sc.nextInt();
        ActivtityType act=ActivtityType.other;
        switch(choice1) {
            case 1:
                act=ActivtityType.Humanitarian;
                break;
            case 2:
                act=ActivtityType.social;
                break;
            case 3:
                act=ActivtityType.economic;
                break;
            case 4:
                act=ActivtityType.political;
                break;
            case 5:
                act=ActivtityType.scientific;
                break;
            default:
                act=ActivtityType.other;


        }
        c1.setActivity(act);
        System.out.println("support?");
        System.out.println("  1-video ,\n" +
                "   2- photo,\n" +
                "   3-  link,\n" +
                "   4- text,\n" +
                "   5- paper,\n" +
                "   6- other");
        int choice2=sc.nextInt();
        Support supp=Support.other;
        switch (choice2){
            case 1:
                supp=Support.video;
                break;
            case 2:
                supp=Support.photo;
                break;
            case 3:
                supp=Support.link;
                break;
            case 4:
                supp=Support.text;
                break;
            case 5 :
                supp=Support.paper;
                break;
            default:
                supp=Support.other;

        }
        c1.setSupport(supp);
        System.out.println("Period of time of your activity ?");
        c1.setPeriod(sc.nextInt());

    }

    public static void getAdmin(Admin a1) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Login:");
        a1.setLogin(sc.nextLine());
        System.out.println("Password");
        a1.setPassword(sc.nextLine());
    }

    public static int PrincipalMenu()
    {
        System.out.println("Selectionnez un choix :");
        System.out.println("1-Admin");
        System.out.println("2-Elector");
        System.out.println("3-Candidate");
        System.out.println("4-Leave");
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Votre choix : ");
            choice = sc.nextInt();
        } while (choice < 1 || choice > 4);
        return choice;
    }
    public static int AdminMenu(){

        System.out.println("Do you want to:");
        System.out.println("1-Add a candidate");
        System.out.println("2-Remove a candidate");
        System.out.println("3-Modify a candidate");
        System.out.println("4-Show a candidate");
        System.out.println("5-List of Candidates");
        System.out.println("6-Return");
        System.out.println("your choice?");
        Scanner sc = new Scanner(System.in);
        int choiceA;
        choiceA=sc.nextInt();


        while(choiceA<1 || choiceA>6)
        {
            System.out.println("your choice?");
            choiceA=sc.nextInt();
        }
        return choiceA;
    }

    public static int ElectorMenu()
    {
        System.out.println("Do you want to:");
        System.out.println("1- Show List of Candidates");
        System.out.println("2- Give a mark /100");
        System.out.println("3- Return");
        Scanner sc = new Scanner(System.in);
        int choiceE=sc.nextInt();
        while (choiceE < 1 || choiceE > 3)
        {
            System.out.println("Votre choix : ");
            choiceE = sc.nextInt();
        }
        return choiceE;

    }
    public static int CandidateMenu()
    {
        System.out.println("Do you want to:");
        System.out.println("1- Show List of Candidates");
        System.out.println("2- Return");
        Scanner sc = new Scanner(System.in);
        int choiceC=sc.nextInt();
        while (choiceC < 1 || choiceC > 2){
            System.out.println("Votre choix : ");
            choiceC = sc.nextInt();
        }
        return choiceC;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        Icandidate candidate ;
        candidate=new ListCandidates();

        do{
            choice=Maintest.PrincipalMenu();
            int choiceA;
            int choiceE;
            int choiceC;
            Candidate c1=new Candidate();
            Admin a1=new Admin();
            Elector e1=new Elector();
            switch (choice){
                case 1:

                    getAdmin(a1);
                    do{

                        choiceA=AdminMenu();
                        switch(choiceA){
                            case 1:
                                setCandidate(c1);
                                candidate.addCandidate(c1);
                                break;
                            case 2:
                                int id;
                                System.out.println("Saisir l'ID du candidat à supprimer:");
                                id=sc.nextInt();
                                candidate.removeCandidate(id);
                                break;
                            case 3:
                                System.out.println("Saisir l'ID du candidat à modifier:");
                                id=sc.nextInt();
                                candidate.modifyCandidate(id);
                                break;
                            case 4:
                                System.out.println("Saisir l'ID du candidat:");
                                id=sc.nextInt();
                                candidate.showCandidate(id);
                                break;
                            case 5:
                                candidate.listAllCandidates();
                                break;

                        }
                    }while(choiceA!=6);
                    break;
                
                    
                case 2:

                    System.out.println("Login :");
                    e1.setLogin(sc.nextLine());


                    do{

                        choiceE=ElectorMenu();
                        switch(choiceE)
                        {
                            case 1:
                                candidate.listAllCandidates();
                                break;
                            case 2:
                                candidate.evaluateCandidate();
                                break;
                        }
                    }while(choiceE!=3);
                    break;
                    
                    
                case 3:
                    do{
                        choiceC=CandidateMenu();
                        switch (choiceC)
                        {
                            case 1:
                                candidate.listAllCandidates();
                                break;
                        }
                    }while(choiceC!=2);
                    break;


            }
















        }while(choice!=4);

        System.out.println("Thank you ! Hope that you liked our project.");

    }
}
