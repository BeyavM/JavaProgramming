package day17_While_DoWhile;

public class DoWhileIntro {

    public static void main(String[] args) {

        boolean a = false;
//for
        for (int i = 0; a;) { //with For, since condition is false, it will never run 'Wooden Spoon'
            System.out.println("Wooden Spoon -- for loop"); //will not run, condition is false
        }
        System.out.println("-------------------------------------------");
//while
        while(a){ //with While, since condition is false, it will never run 'Wooden Spoon'
            System.out.println("Wooden Spoon -- while loop"); //will not run, condition is false
        }

        System.out.println("-------------------------------------------");
//do while
        do{ //with Do... While, it checks the condition 'false' after it runs 'Wooden Spoon'
            System.out.println("Wooden Spoon -- do-while loop"); //the only one that will run even though condition is false
        }while(a);


    }

}
