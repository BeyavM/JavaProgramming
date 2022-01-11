package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: "); //26, or any age
        int age = input.nextInt();

        input.nextLine();//enter

        System.out.println("Enter your full name: "); // Michael Corleone, or any name
        String name = input.nextLine();

        System.out.println("Enter your GPA: "); //3.5
        double gpa = input.nextDouble();

        input.nextLine();//enter

        System.out.println("Enter your school name: "); //Cydeo
        String school = input.nextLine();

        System.out.println(""); //space
        System.out.println("age = " + age); //age:
        System.out.println("name = " + name); //name:
        System.out.println("gpa = " + gpa); //GPA:
        System.out.println("school = " + school); //school:

        input.close();

    }

}
/* ask the user to enter age (nextInt())
   ask the user to enter full name (nextLine())
 */