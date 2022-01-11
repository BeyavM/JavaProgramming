package day17_While_DoWhile;

public class FrequencyOfWord_WhileLoop {

    public static void main(String[] args) {

        String str = "Java Java Java Python";

        int frequency = 0;

        while(str.contains("Java")){
            str = str.replaceFirst("Java", "");
            frequency++;
        }

        System.out.println(frequency);

        System.out.println("-----------------------------------------------------");

        String sentence = "Cat Cat Cat Cat Cat Dog Dog Cat Dog";

        int countCat = 0;

        while(sentence.contains("Cat")){
            sentence = sentence.replaceFirst("Cat", "");
            countCat++;
        }

        System.out.println(countCat);

        System.out.println("-----------------------------------------------------");

    }

}
