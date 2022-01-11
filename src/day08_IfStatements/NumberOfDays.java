package day08_IfStatements;

public class NumberOfDays {

    public static void main(String[] args) {

        int number = 11; //any number from 1-12

        boolean has28Days = number == 2;
        boolean has30Days = number == 4 || number == 6 || number == 9 || number == 11;
        boolean has31Days = number == 1 || number == 3 || number == 5 || number == 7 || number == 8 || number == 10 || number == 12;
                            // ^ the fast way to write this is boolean has31Days = !has30Days && !has28Days;

        if (has28Days) { //if the month has 28 days
            System.out.println("28 Days");
        }

        if (has30Days) { //if the month has 30 days
            System.out.println("30 Days");
        }
        if (has31Days) { //if the month has 31 days
            System.out.println("31 Days");
        }

    }

}
/* Create a class called NumberOfDays, Write a program that can print the number of days in a month

            Ex:
                number = 1;

            output:
                31 Days

            Hints:
                Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
                Months that has 30 days: 4, 6, 9, 11
                Month that has 28 days: 2 */