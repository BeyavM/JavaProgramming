package day08_IfStatements;

public class Cigarettes {

    public static void main(String[] args) {

        byte age = 19;

        boolean legalAge = age >= 21;

        if (legalAge) {
            System.out.println("Eligible for purchase");
        }
        if (!legalAge) {
            System.out.println("Not Eligible");
        }

    }

}
/* Given a number (byte) age, write a program that can check if the person is eligible to buy Cigarettes

 */