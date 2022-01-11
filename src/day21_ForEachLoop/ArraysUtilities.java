package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtilities {

    public static void main(String[] args) {
//toString()  : converts the array object (single dimensional) to string, returns string
        int[] nums = {1,2,3,4,5};

        System.out.println(nums); //will not return you 1,2,3,4,5.. returns [I@e9e54c2 (hashcode)
        System.out.println(Arrays.toString(nums)); //whenever using arrays and passing string, you must use toString() method
        System.out.println( nums[0] ); //returns the first number in variable nums

        String str = "Java";

        System.out.println(str); // since it is a string, you do not have to pass toString() method

        System.out.println("---------------------------------------------------------------");
//examples of Arrays.sort() Ascending Order (sorts our statements in order from least to greatest (1-10), negative to positive (ex: -10 to 10),  alphabetic order (a-z)), Uppercase - lowercase (ex: ANNA, anna)
        int[] scores = {95, 100, 55, 65, 85, 78};

        System.out.println(Arrays.toString(scores)); //prints [95, 100, 55, 65, 85, 78]

        Arrays.sort(scores); //this method will take our numbers in our created variable "scores" and will 'sort' all the scores in order from least to greatest

        System.out.println(Arrays.toString(scores)); //prints [55, 65, 78, 85, 95, 100]

        System.out.println("Min scores:  " + scores[0]); //prints Min score: 55
        System.out.println("Max scores:  " + scores[scores.length-1]); //prints Max score: 100

        String[] names = {"Gunay", "Anna", "Zuhal", "Ahmet", "Maria", "Sinema"};

        Arrays.sort(names); //once again, using this method will print out our statements in order, can be used for numbers and words as demonstrated

        System.out.println(Arrays.toString(names)); //prints [Ahmet, Anna, Gunay, Maria, Sinema, Zuhal] (in alphabetic order)

        String[] words = {"Anna", "ANNA"};

        Arrays.sort(words);  //once again, using this method will print out our statements in order, can be used for numbers and words as demonstrated

        System.out.println(Arrays.toString(words)); //prints [ANNA, Anna]

        System.out.println("---------------------------------------------------------------");
//equals()
        int[] arr1 = {1,3,2};
        int[] arr2 = {1,2,3};

        boolean r1 = Arrays.equals(arr1, arr2);

        System.out.println(r1); //prints false, as they are currently not equal, 1,3,2 is not equal to 1,2,3

        Arrays.sort(arr1); //1,2,3
        Arrays.sort(arr2); //1,2,3

        boolean r2 = Arrays.equals(arr1, arr2);

        System.out.println(r2); //prints true, since we sorted the two arrays in ascending order, they are both 1,2,3

        System.out.println("---------------------------------------------------------------");
//Anagram: a word, phrase, or name formed by rearranging the letters of another, such as cinema, formed from iceman.
        char[] ch1 = {'a', 'c', 'b'}; //"acb"
        char[] ch2 = {'b', 'a', 'c'}; //"bac"

        Arrays.sort(ch1); // {a, b, c}
        Arrays.sort(ch2); // {a, b, c}

        boolean anagram = Arrays.equals(ch1, ch2); //this method will compare the two methods and tell us if they are actually equal

        System.out.println(anagram); //true, we made char ch1 and ch2 equal by using sort method







    }

}
