package day10_NestedIf;

public class TernariesWithNestedIf {

    public static void main(String[] args) {

        int s = 96;

       String result =  (s >= 0 && s <= 100)? (s >=60)? "Passed" : "Failed" : "Invalid Score" ;  //ternary example with nested if
        System.out.println(result);

        /*  if (s >= 0 && s <= 100) {


            if(s >=60){
                System.out.println("Pass");
            }else{
                System.out.println("Fail");
            }

        }else{
            System.out.println("Invalid Score");
        }
*/  //if statement with nested if



    }
}
