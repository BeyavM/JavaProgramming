package day10_NestedIf;

public class NameOfMonth_UsingTernary {

    public static void main(String[] args) {

        int month = 8;

        String monthName = (month == 1)? "January" :(month == 2)? "February" :(month == 3)? "March" :(month == 4)? "April" :(month == 5)? "May" :(month == 6)? "June"
                          :(month == 7)? "July" :(month == 8)? "August" :(month == 9)? "September" :(month == 10)? "October" :(month == 11)? "November" :(month == 12)? "December" : "Not a real month";
        System.out.println(monthName);

        /*
        int month = 8;
parenthesis using ternary aren't required, but isn't recommended as things become harder to read v
        String monthName = month == 1? "January" :month == 2? "February" :month == 3? "March" :month == 4? "April" :month == 5? "May" :month == 6? "June"
                          :month == 7? "July" :month == 8? "August" :month == 9? "September" :month == 10? "October" :month == 11? "November" :month == 12? "December" : "Not a real month";
        System.out.println(monthName);
         */


    }


}
