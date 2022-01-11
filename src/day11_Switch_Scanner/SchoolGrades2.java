package day11_Switch_Scanner;

public class SchoolGrades2 {

    public static void main(String[] args) {

        char ch = 'A';

        switch(ch){

            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("Passed");
                break;

            case 'F':
                System.out.println("Failed");
                break;

                default:
                System.out.println("Invalid Grade");

        }


    }

}
/* if the grade is A or B or C or D =====> "Passed"
otherwise =====> "Failed"
 */