package day11_Switch_Scanner;

public class DaysInWeek {

    public static void main(String[] args) {

        int number = 2; //you CAN NOT use long, float, double, or boolean in switch statements

        /* if(number == 1){
            System.out.println("Monday");
        } */                            //if statement example <--

        switch(number){ //1,2,3,4,5,6,7, ==
            case 1:
                System.out.println("Monday"); //prints "Monday" for case 1
                break;//exit the switch after executing the case block
            case 2:
                System.out.println("Tuesday"); //prints "Tuesday" for case 2
                break;//exit the switch after executing the case block
            case 3:
                System.out.println("Wednesday"); //prints "Wednesday" for case 3
                break;//exit the switch after executing the case block
            case 4:
                System.out.println("Thursday"); //prints "Thursday" for case 4
                break;//exit the switch after executing the case block
            case 5:
                System.out.println("Friday"); //prints "Friday" for case 5
                break;//exit the switch after executing the case block
            case 6:
                System.out.println("Saturday"); //prints "Saturday" for case 6
                break;//exit the switch after executing the case block
            case 7:
                System.out.println("Sunday"); //prints "Sunday" for case 7
                break;//exit the switch after executing the case block

            default: // only gets executed if none of the blocks are matching, ex: any number other than 1-7 for this example
                System.out.println("Invalid"); //prints invalid if a number other than 1-7 is inserted
                break; //exit the switch after executing the case block, although the last block does not require a break to exit the switch

        }




    }



}
