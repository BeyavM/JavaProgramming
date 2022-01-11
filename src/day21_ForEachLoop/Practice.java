package day21_ForEachLoop;

public class Practice {

    public static void main(String[] args) {

        String str = "raindeer";
        int num = 4; //adds 7 'r' to our 'str'
        String newStr = "";
        String newerStr = "";

        for (int i = 0; i < num; i++) {
            newStr += str.charAt(7);
        }
        newerStr += str.substring(0, 7)+newStr;

        System.out.println(newerStr);

    }

}

/* Multiply End [String, Loops]
Given a String and a number return a String that has the ending character
duplicated and attached by the number amount of times
Ex:
Input:
Hello?
3
Output:
Hello????
Ex:
Input:
java
5
Output:
javaaaaaa

 */