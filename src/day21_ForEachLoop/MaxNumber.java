package day21_ForEachLoop;

public class MaxNumber {

    public static void main(String[] args) {
//how we previously would find max number with for
      /*int[] numbers = {10, 5, 4, 20, 1, 0};
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max){   //if there is elements in the array that is greater than the current max number
                max = numbers[i];   //assigning greater number to variable max
            }

        }

        System.out.println(max); */

        int[] numbers = {10,5,4,20,1,0};
        int max = numbers[0];

        for(int number : numbers){
            if(number > max){
                max = number;
            }
        }

        System.out.println(max);



    }

}
