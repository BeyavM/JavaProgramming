package day21_ForEachLoop;

import java.util.Arrays;

public class AnagramInterviewTask {

    public static void main(String[] args) {
//this creation will tell us if our str1 and str2 contain the exact same alphabets, or 'anagram' so that when sorted, they are exactly the same
        String str1 = "acdb";
        String str2 = "dbca";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println();

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        boolean anagram = Arrays.equals(ch1, ch2);

        System.out.println();

        System.out.println("anagram = " + anagram);

        //write a program that can check if str1 and str2 are built out same characters





    }

}
