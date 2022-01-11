package day16_ForLoopStringPractice;

public class FrequencyOfWord2 {

    public static void main(String[] args) {

        String str = "cAt CAt cat CAT Dog Dog ";

        int howOftenCatAppears = 0;

        for (int i = 0; i < str.length()-3; i++) {
            String eachSub = str.substring(i, i+3);

            if(eachSub.equalsIgnoreCase("Cat")){
                howOftenCatAppears++;
            }

        }

        System.out.println(howOftenCatAppears);


    }

}
