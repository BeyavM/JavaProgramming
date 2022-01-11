package day27_WrapperClasses;

import java.util.Arrays;

public class WrapperClassesIntro {

    public static void main(String[] args) {

        int num1 = 200;

        Integer n1 = num1; //autoboxing

        int num2 = n1; //unboxing

        System.out.println("--------------------------------------------------");

        Integer integerValue = 100;

        long longValue = integerValue; //primitives accept any wrapper value as long as it is in range

        Byte b1 = 25;

        byte a1 = b1;
        short a2 = b1;
        int a3 = b1;
        long a4 = b1;


        System.out.println("--------------------------------------------------");

        int num3 = 200;

        //Long l2 = num3; these two examples are what you can't do
        //Double d1 = num3;

        Integer num4 = num3; //autoboxing

        System.out.println("--------------------------------------------------");

        Integer z = 900;
        Integer y = z; //since y is reassigned to wrapper class again, it remains autoboxing

        System.out.println("--------------------------------------------------");

        int[] numbers1 = {1,2,3,4,5};
        Integer[] numbers2 = {1,2,3,4,5};



    }

}
