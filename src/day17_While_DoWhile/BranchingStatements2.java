package day17_While_DoWhile;

public class BranchingStatements2 {

    public static void main(String[] args) {
//continue; statement
        for (char i = 'A'; i <= 'E'; i++) {
            if(i == 'C'){ //will skip 'C' when printed,
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("----------------------------------------------------------------------------------------------------------");
//even numbers
        for (int i = 0; i < 50; i++) {
            if(i % 2 != 0){
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("----------------------------------------------------------------------------------------------------------");
//odd numbers
        for (int i = 0; i < 50; i++) {
            if(i % 2 == 0){
                continue;
            }
            System.out.print(i + " ");
        }





    }
}
