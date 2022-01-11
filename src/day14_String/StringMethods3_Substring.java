package day14_String;

public class StringMethods3_Substring {

    public static void main(String[] args) {

//.substring(beginning index, ending index);

        String word = "Cydeo School";
        //             0123456789...
        String brand = word.substring(0, 5);// even though 'o' is index 4, you must insert index 5 so the 'o' isn't cut out
        System.out.println("brand = " + brand);

        String str1 = "Cydeo School";
        String brand2 = word.substring(6); //in this scenario, since "School" is the end of the string, we don't need the last index, just the first one.
        System.out.println("brand2 = " + brand2);

        //----------------------------------------------
        String word2 = "Java Programming Language";

        String s1 = word2.substring(0, word2.indexOf(" ")); //Starts at index 0 'J' and ends at ' '
        System.out.println(s1); //"Java"

        String s2 = word2.substring(word2.indexOf(" ")+1, word2.lastIndexOf(" ")); //Starts at index of P and ends at L
        System.out.println(s2); //"Programming"

        String s3 = word2.substring(word2.lastIndexOf(" ")+1); //index of L is where it begins
        System.out.println(s3); //"Language"

        //---------------------------------------------


    }

}
