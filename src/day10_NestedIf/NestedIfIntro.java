package day10_NestedIf;

import org.w3c.dom.ls.LSOutput;

public class NestedIfIntro {

    public static void main(String[] args) {

        int score = 100;

       if(score >= 0 && score <= 100) { //nested if curly brace contains if and else statements


           if (score >= 60) { //if student passed the exam
               System.out.println("Passed"); //prints Passed
           } else { //if student failed the exam
               System.out.println("Failed"); //prints Failed
           }
//end curly brace of nested if statement
       } else { //if number is less than 0, or greater than 100, this result is given
           System.out.println("Invalid Score"); //prints Invalid Score
       }

        System.out.println("---------------------------------------------------------------------");

       int age = 21;
       boolean hasID = true;

        if (hasID) { //if person has ID

            if (age >= 21) {
                System.out.println("Eligible to buy Alcohol");
            } else {
                System.out.println("Not Eligible to buy Alcohol");
            }

        }else{ //if person does not have ID
            System.out.println("You must have ID to buy Alcohol");
        }

        System.out.println("-------------------------------------------------------------");

        int number = 5;

        if (number >= 1 && number <= 7) { //if the number is a valid number (1-7)

            if (number == 1) {
                System.out.println("Monday");
            } else if (number == 2) {
                System.out.println("Tuesday");
            } else if (number == 3) {
                System.out.println("Wednesday");
            } else if (number == 4) {
                System.out.println("Thursday");
            } else if (number == 5) {
                System.out.println("Friday");
            } else if (number == 6) {
                System.out.println("Saturday");
            }else{
                System.out.println("Sunday");
            }

        }else {
            System.out.println("Invalid");
        }



    }




}
