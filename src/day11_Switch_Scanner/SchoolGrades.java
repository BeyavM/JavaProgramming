package day11_Switch_Scanner;

public class SchoolGrades {

    public static void main(String[] args) {

        char grade = 'B';

        switch (grade){

            case 'A':
                System.out.println("A: Excellent");
                break;
            case 'B':
                System.out.println("B: Great");
                break;
            case 'C':
                System.out.println("C: Good");
                break;
            case 'D':
                System.out.println("D: Pass");
                break;
            case 'F':
                System.out.println("F: Failed");
                break;
            default:
                System.out.println("Invalid Grade");



        }




    }



}
