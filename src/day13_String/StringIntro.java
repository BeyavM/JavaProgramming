package day13_String;

// import java.lang.String;      not mandatory to import String as it does it implicitly, just an example of how to do it

public class StringIntro {

    public static void main(String[] args) {

        String name1 = "Wooden Spoon";
        String name2 = "Wooden Spoon";
        String name3 = "Wooden Spoon";
        String name4 = "Wooden Spoon";

        System.out.println(name1 == name2); //true
        System.out.println(name2 == name3); //true
        System.out.println(name3 == name4); //true

        System.out.println("-------------------------");

        String str1 = new String("Wooden Spoon");
        String str2 = new String("Wooden Spoon");
        String str3 = new String("Wooden Spoon");
        String str4 = new String("Wooden Spoon");

        System.out.println(str1 == str2); //false
        System.out.println(str2 == str3); //false
        System.out.println(str3 == str4); //false

        System.out.println("-------------------------");

        String s1 = "Java";
        String s2 = new String("Java");

        System.out.println(s1.equals(s2)); // when comparing objects, don't use ==, use this method (_.equals(_))

        System.out.println("-------------------------");

        String s3 = "Java"; //upper case J
        String s4 = new String("java"); //lower case j

        System.out.println(s3.equals(s4)); //false, java is case-sensitive, and since one is written as Java and the other is java, they are not the same.



    }

}
