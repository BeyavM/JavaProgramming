package day25_CustomMethod_Overloading;

public class MainMethodOverloading {

    public static void main(String[] args) {
        System.out.println("String");
    }

    public static void main(int[] args) {
        System.out.println("int");
    }

    public static void main(double[] args) {
        System.out.println("double");
    }

    public static void main(char[] args) {
        System.out.println("char");
    }
}
//main method can be overloaded however if you run right now, only the first method "String" would be printed