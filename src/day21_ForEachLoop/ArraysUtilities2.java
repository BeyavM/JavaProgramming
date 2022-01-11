package day21_ForEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysUtilities2 {

    public static void main(String[] args) {
//copyOf() method, copies a part of your created variable, or all of it (this method only copies from BEGINNING to inserted end, never backwards or from the middle, for example.)
        String[] students = {"Elif", "Sinem", "Gunay", "Cihad", "David", "James", "Aaron", "Daniel"};
        String[] earlyBirds = Arrays.copyOf(students, 3); //copies first three

        System.out.println(Arrays.toString(earlyBirds)); //prints [Elif, Sinem, Gunay]

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        numbers = Arrays.copyOf(numbers, 5); //will only print 1,2,3,4,5

        System.out.println(Arrays.toString(numbers)); //prints [1, 2, 3, 4, 5]

        System.out.println("-----------------------------------------------------------------");
//copyOfRange() copies from first point inserted, to last point inserted
        char[] ch1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        char[] ch2 = Arrays.copyOfRange(ch1, 2, 6+1); //'C', 'D', 'E', 'F', 'G' //the +1 is so it inserts G, we could also have written 2, to 7, either way works

        System.out.println(Arrays.toString(ch2)); //prints [C, D, E, F, G]

        int[] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] result = Arrays.copyOfRange(scores, 3, 7+1); //40, 50, 60, 70, 80

        System.out.println(Arrays.toString(result)); //prints [40, 50, 60, 70, 80]

        int[] result2 = Arrays.copyOfRange(scores, 3, scores.length); //another way to print until the end
        System.out.println(Arrays.toString(result2)); //prints [40, 50, 60, 70, 80, 90, 100]




    }

}
