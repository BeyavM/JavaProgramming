package day04_Variables;

public class Square {

    public static void main(String[] args) {

        //DataType variableName - Data;
        //area = side * side
        //perimeter = 4 * side

        double side = 8.5; // 8.5 is now 'side'
        double area = side * side; // any time you use 'side' the number 8.5 takes place of the word 'side'
        double perimeter = 4 * side; //4 * 8.5

        System.out.println("side = " + side);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
    }

}

/* 1. Create a class named Square, write a program that can calculate the area & perimeter of any given square
                        side
                        area = side * side;
                        perimeter = 4 * side */