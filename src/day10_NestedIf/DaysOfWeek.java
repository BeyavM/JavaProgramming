package day10_NestedIf;

public class DaysOfWeek {

    public static void main(String[] args) {

        int day = 7;

       String dayOfWeek = (day == 1)? "Monday" :(day == 2)? "Tuesday" :(day == 3)? "Wednesday" :(day == 4)? "Thursday"
                         :(day == 5)? "Friday" :(day == 6)? "Saturday" :(day == 7)? "Sunday" : "Not a real day" ;
        System.out.println(dayOfWeek); //will print out the name of the day of the week


    }


}
