package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        //Integer

        // age: 38 years old
        byte age = 38;   /* DataType VariableName = Data */

        //weight: 160 pounds
        short weight = 160; /* we have changed the data type to short as byte can only handle going from -128 to 127 */
                            /* 160 is within the range of 'short' */
        //salary: 100,000
        int salary = 100_000; /* int can handle the number '100000' because it's range is -2,147,483,648 to 2,147,483,647 */
                             /*int is the PREFERRED data type for integer numbers, over byte, short, and long */
        //asset: 3,333,333,333
        long asset = 3_333_333_333L; /* when using long, you MUST end your number with an 'l, L' otherwise it will get a compiler error */
                                     /* long isn't used often as int is the most used primitive type and long has the most memory use */
        //Float-point Numbers

        //tax: 0.26
        float tax = 0.26F; /* when using a float, you must add an F 'F, f' to the end of your decimal */

        //PI: 3.14
        double PI = 3.14; /* the PREFERRED decimal primitive type */
                          /* doubles range of numbers is greater than float */
        // Single-character data
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);
        
        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 'D';
        System.out.println("ch3 = " + ch3);

        char ch4 = 22714;
        System.out.println("ch4 = " + ch4); //char goes from 0 to 65,535, every number has a unique response, as you can see.

        char gender = 'F';  //examples

        char grade = 'A';  //examples

        char yesNo = 'Y';  //examples

        char yesNo2 = 'N';  //examples
        System.out.println(yesNo2);

        boolean isEmployee = true; //boolean answers in true/false statements

        boolean isMarried = false;

        boolean result = 100 > 300 ; // when I run the code, boolean tells me this statement is false, because it is, 100 isn't greater than 300
        System.out.println(result); // outcome: false


    }

}
