package day12_Scanner;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        /* Scanner scan = new Scanner(System.in);
        System.out.println("upper or lower:");
        String upperOrLower = scan.next();

        System.out.println("please enter your word.");
        String insertWord = scan.next();

        for (char i = 'A'; i <= 'Z';) {
            System.out.println("upper");
        }

        for (char j = 'a'; j <= 'z';) {
            System.out.println("lower");
        }
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Do you want upper or lower");
        String str = input.next();

        if (str.equalsIgnoreCase("lower")){

            for (char i = 'a'; i <= 'z'; i++) {
                System.out.print(i + " ");

            }

        } else if (str.equalsIgnoreCase("upper")){

            for (char i = 'A'; i <= 'Z'; i++) {
                System.out.print(i + " ");

            }

        }

        System.out.println();

        System.out.println("Do you want descending lower or descending upper");
        String str1 = input.next();

        if (str1.equalsIgnoreCase("lower")){

            for (char i = 'z'; i >= 'a'; i--) {
                System.out.print(i + " ");

            }

        } else if (str1.equalsIgnoreCase("upper")){

            for (char i = 'Z'; i >= 'A'; i--) {
                System.out.print(i + " ");

            }

        }








    }

}
/* [Dynamic alphabet]
•Write a program that will ask ‘upper’ or ‘lower’
•If it is upper: print the alphabet in all uppercase letter from A to Z
•If it is lower: print the alphabet in all uppercase letter from a to z
- Challenge: Also ask if they want to show the alphabet in ascending or
order descending
- Ascending: A – Z or a – z
- Descending: Z – A or z – a */
