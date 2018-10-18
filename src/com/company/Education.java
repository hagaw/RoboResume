package com.company;

public class Education {

    private String DegreeType;
    private String major;
    private String school;
    private String yearGraduate;

    public Education() {
    }

    public Education(String degreeType, String major, String school, String yearGraduate) {
        DegreeType = degreeType;
        this.major = major;
        this.school = school;
        this.yearGraduate = yearGraduate;
    }

    public String getDegreeType() {
        return DegreeType;
    }

    public void setDegreeType(String degreeType) {
        DegreeType = degreeType;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getYearGraduate() {
        return yearGraduate;
    }

    public void setYearGraduate(String yearGraduate) {
        this.yearGraduate = yearGraduate;
    }
}

