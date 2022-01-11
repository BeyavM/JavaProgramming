package day05_Concatenation;

public class PhoneNumber {

    public static void main(String[] args) {

      String countryCode = "1",
             areaCode = "607",
             localNumber = "887-2214";

        System.out.println("+" + countryCode + "(" + areaCode + ")" + localNumber );

    }

}
/* create a class named Phone Number and declare the following variables:
            countryCode, areaCode, localNumber

            use string concatenation to display the phone number

            ex:
                if  countryCode = 1
                    areaCode = 607
                    localNumber = 887-2214

                output:
                    +1(607)887-2214 */
