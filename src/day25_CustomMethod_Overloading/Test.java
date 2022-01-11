package day25_CustomMethod_Overloading;

import utilities.StringUtility;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
//printEachChar
        String str = "Java Programming Language";

        StringUtility.printEachChar(str);

System.out.println("--------------------------------");
//reverse
        String s1 = "Wooden Spoon";

        String reverse = StringUtility.reverse(s1);

        System.out.println(reverse);

System.out.println("--------------------------------");
//isPalindrome
        String word = "civic";

        boolean palindrome = StringUtility.isPalindrome(word);

        System.out.println(palindrome);

        //------------------------------------------

        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};

        int count=0;

        for (String each : names) {
            if (StringUtility.isPalindrome(each)) {
                count++;
            }
        }
        System.out.println(count);

System.out.println("--------------------------------");
//removeDuplicates
        String s2 = "aaaaaabbbbbbbbcccccdddd";

        String nonDupe = StringUtility.removeDuplicates(s2);

        System.out.println(nonDupe); //abcd










    }

}

