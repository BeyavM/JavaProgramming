package day13_String;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name: "); //beyav
        String firstName = scan.next();

        System.out.println("Enter your last name: "); // muhsen
        String lastName = scan.next();

        char f = firstName.charAt(0);
        char l = lastName.charAt(0);

        String initial = f + "." + l; //you can also use a blank quotation so it could read as a concatenation, for this instance I didn't need to
        System.out.println(initial); //returns first and last initials

    }

}
