package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray {
    //outcome of created custom method
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        arr = addInteger(arr, 5); //{1,2,3,4,5};

        System.out.println(Arrays.toString(arr)); //1 to 5 has been added

        System.out.println("----------------------------------------");

        double[] arr2 = {1.5, 2.5, 3.5, 4.5}; //5.5
        arr2 = addDouble(arr2, 5.5); //{1.5, 2.5, 3.5, 4.5, 5.5};

        System.out.println(Arrays.toString(arr2));

        System.out.println("----------------------------------------");

        String[] names = {"Tatiana", "Oleksandr", "Cassandra", "Ali"}; //"Neira"

        names = addString(names, "Neira"); //{"Tatiana", "Oleksandr", "Cassandra", "Ali", "Neira"};

        System.out.println(Arrays.toString(names));

        System.out.println("----------------------------------------");

        char[] chars = {'A', 'B', 'C', 'D'}; //'E'
        chars = addChar(chars, 'E'); //'A', 'B', 'C', 'D', 'E'

        System.out.println(Arrays.toString(chars));

    }

    //created custom method

    //1. create a return method called addInteger that can add an Integer  after the  last index of an integer array
    public static int[] addInteger(int[] array, int element) { //we must do int[] since we are using int arrays
        int[] result = new int[array.length + 1]; //we do +1 at the end of array.length, so it can contain the element as well

        int i = 0; //this 'i' represents the indexes of the new array
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element; //whatever the number of 'i' is will be the last index

        return result;
    }

    //2. create a return method called addDouble that can add a double after the last index of a double array
    public static double[] addDouble(double[] array, double element){
        double[] result = new double[array.length + 1];

        int i =0;
        for (double each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }

    //3. create a return method called addString that can add a String after the last index of a String array
    public static String[] addString(String[] array, String element) { //these two parameters must be created, or the method could never finish its function
        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;

    }

    //4. create a return method called addchar that can add a char after last index of a char array
    public static char[] addChar(char[] array, char element) { //these two parameters must be created, or the method could never finish its function
        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;

    }
}
/* 1. create a return method called addInteger that can add an Integer  after the  last index of an integer array

        2. create a return method called addDouble that can add a double after the last index of a double array

        3. create a return method called addString that can add a String after the last index of a String array

        4. create a return method called addchar that can add a char after last index of a char array */