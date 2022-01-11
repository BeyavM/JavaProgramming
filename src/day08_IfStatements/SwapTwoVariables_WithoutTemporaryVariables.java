package day08_IfStatements;

public class SwapTwoVariables_WithoutTemporaryVariables {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        a += 5;
        b -= 5;

        System.out.println("a = " + a); //a = 15
        System.out.println("b = " + b); //b = 10
    }

}
