package day17_While_DoWhile;

import java.util.Scanner;

public class MarriageProposal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Will you marry me?");
        String yes = scan.next().toLowerCase();
        String no = scan.next().toLowerCase();

        while( !(yes.equals("yes") || yes.equals("no"))){
            System.out.println("Come again?");
            yes = scan.next().toLowerCase();
        }

        if(yes.equals("yes")){
            System.out.println("Congrats!");
        }else{
            System.out.println("Maybe it was the wrong time, ask again?");
        }



    }

}
