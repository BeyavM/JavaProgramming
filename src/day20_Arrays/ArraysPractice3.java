package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice3 {

    public static void main(String[] args) {

        //this creation asks us how many numbers we would like to enter, and then shows us the numbers we input into the Scanners

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int length = scan.nextInt(); //EX: 10,

        if(length <= 0){ //if the number is 0 or a negative number, it will print error message "Invalid Entry" and will exit the Scanner
            System.err.println("Invalid Entry");
            System.exit(0);
        }

        int[] numbers = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt(); //each input the user provided during each execution of the loop will be assigned to the indexes of the array
        }

        System.out.println(Arrays.toString(numbers));

        scan.close();



    }

}
