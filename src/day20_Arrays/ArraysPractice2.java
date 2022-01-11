package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {

    public static void main(String[] args) {

        char[] letters = new char[26];

     /* letters[0] = 'A';
        letters[1] = 'B';
        letters[2] = 'C'; */

        /* for (int i = 0, j = 'A'; i < letters.length; i++, j++) {     //i: index numbers 0 - last index
            letters[i] = (char)j;      //this is how we cast j to letters[i] since it is a char

        }

        System.out.println(Arrays.toString(letters)); */

        char ch = 'A';
        for (int i = 0; i < letters.length; i++) {
            letters[i] = ch++;
        }

        System.out.println(Arrays.toString(letters)); //[A-Z]

        System.out.println("-------------------------------------------------------");

        for(char i = 'A', j = 0; i <= 'Z' && j < letters.length; i++, j++){ //variable i and j are both char, and both in the same for loop
           letters[j] = i;
        }

        System.out.println(Arrays.toString(letters)); //[A-Z]

        System.out.println("-------------------------------------------------------");






    }

}
