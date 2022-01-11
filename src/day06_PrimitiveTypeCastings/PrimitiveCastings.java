package day06_PrimitiveTypeCastings;

import com.sun.security.jgss.GSSUtil;

public class PrimitiveCastings {

    public static void main(String[] args) {
        //implicit casting (smaller primitive types to larger primitive types)
        byte a = 100;
        short b = a; //short is in grey because you don't have to put (short) for it to read that short b = a; as a short is bigger than a byte
        // short b = (short)a;                                                                              //ex: just write 'short b = a;'
        //        (short) a
        int c = b;
        // int c = (int)b;
        long d = c;
        //      (long)c
        float e = d;
        double f = e;

        System.out.println("---------------------------------------------------------------------");

        //explicit casting (larger primitive types to smaller primitive types)
        int x = 55;
        short y = (short)x; //with explicits, you HAVE to put the casting operator (short) before 'x' for this example.
        System.out.println(x + " : " + y);

        long j = 1000000L; //here is an example of what happens when you put a number too big for a variable (1000000 into short, shorts limit is 32,767 approx.)
        short k = (short)j;
        System.out.println(j + " : " + k); //you get 1000000 : 16960

        double l = 2.5; //since double is a larger primitive than float, we have to put float in parenthesis before 'l' ==> (float)l;
        float m = (float)l; //l needs to be casted to float
        System.out.println(l + " : " + m);

        double n = 10.8;
        //int s = (int)(long)n;this way could make it work but its extra work, you set long to double, then long to int.
        int s = (int)n;//when doing this, since int isn't a double of a float, it will only carry over the 10, and not the .8 from n
        System.out.println(n + " : " + s);

        System.out.println("---------------------------------------------------------------------");

        double d1 = 20.5;
        short s1 = (short) d1; //SHORTCUT: hold alt and press enter to cast short to double instantly

        /* double d1 = 20.5;
           short s1 = d1; //when here, after the ';' hold alt and press enter to cast 'double' to 'short' */
        System.out.println(d1 + " : " + s1); //will print the short part out with only the integers

        float f1 = 30.5F;
        long l1 = (long) f1;
        System.out.println(f1 + " : " + l1);

    }

}
