package day14_String;

public class ReplaceX {

    public static void main(String[] args) {

        String str = "xcodeX"; //turn 'xcodeX' into 'acodea'

        String result = str.replace("x", "a").replace("X", "a");
        //                 "acodeX"                         "acodea"
        System.out.println(result);//prints acodea




    }

}
/* Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea

 */