package day11_Switch_Scanner;

public class NumberOfDays {

    public static void main(String[] args) {

        int year = 2000;
        int number = 8;

        if(number >= 1 && number <= 12){ //number could be 1-12

            switch (number){

                case 2:
                    if(year % 4 == 0){
                        System.out.println("29 days");
                    }else{
                        System.out.println("28 days");
                    }
                    break;

                case 4: case 6: case 9: case 11:
                    System.out.println("30 days");
                    break;

                default: //1, 3, 5, 7, 8, 10, 12
                    System.out.println("31 days");
                    break;

            }

        }else {
            System.out.println("Invalid Number");

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