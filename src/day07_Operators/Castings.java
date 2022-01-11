package day07_Operators;

public class Castings {

    public static void main(String[] args) {

        float averageScore = 20.5f;


        byte num1 = (byte)averageScore; //this is explicit casting, explicit is when you assign a larger primitive type to a smaller primitive type
        System.out.println("num1 = " + num1); //even though the number is 20.5, the outcome will only be 20, as they aren't decimal primitives like float and double are

        short num2 = (short)averageScore; //explicit casting
        System.out.println("num2 = " + num2);                           //remember
                                                                        //implicit: smaller primitive assigned to a larger primitive
        int num3 = (int)averageScore; //explicit casting                //explicit: larger primitive assigned to a larger primitive
        System.out.println("num3 = " + num3);

        long num4 = (long)averageScore; //explicit casting
        System.out.println("num4 = " + num4);

        float num5 = averageScore; //no casting, implicit (there was no () needed )
        System.out.println("num5 = " + num5);

        double num6 = averageScore; //no casting, implicit (there was no () needed )
        System.out.println("num6 = " + num6);


    }

}
/* warmup task:
    create a class named Castings
    declare a variable of float named 'averageScore' and initialize it to 20.5
    declare the following variables and assign 'averageScore' to each of them:
                byte num1;
                short num2;
                int num3;
                long num4;
                float num5;
                double num6;
 */