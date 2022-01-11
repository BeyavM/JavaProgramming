package day17_While_DoWhile;

import java.util.Scanner;

public class BranchingStatements {

    public static void main(String[] args) {
//A through Z
        for (char i = 'A'; i <= 'Z'; i++) {
            if(i == 'F'){
                break; //exits the loop from the stated point 'F', will not continue to 'Z'
            }
            System.out.print(i + " "); // A B C D E F <== it stops at 'F'
        }

        System.out.println("-------------------------------");

        Scanner scan = new Scanner(System.in);
//Positive Numbers Only
        while(true){
            System.out.println("Enter a number: ");
            int num = scan.nextInt();

            if(num < 0) {
            break;
            }
        }

        scan.close();

    }
}

