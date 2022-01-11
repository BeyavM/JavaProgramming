package day10_NestedIf;

public class GradeReport {

    public static void main(String[] args) {

        double grade = 79;

        if (grade >= 0 && grade <= 100) {

            if (grade >= 90 && grade <= 100){
                System.out.println(grade + ": Excellent");
            } else if (grade >= 80 && grade <= 89) {
                System.out.println(grade + ": Great");
            } else if (grade >= 70 && grade <= 79) {
                System.out.println(grade + ": Good");
            } else if (grade >= 60 && grade <= 69) {
                System.out.println(grade + ": Passed");
            }else{
                System.out.println(grade + ": Failed");
            }

        }else{
            System.out.println("Invalid Grade");
        }


    }


}
