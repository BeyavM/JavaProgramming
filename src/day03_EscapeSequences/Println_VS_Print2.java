package day03_EscapeSequences; //it's Package name of the class

import day02_HelloWorld.SystemOutPrintPractice;

public class Println_VS_Print2 {

    public static void main(String[] args) { //main method

        System.out.println("Knock Knock."); // (println) first it prints 'Knock Knock' then it appends a new line
        System.out.println("Who's there?");
        System.out.println("It's Java.");
        System.out.println();
        System.out.print("Knock knock."); // (print) prints 'Knock Knock' and does not append a new line, continues on the same line
        System.out.print(" Who's there?");
        System.out.print(" It's Java.");
        System.out.println();
        System.out.println();
        System.out.println("Hello everyone, how are you all today? Today we will learn Escape Sequences, and next week we will learn Variables.");
        System.out.println();
        System.out.print("Hello everyone, how are you all today?");
        System.out.print(" Today we will learn Escape Sequences,");
        System.out.print(" and next week we will learn Variables.");


    }


}

//single line comments appear like this

/* multi line comments start like this, and end like this

 */