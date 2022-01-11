package day08_IfStatements;

public class LeapYear {

    public static void main(String[] args) {

        int year = 2000;

        boolean isLeapYear = year % 4 ==0;

        System.out.println(year + " is Leap Year: " + isLeapYear);

    }

}
