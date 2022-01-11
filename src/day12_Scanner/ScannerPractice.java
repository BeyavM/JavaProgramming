package day12_Scanner;
//import java.util.*; //wild import: imports everything from the package
import java.util.Scanner; //regular import: imports one class

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Grade: ");

        int num = scan.nextInt();

        String result = "";

        if(num >= 0 && num <= 100) {

           result = (num>=90)? "A" :(num>=80)? "B" :(num>=70)? "C" :(num>=60)? "D" : "F";
        }else{
            result = "Invalid Grade";
        }
        System.out.println(result);

        System.out.println("------------------------------------------------------------------------");

        scan.close();

    }


}
