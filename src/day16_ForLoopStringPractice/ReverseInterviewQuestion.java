package day16_ForLoopStringPractice;

public class ReverseInterviewQuestion {

    public static void main(String[] args) {

        String str = "Wooden Spoon";
        //index:      0123456...

        String result = ""; //contains the reversed version of str
        //noopS nedooW

  /*
  this is how to reverse text using String
        result += str.charAt(11); //n
        result += str.charAt(10); //o
        result += str.charAt(9);  //0
        result += str.charAt(8);  //p
        result += str.charAt(7);  //S
        result += str.charAt(6);  //
        result += str.charAt(5);  //n
        result += str.charAt(4);  //e
        result += str.charAt(3);  //d
        result += str.charAt(2);  //o
        result += str.charAt(1);  //o
        result += str.charAt(0);  //W

   */
        for(int i = str.length()-1; i >= 0; i-- ){ //i: index numbers of str (starting from last index to index 0)
                    result += str.charAt(i); //adding each character to result
        }

        //
        System.out.println(result);



    }

}