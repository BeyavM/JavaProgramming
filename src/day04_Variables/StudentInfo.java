package day04_Variables;

import javax.lang.model.SourceVersion;

public class StudentInfo {

    public static void main(String[] args) {

        String student_name = "Beyav Muhsen";
        int age = 20;
        char gender = 'M';
        String schoolName = "Cydeo";
        String phoneNumber = "123-456-7890";
        boolean isFullTime = true;
        double GPA = 3.5;

        System.out.println("Student Name = " + student_name);
        System.out.println("Age = " + age);
        System.out.println("Gender = " + gender);
        System.out.println("School Name = " + schoolName);
        System.out.println("Phone Number = " + phoneNumber); // if you don't like how the names look, you can change them in the quotations, as I did
        System.out.println("Is Attending Full Time = " + isFullTime);
        System.out.println("GPA = " + GPA);

    }

}
/* Create a class called StudentInfo, and declare variables for the followings:
                1. student name
                2. age
                3. gender
                4. school name
                5. phone number
                6. full time */
