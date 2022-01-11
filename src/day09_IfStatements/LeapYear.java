package day09_IfStatements;

public class LeapYear {

    public static void main(String[] args) {

        int year = 2000;

        boolean leapYear = year % 4 == 0;
//two independent if statements; not as efficient
        if (leapYear) {
            System.out.println("Year " + year + " is a leap year"); //two independent if statements
        }

        if (!leapYear) {
            System.out.println("Year " + year + " is not a leap year");
        }

        System.out.println("----------------------------------------------------------------------------");
//a single if/else statement, more efficient
        if (leapYear) {
            System.out.println("Year " + year + " is a leap year"); //one independent if statements
        }else {
            System.out.println("Year " + year + " is not a leap year");
        }
    }

}
