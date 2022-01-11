package day17_While_DoWhile;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username:");
        String u = scan.next();

        System.out.println("Enter your password");
        String p = scan.next();

        if(u.equals("Beyav1256") && p.equals("50Cent1256")){
            System.out.println("Logged in");
        }else {
            int attempts = 3;

            while( !(u.equals("Beyav1256") && p.equals("50Cent1256")) && attempts > 0) { //while the credentials are invalid and the user still has attempts
                System.out.println("Incorrect Username or Password, Please re-enter");
                System.out.println("Enter your username:");
                u = scan.next();
                System.out.println("Enter your password");
                p = scan.next();
                attempts--;
            }

            if(u.equals("Beyav1256") && p.equals("50Cent1256")) {
                System.out.println("Logged in");
            }else{
                System.out.println("No more attempts can be made");
            }

        }

        scan.close();



    }

}
/* you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is lucked."


 */