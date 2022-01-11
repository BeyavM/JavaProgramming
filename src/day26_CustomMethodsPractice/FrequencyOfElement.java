package day26_CustomMethodsPractice;

public class FrequencyOfElement {

    public static void main(String[] args) {
//frequencyOfElement practice
        int[] arr= {1,1,1,1,1,1,1,2,2,2,3,3,3,4,4,4,1,1,1}; //find how many times '1' was printed

        int n = frequencyOfElement(arr, 1);
        System.out.println(n); // 10 (1 was printed 10 times)


    }

    //created methods

    //returns the frequency of the given element from the given array (int)
    public static int frequencyOfElement(int[] array, int element){
        int count = 0;
        for (int each : array){
            if(each == element){
                count++;
            }
        }
        return count; //return is used when void is not in our method
    }

    //returns the frequency of the given element from the given array (double)
    public static int frequencyOfElement(double[] array, double element){
        int count = 0;
        for (double each : array){
            if(each == element){
                count++;
            }
        }
        return count;
    }

    //returns the frequency of the given element from the given array (char)
    public static int frequencyOfElement(char[] array, char element){
        int count = 0;
        for (char each : array){
            if(each == element){
                count++;
            }
        }
        return count;
    }

    //returns the frequency of the given element from the given array (String)
    public static int frequencyOfElement(String[] array, String element){
        int count = 0;
        for (String each : array){
            if(each.equals(element)){
                count++;
            }
        }
        return count;
    }


}
/* Create a class named FrequencyOfElements:
            1.1 Create a method that passes two parameters: an integer array and an Integer element. The method returns the frequency of the given integer element from the integer array

            1.2 Create a method that passes two parameters: a double array and a double element. The method returns the frequency of the given integer from the array

            1.3 Create a method that passes two parameters: a char array and a char element. The method returns the frequency of the given char element from the char array

            1.4 Create a method that passes two parameters: a String array and a String element. The method returns the frequency of the given String element from the String array */