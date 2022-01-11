package day25_CustomMethod_Overloading;

public class SumOfNumbers {

    public static void main(String[] args) {

        int sumOf2 = sumOf2Numbers(10, 20); //this method we created will return the sum of two numbers (the addition) we can either print the whole method or create a variable for it like we did (sum) and print that out
        System.out.println("sumOf2 = " + sumOf2); //30

        int sumOf3 = sumOf3Numbers(10, 20, 30); //this method will return the sum of three numbers
        System.out.println("sumOf3 = " + sumOf3); //60

        int sumOf4 = sumOf4Numbers(10, 20, 30, 40); //this method will return the sum of four numbers
        System.out.println("sumOf4 = " + sumOf4); //100

    }

    public static int sumOf2Numbers(int num1, int num2){

        return num1+num2; //will return the sum of the two numbers by adding them together

    }

    public static int sumOf3Numbers(int num1, int num2, int num3){

        return num1+num2+num3; //will return the sum of the three numbers by adding them together

    }

    public static int sumOf4Numbers(int num1, int num2, int num3, int num4){

        return num1+num2+num3+num4; //will return the sum of the four numbers by adding them together

    }

}
/* 1. create a method that can find the sum of two numbers
                        method name: sumOf2Numbers

        2. create a method that can find the sum of three numbers
                        method name: sumOf3Numbers

        3. create a method that can find the sum of four numbers
                        method name: sumOf4Numbers
 */