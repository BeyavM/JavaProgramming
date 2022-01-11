package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray2 {

    public static void main(String[] args) {

//int[]
        int[] arr = {10}; //{10, 15};
        arr = add(arr, 15); //this will add the element 15 to our created 'arr' variable
        System.out.println(Arrays.toString(arr)); //[10, 15]

//double[]
        double[] arr2 = {10.5};
        arr2 = add(arr2, 16.5);
        System.out.println(Arrays.toString(arr2)); //[10.5, 16.5]

//String[]
        String[] arr3 = {"Michael"};
        arr3 = add(arr3, "Corleone");
        System.out.println(Arrays.toString(arr3)); //[Michael, Corleone]

//char[]
        char[] arr4 = {'A'};
        arr4 = add(arr4, 'B');
        System.out.println(Arrays.toString(arr4)); //[A, B]

    }

//int[]
    public static int[] add(int[] array, int element) { //we must do int[] since we are using int arrays
        int[] result = new int[array.length + 1]; //we do +1 at the end of array.length, so it can contain the element as well

        int i = 0; //this 'i' represents the indexes of the new array
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element; //whatever the number of 'i' is will be the last index

        return result;
    }
//double[]
    public static double[] add(double[] array, double element){
        double[] result = new double[array.length + 1];

        int i =0;
        for (double each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }
//String[]
    public static String[] add(String[] array, String element) { //these two parameters must be created, or the method could never finish its function
        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;

    }
//char[]
    public static char[] add(char[] array, char element) { //these two parameters must be created, or the method could never finish its function
        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;

    }

}
