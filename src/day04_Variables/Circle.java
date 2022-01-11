package day04_Variables;

import javax.lang.model.SourceVersion;

public class Circle {

    public static void main(String[] args) {
        //PI, radius, diameter, area, perimeter
        double PI = 3.14;
        double radius = 10;
        double diameter = radius * 2; //diameter is always radius * 2 (10 * 2), finds the diameter by multiplying radius by 2
        double area = radius * radius * PI; // area is found by multiplying radius * radius * PI (10 * 10 * 3.14)
        double perimeter = diameter * PI; // finds the perimeter of the circle (10 * 2 * 3.14)

        System.out.println("PI = " + PI);
        System.out.println("radius = " + radius);
        System.out.println("diameter = " + diameter);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);


    }

}
/* Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
                    Hints:  PI = 3.14
                            area = radius * radius * PI
                            Perimeter = 2 * radius * PI */