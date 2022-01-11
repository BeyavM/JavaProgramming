package day19_LoopPractice;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num1 = scan.nextInt();

        System.out.println("Enter a math operator:");
        char operator = scan.next().charAt(0); //there is no nextChar for Scanners, so to input a char data type, you must use .charAt(); after scan.next()

        if( !(operator == '+' || operator == '-')) { //if the operator is not valid (if the operator is not + or -)
            System.err.println("Invalid Math Operator: " + operator);
            System.exit(0);
        }
        System.out.println("Enter a number:");
        int num2 = scan.nextInt();

        if(operator == '-'){
            System.out.println(num1 - num2);
        }else{
            System.out.println(num1 + num2);
        }






    }

}
