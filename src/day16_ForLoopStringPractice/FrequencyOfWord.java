package day16_ForLoopStringPractice;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String str = "JavaJava";

        int frequency = 0;

        for (int i = 0; i < str.length()-3; i++) { //i: 0, 1, 2, 3
            String eachSub = str.substring(i, i+4); //since we are adding 4 here, we must subtract 3 above
            //System.out.println(eachSub); this prints out all outcomes of Java like in the example below
           if(eachSub.equals("Java")){
               frequency++;
           }

        }

        System.out.println(frequency); //2 "Java"


    }

}
/* write a program that can return the frequency of the word Java from the sentence

        ex:
                sentence = "JavaJavaJava";

                output: 3

                substrings: (substrings begin with the beginning index and plus four for our example)
                    1.Java //substring(0, 4)
                    2.avaJ //substring(1, 5)
                    3.vaJa //substring(2, 2+4)
                    4.aJav //substring(3, 3+4)
                    5.Java //substring(4, 4+4)
 */