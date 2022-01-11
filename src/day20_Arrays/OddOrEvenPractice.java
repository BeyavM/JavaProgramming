package day20_Arrays;

import java.util.Scanner;

public class OddOrEvenPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num1 = scan.nextInt();

        if(num1 % 2 == 0 && num1 != 0){
            System.out.println("This is an even number");
        }else if(num1 % 2 != 0){
            System.out.println("This is an odd number");
        }else{
            System.out.println("Zero");
        }








    }

}
