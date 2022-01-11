package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

public class Test2 {

    public static void main(String[] args) {

//int
        int[] arr1 = {1,2,3,4,5};
        ArraysUtility.printEachElement(arr1);

        System.out.println("--------------------------");
//double
        double[] arr2 = {1.5, 2.5, 3.5, 4.5};
        ArraysUtility.printEachElement(arr2);

        System.out.println("--------------------------");
//char
        char[] arr3 = {'A', 'B', 'C', 'D'};
        ArraysUtility.printEachElement(arr3);

        System.out.println("--------------------------");
//String
        String[] arr4 = {"Michael", "Sonny", "Fredo", "Tom"};
        ArraysUtility.printEachElement(arr4);

        System.out.println("--------------------------");

//MaxNumber (Int)
        int[] n1 = {10, 43, 16, 270, 144, 18};
        int num1 = ArraysUtility.max(n1);

        System.out.println("max = " + num1);

        System.out.println("--------------------------");

//MaxNumber (double)
        double[] n2 = {12.5, 32.7, 4.9, 62.5, 20.3};
        double num2 = ArraysUtility.max(n2);

        System.out.println("max = " + num2);

        System.out.println("--------------------------");














    }

}
