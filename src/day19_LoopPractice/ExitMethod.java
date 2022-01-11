package day19_LoopPractice;

public class ExitMethod {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            if(i == 3){
               // break; only terminates the loop 0,1,2, Wooden Spoon
               // continue; //terminates the current iteration of the loop 0,1,2,4, Wooden Spoon
                System.exit(0); //terminates the program, regardless of what comes after
            }

            System.out.println(i);
        }

        System.out.println("Wooden Spoon");







    }

}
