package day07_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {

        //Assignment: =
        int number = 100;

        System.out.println("number = " + number); //100

        number = 200; //java works form down to bottom, since I updated the value of the variable 'number' it now runs as 200, rather than running as 100

        System.out.println("number = " + number); //200

        String word = "Java programming"; //you could do the same with String

        System.out.println("word = " + word); //Java Programming

        word = "Wooden Spoon";

        System.out.println("word = " + word); //Wooden Spoon

        word = "Cydeo";

        System.out.println("word = " + word); //Cydeo

        System.out.println("------------------------------------------");

// Addition and Subtraction assignment:
            int x = 100;

        System.out.println("x = " + x); //100

        //x = x + 200;
        x += 200;

        System.out.println("x = " + x);

        String str = "Wooden";

        str += " Spoon"; //concatenation, += is the only shortHand operator that can be applied to string

        System.out.println("str = " + str);

        double num1 = 2.5;

        num1 += 5.5;

        System.out.println("num1 = " + num1);

        double availableBalance = 1000.50;
        //deposit 300
        availableBalance += 300.00; //1300.50

        System.out.println("availableBalance = " + availableBalance);

        System.out.println("------------------------------------------");

        //withdrawing 500.00

        availableBalance -= 500; //availableBalance = 1300.5 - 500 = 800.5 end balance

        System.out.println("availableBalance = " + availableBalance);//800.5 end balance

        //withdrawing 200, then depositing 400

        availableBalance -= 200; //withdrew 200

        System.out.println("availableBalance = " + availableBalance);//600.5 end balance

        availableBalance += 400; //deposited 400

        System.out.println("availableBalance = " + availableBalance);//1000.5 end balance

        System.out.println("------------------------------------------");
//Multiplication assignment:

        double salary = 50000.50;
        salary *= 2; //salary = salary * 2 <== this is the longer way to write it

        System.out.println("salary = " + salary); //100001.0

        double doge = 0.00000048;//fractions of a cent
        doge *= 1000000; //grew by a million

        System.out.println("doge = " + doge); // hits 0.48 cents

        System.out.println("------------------------------------------");
//Division assignment:

        double num2 = 25000; //25000.0
        num2 /= 2; //divides by 2

        System.out.println("num2 = " + num2); //12500.0

        System.out.println("------------------------------------------");

        double num3 = 100;

//Remainder assignment

        num3 %= 3; // remainder is 1

        System.out.println("num3 = " + num3);

        System.out.println("------------------------------------------");

        int amount = 127; //cents

        int quarters = amount / 25;
        int cents = amount % 25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        System.out.println("------------------------------------------");

        int cents2 = 127;

        cents2 %= 25;

        System.out.println("cents2 = " + cents2);

        System.out.println("------------------------------------------");

        int y = 300;

        y %= 16;

        System.out.println("y = " + y); //remainder is 12

        System.out.println("------------------------------------------");

        int balance = 3500;

        //insurance fee: 153 dollars

        balance %= 153;

        System.out.println("balance = " + balance); //remaining balance is 134 dollars


    }

}
