package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray_Overloading {

    public static int[] addElement(int[] array, int element) { //we must do int[] since we are using int arrays
        int[] result = new int[array.length + 1]; //we do +1 at the end of array.length, so it can contain the element as well

        int i = 0; //this 'i' represents the indexes of the new array
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element; //whatever the number of 'i' is will be the last index

        return result;
    }

    public static double[] addElement(double[] array, double element){
        double[] result = new double[array.length + 1];

        int i =0;
        for (double each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }

    public static String[] addElement(String[] array, String element) { //these two parameters must be created, or the method could never finish its function
        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;

    }

    public static char[] addElement(char[] array, char element) { //these two parameters must be created, or the method could never finish its function
        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;

    }

    //---------------------------------------------------------------------

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6}; //7
        numbers = addElement(numbers, 7);
        System.out.println("numbers = " + Arrays.toString(numbers));

        double[] numbersWithDecimals = {1.5, 2.3, 3.9, 4.1}; //5.4
        numbersWithDecimals = addElement(numbersWithDecimals, 5.4);
        System.out.println("numbersWithDecimals = " + Arrays.toString(numbersWithDecimals));

        String[] names = {"Ahmet", "Oleksandr", "Sinem", "Cihad"}; //"Layan"
        names = addElement(names, "Layan");
        System.out.println("names = " + Arrays.toString(names));

        char[] chars = {'A', 'B', 'C', 'D'}; //'E'
        chars = addElement(chars, 'E');
        System.out.println("chars = " + Arrays.toString(chars));



    }








}
