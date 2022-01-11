package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class MethodOverloading {

    public static void main(String[] args) {
//method overloading: multiple different methods sharing the same method name; same method names, different parameters
//examples not using overloading
        int[] intArray = {5,6,0,-1,3,4};
        Arrays.sort(intArray);

        double[] doubleArray = {10.5, 11.5, 5.5, 4.5};
        Arrays.sort(doubleArray);

        char[] charArray = {'E', 'F', 'B', 'D', 'C', 'A'};
        Arrays.sort(charArray);

        System.out.println("-----------------------------------------------");

        //depending on how many numbers im adding (2 numbers to 4 numbers) will determine which created overload will be used, since i'm adding two numbers, the first sumOfNumbers was used (the one we created for only two numbers to be added together)
//int
        //sum of 10 and 20
        int sum1 = sumOfNumbers(10, 20);
        System.out.println(sum1);
        //sum of 10, 20, 30
        int sum2 = sumOfNumbers(10, 20, 30);
        System.out.println(sum2);
        //sum of 10, 20, 30, 40
        int sum3 = sumOfNumbers(10, 20, 30, 40);
        System.out.println(sum3);

        System.out.println("---------------");
//double
        //sum of double 10.0 and 20.0
        double doubleSum1 = sumOfNumbers(10.0, 20.0);
        System.out.println(doubleSum1);
        //sum of double 10.0, 20.0, 30.0
        double doubleSum2 = sumOfNumbers(10.0, 20.0, 30.0);
        System.out.println(doubleSum2);
        //sum of double 10.0, 20.0, 30.0, 40.0
        double doubleSum3 = sumOfNumbers(10.0, 20.0, 30.0, 40.0);
        System.out.println(doubleSum3);

    }

    //as long as these methods have the same name but different parameters, they are overloaded

//int
    public static int sumOfNumbers (int num1, int num2){
        return num1+num2;
    }
    public static int sumOfNumbers (int num1, int num2, int num3){
        return num1+num2+num3;
    }
    public static int sumOfNumbers (int num1, int num2, int num3, int num4){
        return num1+num2+num3+num4;
    }

//double
    public static double sumOfNumbers (double num1, double num2){
        return num1+num2;
    }
    public static double sumOfNumbers (double num1, double num2, double num3){
        return num1+num2+num3;
    }
    public static double sumOfNumbers (double num1, double num2, double num3, double num4) {
        return num1 + num2 + num3 + num4;
    }
}
