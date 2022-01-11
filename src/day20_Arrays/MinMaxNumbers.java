package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxNumbers {

    public static void main(String[] args) {
//this method finds us the minimum number and the maximum number out of 10 numbers

        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number:");
            numbers[i] = scan.nextInt(); // each user entered input will be assigned to the indexes of the array numbers

        }

    int max = numbers[0];
    int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i] > max){
                max = numbers[i];
            }

            if(numbers[i] < min){
                min = numbers[i];
            }

        }

        System.out.println("numbers = " + Arrays.toString(numbers)); //prints the numbers inserted, ex: [1,2,3,4,5,6,7,8,9,10]
        System.out.println("min = " + min); //prints the minimum number
        System.out.println("max = " + max); //prints the maximum number


    }

}