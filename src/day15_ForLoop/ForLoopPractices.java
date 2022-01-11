package day15_ForLoop;

public class ForLoopPractices {

    public static void main(String[] args) {

        //15 16 17 18.... 45

        for(int i = 15; i <= 45; i ++) {//15 16 17 18.... 45 ( >=, <=, >, < )
            System.out.print(i + " "); //15 16 17 18.... 45
            }
            System.out.println(); // a space for when you use System.out.print(); previously
            System.out.println("End of 'for int i'");

        System.out.println("---------------------------");

        for(int j = 100; j >= 50; j --){ //100, 99, 98, 97.... 50 ( >=, <=, >, < )
            System.out.print(j + " "); //100, 99, 98, 97.... 50
            }
            System.out.println(); // a space for when you use System.out.print(); previously
            System.out.println("End of 'for int j'");

        System.out.println("---------------------------");
        //print only even numbers from 1 to 55
        for(int k = 1; k <= 55; k ++){ //2, 4, 6, 8.... 54
            if(k % 2 == 0){ //'if k can be evenly divided by 55 with a remainder of 0, then it is even'
                System.out.print(k + " "); //2, 4, 6, 8.... 54
            }
        }
        System.out.println();
        System.out.println("End of 'for int k, only even numbers");

        System.out.println("---------------------------");

        for(int i = 2; i <= 54; i += 2){ //another way to find the even numbers only between 1 and 55
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("End of ' for int i, only even numbers");


    }

}
