package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: "); //Michael Corleone
        String fullName = input.nextLine();

        System.out.println("Enter your age: "); //26
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter your school name: "); // Cydeo
        String school = input.nextLine();

        System.out.println("Enter your programming language: "); //Java Programming Language
        String programming = input.nextLine();


        System.out.println("");
        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("school = " + school);
        System.out.println("programming = " + programming);

        input.close();
    }

}
