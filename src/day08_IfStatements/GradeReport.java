package day08_IfStatements;

public class GradeReport {

    public static void main(String[] args) {

        int score = 95;

        boolean A = score >= 90 && score <= 100;
        boolean B = score >= 80 && score <= 89; // score >= 80 && !a            <=== another way to write it
        boolean C = score >= 70 && score <= 79; // !a && !b && score >= 70      <=== another way to write it
        boolean D = score >= 60 && score <= 69;
        boolean F = score < 60; // score >= 0 && score <= 59                    <=== another way to write it

        if (A) {  //if the student made A
            System.out.println(score + " = Excellent");
        }
        if (B) { //if the student made B
            System.out.println(score + " = Great");
        }
        if (C) { //if the student made c
            System.out.println(score + " = Good");
        }
        if (D) { //if the student made d
            System.out.println(score + " = Pass");
        }
        if (F) { //if the student made f
            System.out.println(score + " = Fail");
        }

    }

}
/*
    90 - 100 ==> Excellent
    80 - 89 ==> Great
    70 - 79 ==> Good
    60 - 69 ==> Pass
    0 - 59 ==> Fail

 */