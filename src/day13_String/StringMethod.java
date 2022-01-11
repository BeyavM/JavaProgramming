package day13_String;

import java.util.Locale;

public class StringMethod {

    public static void main(String[] args) {
//.charAt();
        String word = "Cydeo";
        //index:       01234       maximum number: 4, minimum number: 0

        char Char = word.charAt(0);
        char firstChar = word.charAt(1);
        char secondChar = word.charAt(2);
        char thirdChar = word.charAt(3);
        char fourthChar = word.charAt(4);

        System.out.println("Char = " + Char); //C
        System.out.println("firstChar = " + firstChar); //y
        System.out.println("secondChar = " + secondChar); //d
        System.out.println("thirdChar = " + thirdChar); //e
        System.out.println("fourthChar = " + fourthChar); //o

        System.out.println("---------------------------------------");
//.length();
        String s1 = "Batch 25 is the best batch."; //highlight between the quotations, at the bottom left of intellij, it will tell you the characters in the quotes

        int totalCharacters = s1.length(); //will return us the total characters that are in String s1

        System.out.println("totalCharacters = " + totalCharacters); //there are 27 total characters in s1

        char lastChar = s1.charAt(s1.length()-1); //will print out the last character, "."

        System.out.println("lastChar = " + lastChar); //last char = .

        System.out.println("---------------------------------------");
//.toUpperCase(); & .toLowerCase();
        String str = "wooden spoon"; //once created, it is IMMUTABLE (unchangeable)
        str.toUpperCase(); //<== this will never modify the string above, it will create a new string "WOODEN SPOON";
        str = str.toUpperCase(); //"WOODEN SPOON"
        System.out.println(str);

        //Today is a great day to learn java programming language.
        String sentence = "Today is a great day to learn java programming language.";
        sentence = sentence.toUpperCase(); //if this is the case for .toUpperCase(); then it is the same for .toLowerCase();
        System.out.println(sentence);









    }

}
