package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {

    public static void main(String[] args) {
        System.out.println("12" + 1); //121 //concatenation, not addition

        System.out.println(10 + 20); //30, addition //not to be confused with concatenation
        System.out.println(100 - 50); //50, subtraction
        System.out.println(10 * 6); //60, multiplication

        //division is a bit different
        System.out.println(100 / 3); //if I leave it this way, my outcome will not contain a decimal, the answer will be 33.
        System.out.println(100.0 / 3); //if I write it this way, I will get a decimal answer, it will be 33.33333333 etc..
        System.out.println(100 / 3.0); //it doesn't matter which has a decimal, but in order to get a decimal result, a decimal is needed, otherwise both are read as int
        System.out.println(100d / 3d); // here is another way to get a decimal result. d in java lets it know to give a decimal result
        // integer / integer ==> integer  //this is the only way you wont get a decimal result, using two integers
        // decimal / integer ==> decimal
        // integer / decimal ==> decimal
        // decimal / decimal == decimal

        int a = 100;
        double b = a/6; //this will return you 16, as it's an integer, to get a decimal result, add a 'd' after 6.
        System.out.println(b); //integer result, 16
        double c = a/6.0; //this result gives us a decimal because we added the 'd'
        System.out.println(c); //decimal result, 16.6666666 etc...
        double d = a/6d; //this result gives us a decimal because we added the 'd'
        System.out.println(d); //decimal result, 16.6666666 etc...
        double e = (double) a/6; //this result gives us a decimal because we added the 'd'
        System.out.println(e); //decimal result, 16.6666666 etc...

        //to use the % (remainder) all you have to do is this
        System.out.println(10%4);//this means that since 4 can't perfectly divide 10 by 4, you will be left with 2 left
        System.out.println(50%11);// since 11 only can go into 50 4 times, 6 was left
        System.out.println(100%33);//you are left with 1 since 33 can go into '100' 3 times only
        System.out.println(25%12.6);//you are left with 12.4
    }

}

/*

    +:Addition
    -:Subtraction
    *:Multiplication
    /:Division
        in math:
            10/4 = 2.5
        in java:
            10/4 = 2 (they are read as integer numbers (int) )
            10.0/4 = 2.5 //in java you will only get a decimal result if either the numerator or denominator are decimal, at least one of them must be a decimal as shown
    %:Remainder

 */
