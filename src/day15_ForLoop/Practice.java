package day15_ForLoop;

import day02_HelloWorld.SystemOutPrintPractice;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        int max = -2147483648;
        int min = 2147483647;

        int count = 1;

        Scanner scan = new Scanner(System.in);

        while(count <= 5){
            count++;

            System.out.println("Enter a number:");

            int numbers = scan.nextInt();

            if(numbers > max){
                max = numbers;
            }

            if(numbers < min){
                min = numbers;
            }

        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);



    }

}
