package day08_IfStatements;

public class SingleIfStatementIntro {

    public static void main(String[] args) {
//single if
        int number = 300;

        /* System.out.println("Odd Number");

        System.out.println("Even Number"); */

        boolean evenNumber = number%2 == 0;
        boolean oddNumber = !evenNumber; //not even number


        if(evenNumber){ //even numbers
            System.out.println(number+ " is an even number.");
        }

        if(!evenNumber){ //not even numbers
            System.out.println(number+ " is an odd number.");
        }
//--------------------------------------------------------------------------
        int n = 300;

        //positive
        if (n > 0) { //if the variable n is greater than 0, it is positive
            System.out.println(n+ " is positive");
        }
        //negative
        if (n < 0) { //if the variable n is less than 0, it is negative
            System.out.println(n+ " is negative");
        }
        //zero
        if (n == 0) { //if the variable n is equal to zero, it is zero
            System.out.println("n is " + n);
        }
//---------------------------------------------------------------------------


    }


}
