package day15_ForLoop;

import java.util.Scanner;

public class SumOfMultipleNumbers {

    public static void main(String[] args) {
        
     double sum = 0;
     // +1 +2 +3 ... +100
        for (int i = 1; i < 101; i++) { //i: 1, 2, 3, 4, 5, 6.... 100
            sum += i;
        }

        System.out.println(sum); //total number of 1-100 all added together one by one '+1 +2 +3 ... +100'

        System.out.println("--------------------------------------------------");

//this formula here will take 5 sums and add them all together using scanner
     int total = 0;
     Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number:"); //this message will appear in scanner 5 times, enter 5 different sums and they will be added together
            total += scan.nextInt();

        }

        System.out.println("total = " + total); //this print statement prints the total sum of the 5 numbers




        scan.close();

    }

}
