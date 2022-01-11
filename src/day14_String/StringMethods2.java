package day14_String;

public class StringMethods2 {

    public static void main(String[] args) {
//.replace();
      String str = "Java is fun, I love learning java";
      String str2 = str.replace("Java", "Python"); //Python is fun, I love learning Python

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

      String email = "beyavers@gmail.com";
      email = email.replace("gmail", "yahoo"); //'gmail' gets converted to 'yahoo'
        System.out.println("email = " + email); //beyavers@yahoo.com

      String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
      String sentence2 = sentence.replace("Python", ""); //replaces 'Python' with "" (blank spaces)
             sentence2 = sentence2.replace("   " , " "); //removed the extra spaces between the second 'Java' and the first 'C#'
        System.out.println("sentence2 = " + sentence2); //Java Java C# C# C++ C++

        String s = "Dog Dog Dog Dog Dog";
        s = s.replace("Dog", "Cat"); //replaces every 'Dog' with 'Cat'
        System.out.println("s = " + s);

        String s2 = "C# is fun, Java is cool";
        s2 = s2.replace("C#", " Java");
        System.out.println("s2 = " + s2);//first C# gets replaced, outcome: Java is fun, Java is cool

        String s3 = "Java";
        s3 = s3.replace("J", "W"); //Java ===> Wava
        System.out.println("s3 = " + s3);

//.replaceFirst();

        String s4 = "Java Java Java Java";
        s4 = s4.replaceFirst("Java", "Coffee"); //replaces first 'Java' for 'Coffee'
        System.out.println("s4 = " + s4); //result: Coffee Java Java Java (first 'Java' was replaced)

        String result2 = "Java is fun, Java is cool";
        result2 = result2.replaceFirst("Java ", "Python "); //replaced the first 'Java ' to 'Python '
        System.out.println("result2 = " + result2); //"Python is fun, Java is cool"

        String result3 = "Java";
        result3 = result3.replaceFirst("a", "o"); //first 'a' replaced by 'o'
        System.out.println("result3 = " + result3); //result: "Jova"



    }

}
