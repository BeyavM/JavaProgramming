package day12_Scanner;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");

        double r = input.nextDouble();
//input.close(); <== i could close the scanner from this point, this is the last place I used it, but in case unsure, end the scanner at the end, as I did.
        double area  = r * r * 3.14; //radius * radius * pi
        double perimeter = 2 * r * 3.14; // 2 * radius * pi

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

        input.close(); //closes Scanner
    }

}
