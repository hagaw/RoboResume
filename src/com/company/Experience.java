package com.company;

import java.util.ArrayList;

public class Experience {

    private String jobTytle;
    private String company;
    private String startDate;
    private String endDate;


private  ArrayList<String> duty = new ArrayList<>();

//===================================================


    public Experience() {
    }

    public Experience(String jobTytle, String company, String startDate, String endDate, ArrayList<String> duty) {
        this.jobTytle = jobTytle;
        this.company = company;
        this.startDate = startDate;
        this.endDate = endDate;
        this.duty = duty;
    }

    public String getJobTytle() {
        return jobTytle;
    }

    public void setJobTytle(String jobTytle) {
        this.jobTytle = jobTytle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public ArrayList<String> getDuty() {
        return duty;
    }

    public void setDuty(ArrayList<String> duty) {
        this.duty = duty;
    }
}
