package day08_IfStatements;

public class LogicalOperators {

    public static void main(String[] args) {
//Logical AND (both) (&&)
        String name = "Daniel";
        int age = 34; //age must be 18 or older to vote
        String citizen = "USA"; //must be a citizen of USA

        boolean isEligible = age >= 18 && citizen == "USA";
        //                    34>= 18       "USA"  == "USA"
        //                    true    &&   true    ==>    true
        System.out.println(name + " is eligible to vote: " + isEligible);
        System.out.println("To vote, they must be a citizen and be 18 or older, 'Daniel' meets both requirements.");

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");

        String name2 = "Josh";
        int creditScore = 720; //credit score must be 700 or higher for a loan
        int age2 = 25; //age must be 21 or older for a loan
        int income = 40000; //income must be over 60000 for a loan

        boolean isEligible2 = creditScore >= 700 && age2 >= 21 && income >= 60000;

        System.out.println(name2 + " is eligible for loan: " + isEligible2); //false

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");

//Logical OR (either) (||)
        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender == 'F');
        //                     21 >= 18  && ( 'F' == 'M'   ||   'F' == 'F' )
        //                      true    &&  (false        ||           true)
        //                      true   &&    true
        //                      true

        System.out.println(name3 + " is eligible to register " + isEligible3);

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");

        String name4 = "James";
        String countryOfBirth = "USA";
        boolean marriedToUSCitizen = false;

        boolean isEligible4 = countryOfBirth == "USA" || marriedToUSCitizen == true;
        //                         true               ||              false

        System.out.println(name4 + " is eligible to apply for US citizenship: " + isEligible4);

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");

        String student = "Ali";
        double gpa = 2.5;
        int familyIncome = 40000;

        boolean isEligible5 = gpa >= 3.5 || familyIncome <= 60000;
        System.out.println(student + " is eligible for a scholarship: " + isEligible5);

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
//Logical NOT (opposite) (!)
        boolean result2 = true;

        System.out.println("result2 = " + result2);

        boolean result3 = !result2; //opposite of result 2

        System.out.println("result3 = " + result3);

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");

        int score = 85;
        boolean passed = score >= 60;
        boolean failed = !passed; //not passed

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed); //result is false but that is because it is opposite of TRUE

    }

}
