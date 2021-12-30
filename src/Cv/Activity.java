package Cv;

import Enumerations.Support;
import Enumerations.*;



public class Activity {
    private int id ;
    private int PeriodOfTime;
    private Support support;
    private ActivtityType activity ;
    private String possibleActivity;
    private String supportNature;

    //constructeur non param

    public Activity() {
    }


    //constructeur param

    public Activity(int id, int periodOfTime, Support support, ActivtityType activity, String possibleActivity, String supportNature) {
        this.id = id;
        PeriodOfTime = periodOfTime;
        this.support = support;
        this.activity = activity;
        this.possibleActivity = possibleActivity;
        this.supportNature = supportNature;
    }


    //getters and setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPeriodOfTime() {
        return PeriodOfTime;
    }

    public void setPeriodOfTime(int periodOfTime) {
        PeriodOfTime = periodOfTime;
    }

    public Support getSupport() {
        return support;
    }

    public void setSupport(Support support) {
        this.support = support;
    }

    public ActivtityType getActivity() {
        return activity;
    }

    public void setActivity(ActivtityType activity) {
        this.activity = activity;
    }

    public String getPossibleActivity() {
        return possibleActivity;
    }

    public void setPossibleActivity(String possibleActivity) {
        this.possibleActivity = possibleActivity;
    }

    public String getSupportNature() {
        return supportNature;
    }

    public void setSupportNature(String supportNature) {
        this.supportNature = supportNature;
    }
}
