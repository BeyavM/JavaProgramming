package day27_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {
//parse method - converts String to primitive
//valueOf method -

//Integer.parseInt();
        String str = "123";

        int num = Integer.parseInt(str); //int

        System.out.println(num + 1); //124 (int)((adds one))
        System.out.println(str + 1); //1231 (String)((concatenated))

//Double.parseDouble(); , Integer.MAX_VALUE;
        String str2 = "10.5";

        double num2 = Double.parseDouble(str2); //double
        System.out.println(num2 + 1); //11.5, we converted "num2" from String to double so now when we add 1 in the print statement, it isn't concatenated, it is added to the value

        int max = Integer.MAX_VALUE; //prints max value of any primitive type (we used int for this example)
        int min = Integer.MIN_VALUE; //prints min value of any primitive type (we used int for this example)

        System.out.println("max = " + max); //max = 2147483647
        System.out.println("min = " + min); //min = -2147483648

        long max2 = Long.MAX_VALUE; //prints max value of any primitive type (we used long for this example)
        long min2 = Long.MIN_VALUE; //prints max value of any primitive type (we used long for this example)

        System.out.println("max2 = " + max2); //max2 = 9223372036854775807
        System.out.println("min2 = " + min2); //min2 = -9223372036854775808

//Boolean.parseBoolean();
        String s1 = "true"; //as long as this text is not true, by default it will return false

        boolean r1 = Boolean.parseBoolean(s1);

        System.out.println(r1); //true

//Integer.valueOf(); , Double.valueOf();
        String s2 = "123";
        Integer x = Integer.valueOf(s2); //Integer
        int y = Integer.valueOf(s2); //Integer

        System.out.println(x); //autoboxing
        System.out.println(y); //unboxing

        String s3 = "1.5";
        double z = Double.valueOf(s3); //double

        System.out.println(z);

//isDigit()
        char ch1 = '0';
        char ch2 = 'A';

        boolean r2 = Character.isDigit(ch1); //if returns 0-9 on ASCII table, returns true, otherwise, returns false
        boolean r3 = Character.isLetter(ch2); //if returns a letter, returns true, otherwise, returns false
        boolean r4 = Character.isLetterOrDigit(ch1); //special char
        boolean r5 = Character.isUpperCase(ch2); //true
        boolean r6 = Character.isLowerCase(ch2); //false

        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);

        System.out.println("------------------------------------------------------");

//this method below finds all the numbers in the string and adds them together to get the sum

        String s = "ab1cde2efg3hi4";

        int sum = 0;

        for (char each : s.toCharArray()) {

            if(Character.isDigit(each)){
                sum += Integer.parseInt("" + each);
            }

        }
        System.out.println("sum = " + sum); //10 

    }



}
