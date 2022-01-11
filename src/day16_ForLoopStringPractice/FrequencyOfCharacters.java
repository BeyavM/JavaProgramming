package day16_ForLoopStringPractice;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "AAABBBBCC";
        char ch = 'A';

        int frequency = 0; // 1+1+1

        for (int i = 0; i < str.length(); i++) { //i: indexes of the str

            char eachChar = str.charAt(i); //eachChar: each character of the str

            // 'A' == 'A'
            if(ch == eachChar){ //if given ch is matching with the eachChar, then ch is appeared in the string
                frequency++;

            }

        }

        System.out.println(frequency);





    }

}
/* write a program that can return the frequency of a char from a String

        ex:
            str = "AAABBBC";
            ch = 'A';

            output: 3

 */