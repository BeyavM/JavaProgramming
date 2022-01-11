package day14_String;

public class StringMethods5 {

    public static void main(String[] args) {
//.isEmpty();

        String str = ""; //empty is for if there are NO spaces OR characters, it will return true, otherwise, false.

        boolean r = str.isEmpty(); //this string class tells us if it is empty or not

        System.out.println(r); //true (it is empty)

//.isBlank();

        String str2 = "  "; //blank is for if there are spaces, but NO other characters, it will return true, otherwise, false.

        boolean r2 = str.isBlank();

        System.out.println(r2); //true (it has spaces, but no characters or numbers)

//.equals(); , .equalsIgnoreCase();

        String s1 = "CYDEO"; //upper case
        String s2 = "cydeo"; //lower case

        System.out.println(s1.equals(s2)); //java is case sensitive, even though they are the same word, they are not written the same exact way, therefore, false.
        System.out.println(s1.equalsIgnoreCase(s2)); // using equalsIgnoreCase() will allow the case sensitivity to be ignored, therefore the result returns true.

//.contains();

        String sentence = "My favorite programming language is Java";

        System.out.println(sentence.contains("programming")); //true, it does contain 'programming'
        System.out.println(sentence.contains("C#")); //false, it doesn't contain 'C#'

//.startsWith(); , .endsWith();

        String a  = "Wooden Spoon";

        boolean x = a.startsWith("W");
        boolean y = a.endsWith("Spoon");

        System.out.println(x); //true (it does start with "W")
        System.out.println(y); //true (it does end with 'Spoon')
        //startsWith() and endsWith() are CASE sensitive, like everything in java


    }

}
