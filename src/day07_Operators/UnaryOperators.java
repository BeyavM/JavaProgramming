package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int num1 = 25; //by default 25 is positive right now, there is no need to add '+'
        int num2 = -25; //this number is now a negative

        System.out.println(num1 < 0); //this is false because 25 isn't less than 25
        System.out.println(num2 < 0); //this is true because -25 is less than 0

        System.out.println("----------------------------------------------------------");

        int a = 5;
        ++a; //pre increment: increases the value by 1 right away

        System.out.println(a); //int a; becomes 6

        --a; //pre decrement: decreases the value by 1 right away

        System.out.println(a); // int a; becomes 5

        System.out.println("----------------------------------------------------------");

        int b = 100;

        System.out.println(++b); // pre increment: increases the value by 1 right away

        int c = 100;

        System.out.println(c++); //post increment: first passes the current value, then increases the value by 1 (post has 2 steps)
        System.out.println(c); //101

        System.out.println("----------------------------------------------------------");

        int x = 200;

        System.out.println(--x); //pre decrement: decreases the value by 1 right away

        int y = 200;

        System.out.println(y--); //post decrement: first passes the current value, then decreases the value by 1 (post has 2 steps)
        System.out.println(y); //199

        System.out.println("----------------------------------------------------------");
        //practice
        int z = 45;
        System.out.println(++z); //pre increment //46, z = 46 <== applies instantly
        System.out.println(z++); //post increment //46, z = 47 <== applies with result
        System.out.println(z); //47 <== result

        System.out.println("----------------------------------------------------------");
        //practice
        int q = 30;
        System.out.println(--q); //pre decrement //29, q = 29 <== applies instantly
        System.out.println(q--); //post decrement //29, q = 28 <== applies with result
        System.out.println(q); //28 <== the result


    }

}
