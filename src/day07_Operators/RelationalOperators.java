package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {
        // >, >=, <, <=

//Greater than (>)

        boolean result1 = 200 > 40; //true
        System.out.println("result1 = " + result1);

        System.out.println("--------------------------------------------------------------------------------------------");

//Greater than or equal (>=)

        boolean result2 = 300>= 150; //one of these are true, so the answer will come back as true
        System.out.println("result2 = " + result2);

        boolean result3 = 100 >= 100; //100 isn't bigger than 100, but it is equal to, therefore it will come back as true
        System.out.println("result3 = " + result3);

        boolean result4 = 300 >= 500;
        System.out.println("result4 = " + result4);

        //credit score of 720
        int creditScore = 745;
        boolean isEligibleForLoan = creditScore >= 720; //if the credit score is 720 or greater, then the person is eligible for a loan

        System.out.println("--------------------------------------------------------------------------------------------");

//Less than (<)

        boolean result5 = 100 < 120;
        System.out.println("result5 = " + result5); //true

        boolean result6 = 200 < 180;
        System.out.println("result6 = " + result6); //false

        System.out.println("--------------------------------------------------------------------------------------------");

//Less than or equal (<=)

        int score = 59;
        boolean hasFailed = score <= 59; //student failed the exam

        System.out.println("hasFailed = " + hasFailed);

        boolean result7 = 45 <= 60; //it met one of two requirements, therefore it is true
        System.out.println("result7 = " + result7);

        System.out.println("--------------------------------------------------------------------------------------------");

//Equal (==)

        int x = 100;
        int y = 200;

        boolean equal = x == y; //is 100 == 200
        System.out.println("equal = " + equal); //false

        boolean result8 = "Beyav" == "Good Guy"; //this statement is not equal
        System.out.println("result8 = " + result8);//false

        boolean result9 = 'A' == 'a'; //upper case and lower case are considered different characters on the ASCII table
        System.out.println("result9 = " + result9);  //false, JAVA is a case-sensitive program

        boolean result10 = "Java" == "Java"; //Java == Java , if there was a single difference, ex: Java == java, or spaces, the outcome would be false
        System.out.println("result10 = " + result10);//true

        //"Hello World" == "Hello world" = false

        System.out.println("--------------------------------------------------------------------------------------------");

//Not equal (!=)

        boolean result11 = 100 != 200.5; //100 is not equal to 200.5
        System.out.println("result11 = " + result11);//true

        boolean result12 = "Java" != "Break"; //are not equal values
        System.out.println("result12 = " + result12);//true

        boolean result13 = 300 != 300; //they are equal
        System.out.println("result13 = " + result13); //false



    }

}
