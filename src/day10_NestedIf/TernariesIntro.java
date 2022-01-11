package day10_NestedIf;

public class TernariesIntro {

    public static void main(String[] args) {

        int n = 100;

        if(n%2 == 0){
            System.out.println("Even"); //String
        }else{
            System.out.println("Odd"); //String
        }

        System.out.println("-------------------------------------------");

        String result1 = (n%2 == 0)? "Even" : "Odd" ; //ternary

        System.out.println(result1);

        System.out.println("-------------------------------------------");

        int age = 21;
/*
        if(age >= 21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        } */

        //System.out.println((age >= 21)? "Eligible" : "Not Eligible"); //one way to print the data of a ternary, sout printing it

        String result2 = (age >= 21)? "Eligible" : "Not Eligible" ; //example of another ternary
        System.out.println(result2); //result2 will print the above statement

        System.out.println("-------------------------------------------");

        int number = 100;

       /* if(number > 0){                       //this is if statement without use of ternary
            System.out.println("Positive");
        }else if(number < 0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        } */

//this is ternary if statement
        String result3 = (number > 0)? "Positive" :(number < 0)? "Negative" : "Zero" ;
        System.out.println(result3);

    }


}
