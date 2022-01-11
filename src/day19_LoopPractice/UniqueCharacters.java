package day19_LoopPractice;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = ""; //bdf


        char ch = 'a';
        int count = 0; // represents the frequency of the ch
        for (int j = 0; j < str.length(); j++) {
            char each = str.charAt(j); // each character of str
            if (ch == each) {
                count++;
                for (j = 0; j < str.length(); j++) {

                    ch = str.charAt(j);
                    count = 0;

                    for (int i = 0; i < str.length(); i++) { //compares the character that outer loop picked, with each character of the string,
                        each = str.charAt(i);
                        if (ch == each) {
                            count++;
                        }
                    }

/*
            if(count == 1){ // if the frequency of the character is 1, then the character is unique
                result += ch;
            }
 */
                    if (count != 1) {
                        continue;
                    }

                    result += ch;

                }


                System.out.println(count);
                System.out.println(result);


            }
        }
    }
}

