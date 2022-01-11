package day14_String;

import java.util.Locale;

public class FormatFullName {

    public static void main(String[] args) {

        String firstName = "cyDEo";
        String lastName = "SCHOOL";

        System.out.println("Enter your first name:");

        String name = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase(); //this formula converts the capitalization so only the first letter is capital and the rest are lowercase
//                                        C                                       ydeo  ==> Cydeo
        String name2 = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

        String fullName = name + " " + name2; //allows me to print 'fullName' once rather than creating two variables to print first and last name

        System.out.println(fullName); //prints "Cydeo School"


    }

}
/* Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo";
                        lastName = "SCHOOL";

                    output:
                        Cydeo School

 */