package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElements2 {
    public static void main(String[] args) {


        int[] numbers = {100, 200, 300, 400, 500, 600};
        //                0    1    2    3    4    5
        numbers = removeElement(numbers, 1); //removes whatever index we input (0-5) {100, 300, 400, 500, 600};

        numbers = removeElement(numbers, 1); //since we previously removed the index 1, a new number has taken its place at index 1 (300 is now at index 1) now we can remove 300 from index 1

        System.out.println(Arrays.toString(numbers)); //{100, 400, 500, 600};

    }

    public static int[] removeElement(int[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        } //this part just ends the method if invalid

        int[] result = {};

        for (int i = 0; i < array.length; i++){ //i: arrays index number
            if(i != index){
               result = ArraysUtility.addElement(result, array[i]);
            }
        }
        return result;

    }

}
