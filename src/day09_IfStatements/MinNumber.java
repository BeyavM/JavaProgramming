package day09_IfStatements;

public class MinNumber {

    public static void main(String[] args) {

       int n1 = 199,
           n2 = 200;

       boolean n1IsMin = n1 < n2; //n1 is less than n2
       boolean n2IsMin = n2 < n1; //n2 is less than n1
       boolean equal = n1 == n2; // n1 is equal to n2

        if (n1IsMin) { //if n1 is the minimum number
            System.out.println(n1 + " is the minimum number");
        }
        if (n2IsMin) { //if n2 is the minimum number
            System.out.println(n2 + " is the minimum number");
        }
        if (equal) { // if n1 and n2 are equal
            System.out.println("the numbers are equal");
        }


       /* if (n1 < n2) {
            System.out.println(n1 + " is the minimum number");
        }

        */

    }

}
/* Create a class called MinNumber, Write a program that can print the minimum number between two numbers, if both are equal then print Equal

        Ex:
        n1= 100, n2 = 200;

        output:
        100 is the minimum number

    */