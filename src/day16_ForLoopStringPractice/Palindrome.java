package day16_ForLoopStringPractice;

public class Palindrome {

    public static void main(String[] args) {

        String word = "Anna"; //a palindrome is a word that is the same flipped, case sensitivity aside.

        String reversed = "";

        for (int i = word.length()-1; i >= 0 ; i--) {
            reversed += word.charAt(i);
        }

        boolean isPalindrome = word.equalsIgnoreCase(reversed);

        System.out.println(isPalindrome);


    }

}
/* "Java" ==> "avaJ" ==> false (not palindrome) // (a palindrome is a word that is the same flipped, case sensitivity aside.)
   "Anna" ==> "annA" ==> true
   "Level" ==> "leveL" ==> true
   "Dad" ==> "daD" ==> true
   "Mom ==> "moM" ==> true

 */