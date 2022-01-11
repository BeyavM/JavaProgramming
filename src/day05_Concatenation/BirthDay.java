package day05_Concatenation;

public class BirthDay {

    public static void main(String[] args) {

        String name = "Beyav";
        int birthDay = 18;
        String birthMonth = "August";
        int birthYear = 2001;

        System.out.println(name + " was born on " + birthMonth + "/" + birthDay + "/" + birthYear);

        System.out.println("------------------------------------------------------------------------");

        String bookName = "Goosebumps";

        System.out.println("My favorite book is \"" + bookName + "\"");

        /*
        \n - newline
        \t - horizontal tab
        \\ - backslash
        \" - quotations
         */

    }

}
/* Create a class called BirthDay and create the following variable
             name, birthDay(int), birthMonth(String), birthYear(int)

             use concatenation to display the birthday of the person

                 if  name = "John"
                     birthDay = 25
                     birthMonth = "April"
                     birthYear = 1995;

                 output:
                     John was born on April/25/1995. */
