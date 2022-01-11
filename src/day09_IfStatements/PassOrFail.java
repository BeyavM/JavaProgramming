package day09_IfStatements;

public class PassOrFail {

    public static void main(String[] args) {

        int score = 97;

        if (score >= 60) {
            System.out.println(score + ":" + " Congratulations, you passed!");
        }else {
            System.out.println(score + ":" + " Failed.");
        }

    }

}
