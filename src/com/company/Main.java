package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //Araay lst of skills

        Scanner sc=new Scanner(System.in);

   //=================================================================

   //name and email

        System.out.println("enter your name");
        String userInputName=sc.nextLine();
        System.out.println("enter your email");
        String userInputEmail=sc.nextLine();


   //An array lists of education==========================================
        System.out.println("enter  your degree");
        String userInputDegreeType=sc.nextLine();
        System.out.println("enter your major");
        String userInputMajor=sc.nextLine();
        System.out.println("enter the school");
        String userInputSchool=sc.nextLine();
        System.out.println("enter your year of graduation");
        String userInputYearOfGraduation=sc.nextLine();

        ArrayList<Education>myEducation=new ArrayList();


        myEducation.add(new Education(userInputDegreeType,userInputMajor,userInputSchool,userInputYearOfGraduation));

//===================================================================================================

//An array list of Experiance========================================================================

        System.out.println("enter job type");
        String UserInputJobTytle=sc.nextLine();
        System.out.println("enter the company name");
         String UserInputCompany=sc.nextLine();
        System.out.println("enter the start date");
         String UserInputStartDate=sc.nextLine();
        System.out.println("enter the end day");
         String UserInputEndDate=sc.nextLine();

        System.out.println("enter the duty");

        ArrayList<String> duty = new ArrayList<>();

         String userInputDuty=sc.nextLine();
         duty.add(userInputDuty);

ArrayList<Experience>myExperience=new ArrayList();
myExperience.add(new Experience(UserInputJobTytle,UserInputCompany,UserInputStartDate,UserInputEndDate,duty));

//====================================================================================================================

//An array lists of Skill

        System.out.println("enter your skill name");
         String userInputSkillName=sc.nextLine();
        System.out.println("enter the skill level as /highly skilled\n" +
                "    //proficient\n" +
                "    //amiliar");

         String userInputSckillLevel=sc.nextLine();


        ArrayList<Skill>mySkill=new ArrayList();

        mySkill.add(new Skill(userInputSkillName,userInputSckillLevel));


 //=====================================================================================================================

 //printing the resume




        System.out.println(userInputName);
        System.out.println(userInputEmail);

        System.out.println("Education :");
        System.out.println(userInputDegreeType+" in "+userInputMajor);
        System.out.println (userInputSchool);
        System.out.println (userInputYearOfGraduation);



    }


}
