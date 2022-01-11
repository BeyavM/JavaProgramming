package day14_String;

public class StringMethods1 {

    public static void main(String[] args) {

//.trim();
        String str1 = "   batch 25   ";
        str1 = str1.trim();//batch 25
        System.out.println(str1); //trim prints str1 without the spaces in the beginning and end, it 'trims' them out

//.indexOf(); and .lastIndexOf();
        String str2 = "Cydeo school";

        int n1 = str2.indexOf("h");
        System.out.println("n1 = " + n1); //n1 = 8

        int n2 = str2.indexOf("ool"); //since there are three "o" in the string, by inserting 'ool' it found the 'o' we were trying to find
        System.out.println("n2 = " + n2); //n2 = 9
        //------------------------------------------
        String str3 = "Java Programming Language";

        int n3 = str3.indexOf("amm"); //there are two 'a' before we reach the third one we want, to get the third 'a' we have to make it read by using the mm following
        System.out.println("n3 = " + n3); //n3 = 10

        int n4 = str3.lastIndexOf("g"); //last index finds the first g from the end rather than the beginning
        System.out.println("n4 = " + n4); //n4 = 23

        //------------------------------------------
        String s = "Java Nova Cava Wawa orange";

        int firstA = s.indexOf("a");//index of first 'a'
        System.out.println("firstA = " + firstA); //firstA = 1

        int secondA = s.indexOf("a N"); //the second 'a' in 'Java' before the word 'Nova'
        System.out.println("secondA = " + secondA); //secondA = 3

        int lastA = s.lastIndexOf("a"); //finds the first a starting from the end, the 'a' in 'orange'
        System.out.println("lastA = " + lastA); //lastA = 22
    }

}
