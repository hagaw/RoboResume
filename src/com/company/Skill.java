package com.company;

public class Skill {

    private String skillName;
    private String sckillLevel;
    //highly skilled
    //proficient
    //amiliar


    public Skill() {
    }

    public Skill(String skillName, String sckillLevel) {
        this.skillName = skillName;
        this.sckillLevel = sckillLevel;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getSckillLevel() {
        return sckillLevel;
    }

    public void setSckillLevel(String sckillLevel) {
        this.sckillLevel = sckillLevel;
    }
}
