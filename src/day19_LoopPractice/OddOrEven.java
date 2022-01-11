package day19_LoopPractice;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        while(true) {

            System.out.println("Enter a number:");
            int num1 = scan.nextInt();

            if (num1 % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd Number");
            }

            System.out.println("Would you like to enter another number?");
            String a = scan.next();

            if(!(a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("no"))){ //if string a does not get an input of yes or no, the program will terminate.
                System.err.println("Program terminated, reason: False Response"); //if you enter any answer other than yes or no, this message will be displayed, and the program will be terminated
                System.exit(0); //terminates the program
            }

            if(a.equalsIgnoreCase("no")){
                System.out.println("Thank you for using Cydeo calculator!");
                break;
            }

        }

        scan.close();
    }

}
