package day09_IfStatements;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 1000,
            b = 2500,
            c = 1750;
//if we have three different numbers, one MUST be maximum, one MUST be minimum, and one MUST be median

        boolean poss1 = (a > b && a < c) || (a > c && a < b);//"if a is greater than b and also a is less than c || if a is greater than c and also a is less than b
        boolean poss2 = (b < a && b > c) || (b > a && b < c);//"if b is less than a and also b is greater than c || if b is greater than a and also b is less than c
        boolean poss3 = (c < a && c > b) || (c > a && c < b);//"if c is less than a and also c is greater than b || if c is greater than a and also c is less than b

//for boolean poss3 you could also write 'boolean poss3 = !poss1 && !poss2;'

        if (poss1) {
            System.out.println(a + " is the median number");
        }
        if (poss2) {
            System.out.println(b + " is the median number");
        }
        if (poss3) {
            System.out.println(c + " is the median number");
        }

    }

}
/* Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

            Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number

 */