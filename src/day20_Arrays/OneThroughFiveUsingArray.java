package day20_Arrays;

import java.util.Arrays;

public class OneThroughFiveUsingArray {

    public static void main(String[] args) {

        int a = 0;

        int[] arr = {1, 2, 3, 4 ,5};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if(i == 2){
                a = arr[i];
            }
        }

        System.out.println(a);


    }
}
