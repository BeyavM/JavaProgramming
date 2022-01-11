package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // System.out.println("Enter true or false: ");
        // boolean result = input.nextBoolean();

        System.out.println("Enter your name: ");
        String name = input.next(); //Beyav             //input.next(); prints out anything until you add a space, then it stops

        System.out.println("name = " + name); //Beyav

        input.close();
    }

}
