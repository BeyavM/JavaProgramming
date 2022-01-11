package day15_ForLoop;

public class Alphabet {

    public static void main(String[] args) {

//A ~ Z ===> 65-90 (ASCII table)
        for(int i = 65; i <= 90; i++){ //prints the alphabet in upper case
            System.out.print((char)i+ " "); //   A, B, C, D.... Z
        }

        System.out.println();
        System.out.println("-----------------------------------");

        for(char i = 'A'; i <= 'Z'; i++){ //prints the alphabet in upper case
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("-----------------------------------");

        for(char i = 'a'; i <= 'z'; i++){ //prints the alphabet in lower case
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("-----------------------------------");

        for(char i = 'Z'; i >= 'A'; i-- ){ //prints the alphabet in upper case backwards
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("-----------------------------------");

        for(char i = 'z'; i >= 'a'; i--){ //prints the alphabet in lower case backwards
            System.out.print(i + " ");
        }
    }

}
