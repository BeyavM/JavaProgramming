package day14_String;

public class EmailDomain {

    public static void main(String[] args) {
//.indexOf(); , .lastIndexOf(); , .substring();
        String email = "Cydeo.School@gmail.com";

        int beginningIndex = email.indexOf("@") + 1;
        int endingIndex = email.lastIndexOf(".");

        String domain = email.substring(beginningIndex, endingIndex);

        System.out.println(domain);

        //--------------------------------------------------

        String str1 = "Java is fun, Java is cool, I love java";

        String s1 = str1.substring(0, 11);
        System.out.println(s1);

        String s2 = str1.substring(13, 25);
        System.out.println(s2);

        String s3 = str1.substring( str1.lastIndexOf("I"));
        System.out.println(s3);

    }

}
