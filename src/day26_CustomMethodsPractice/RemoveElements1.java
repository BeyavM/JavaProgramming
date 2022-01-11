package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElements1 {

    public static void main(String[] args) {
//practice with created method
        int[] numbers = {100, 200, 300, 400, 500, 600};
        //                0    1    2    3    4    5
        numbers = removeElement(numbers, 1); //removes whatever index we input (0-5) {100, 300, 400, 500, 600};

        numbers = removeElement(numbers, 1); //since we previously removed the index 1, a new number has taken its place at index 1 (300 is now at index 1) now we can remove 300 from index 1

        System.out.println(Arrays.toString(numbers)); //{100, 400, 500, 600};

    }

    //created methods

    //removes the index from the array, returns new array
    public static int[] removeElement(int[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        int[] result = new int[array.length-1];

        int j = 0;
        for (int each : array) {
            if(each == array[index]){ //if the element of array is matching with the element at given index
                continue; //skip
            }
            result[j++] = each;
        }
        return result;
    }



}
/* Create a class named RemoveElements:
            2.1 Create a method that passes two parameters: an integer array and an integer index. the method removes the element at the given index of the array and returns the new array
                    Ex:
                        int[] arr = {10,20,30,40}
                        remove(arr, 2) ==> {10, 20, 40} */