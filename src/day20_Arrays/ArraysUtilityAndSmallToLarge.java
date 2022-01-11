package day20_Arrays;

import java.util.Arrays;

public class ArraysUtilityAndSmallToLarge {

    public static void main(String[] args) {

        int[] numbers = {10, 9, 0, 1, 2, 20, 4, 6, 7, 8};

        System.out.println(Arrays.toString(numbers)); //10, 9, 0, 1, 2, 20...

        Arrays.sort(numbers); //sorts the array in ascending order (smallest to largest)

        System.out.println(Arrays.toString(numbers)); // 0, 1, 2, 4, 6, 7...


    }

}
