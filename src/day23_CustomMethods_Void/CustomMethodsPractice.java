package day23_CustomMethods_Void;

public class CustomMethodsPractice {

    public static void helloWorld5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }
    }//prints "Hello World!" 5 times

    public static void helloCydeo5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo!");
        }
    }//prints "Hello Cydeo!" 5 times

    public static void oneToTenOdd(){
        for (int i = 1; i < 11; i+= 2) {
            System.out.println(i + " ");
        }
    }//prints odd numbers from '1-10'

    public static void oneToTenEven(){
        for (int i = 2; i < 11; i+= 2) {
            System.out.println(i + " ");
        }
    }//prints even numbers from '1-10'

    public static void main(String[] args) {

        helloWorld5Times(); //prints "Hello World!" 5 times.
        System.out.println();
        helloCydeo5Times(); //prints "Hello Cydeo!" 5 times.
        System.out.println();
        oneToTenOdd(); //prints all odd numbers between 1-10.
        System.out.println();
        oneToTenEven();//prints all even numbers between 1-10.



    }




}
