package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {

    public static void main(String[] args) {

        int[] arr = {10, 10, 20, 30, 40, 30, 30, 30};

        arr = replaceAll(arr, 30, 300); //the oldValue of 30 will now be replaced every time with the newValue 300

        System.out.println(Arrays.toString(arr)); //[10, 10, 20, 300, 40, 300, 300, 300]

        arr = replaceAll(arr, 300, 500);

        System.out.println(Arrays.toString(arr)); //[10, 10, 20, 500, 40, 500, 500, 500]

    }

    //replaces all the matching oldValue with newValue
    public static int[] replaceAll(int[] array, int oldValue, int newValue){
        for (int i = 0; i < array.length; i++) {

            if(array[i] == oldValue){
                array[i] = newValue;
            }

        }

        return array;

    } //(int)

    //replaces all the matching oldValue with newValue
    public static double[] replaceAll(double[] array, double oldValue, double newValue){
        for (int i = 0; i < array.length; i++) {

            if(array[i] == oldValue){
                array[i] = newValue;
            }

        }

        return array;

    } //(double)

    //replaces all the matching oldValue with newValue
    public static char[] replaceAll(char[] array, char oldValue, char newValue){
        for (int i = 0; i < array.length; i++) {

            if(array[i] == oldValue){
                array[i] = newValue;
            }

        }

        return array;

    } //(char)

    //replaces all the matching oldValue with newValue
    public static String[] replaceAll(String[] array, String oldValue, String newValue){
        for (int i = 0; i < array.length; i++) {

            if (array[i].equals( oldValue) ) {
                array[i] = newValue;
            }

        }

        return array;

    } //(String)


}
