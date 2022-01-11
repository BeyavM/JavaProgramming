package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {
//.toCharArray()
        String str = "Java";
        char [] chars = str.toCharArray();

        System.out.println(Arrays.toString(chars)); //prints [J, a, v, a]

        for(char each : chars){
            System.out.println(each); //prints J a v a (in new lines)
        }

        System.out.println("-----------------------------------------------");
//.split()
        String sentence = "Wooden Spoon";

        String[] words = sentence.split(" "); //separates at space

        System.out.println(Arrays.toString(words)); //prints [Wooden, Spoon]

        System.out.println("-----------------------------------------------");

        String email = "WoodenSpoon@cydeo.com";

        String[] arr = email.split("@");

        System.out.println(Arrays.toString(arr)); //prints [WoodenSpoon, cydeo.com]

        System.out.println("-----------------------------------------------");
//.split() separating at dots '.'
        String s = "Today is nice day. Today is Monday. Today we learn Java.";

        String[] sentences = s.split("\\. "); //to split sentences with a dot, you MUST use '\\.' the double forward slash

        System.out.println(Arrays.toString(sentences));






    }

}
