package day07_Operators;

public class EvenlyDivisible {

    public static void main(String[] args) {

        double number = 65;

        boolean isDivisibleBy2 = number%2==0; //boolean - true / false
        boolean isDivisibleBy3 = number%3==0;
        boolean isDivisibleBy5 = number%5==0;

        System.out.println("isDivisibleBy2 = " + isDivisibleBy2); //concatenations
        System.out.println("isDivisibleBy3 = " + isDivisibleBy3);
        System.out.println("isDivisibleBy5 = " + isDivisibleBy5);

    }

}

/* Create a class called EvenlyDivisible, and write a program that can check if a number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true  */