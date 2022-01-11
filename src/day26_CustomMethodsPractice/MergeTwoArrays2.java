package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArrays2 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};

        int[] arr3 = merge(arr1, arr2); //merges arr1 and arr2

        System.out.println(Arrays.toString(arr3)); // merges arr1 and arr2 {1,2,3,4,5,6,7,8};

    }


    public static int[] merge(int[] arr1, int[] arr2){

        int[] result = {}; //temporary array

         for (int each : arr1){ //for each loop used to get each element for the array
             result = ArraysUtility.addElement(result, each); //this addElement method adds the element to the given array, returns new array, assign it back using 'result'
         }
        for (int each : arr2){ //for each loop used to get each element for the array
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }

}
