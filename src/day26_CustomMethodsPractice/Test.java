package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        int[] arr1 = {10};
        int[] arr2 = {15};

        int[] z = merge(arr1, arr2);

        System.out.println(Arrays.toString(z));

    }

    public static int[] merge(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length + arr2.length];

        int i = 0;

        for (int each : arr1){
            result[i++] = each;
        }

        for (int each : arr2){
            result[i++] = each;
        }
        return result;
    }

}
