package utilities;

import java.util.Arrays;

public class ArraysUtility {

        //prints each integer of an integer array in separate lines
        public static void printEachElement(int[] array){
            for (int each : array) {
                System.out.println(each);
            }
        }

        //prints each double of a double array in separate lines
        public static void printEachElement(double[] array)
        {
            for (double each : array) {
                System.out.println(each);
            }
        }

        //prints each char of a char array in separate lines
        public static void printEachElement(char[] array){
            for (char each : array) {
                System.out.println(each);
            }
        }

        //prints each String of a String array in separate lines
        public static void printEachElement(String[] array){
            for (String each : array) {
                System.out.println(each);
            }
        }

    //returns the maximum number for integer array
    public static int max(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    //returns the maximum number for double array
    public static double max(double[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    //returns the minimum number from integer array
    public static int min(int[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }

    //returns the minimum number from double array
    public static double min(double[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }

        //checks if given integer is contained in the given array. returns boolean, contains(int[], int)
        public static boolean contains(int[] array, int element){
            boolean result = false;

            for (int each : array) {
                if(each == element){
                    result = true;
                }
            }
            return result;
        }

        //checks if given double is contained in the given array. returns boolean, contains(int[], int)
        public static boolean contains(double[] array, double element){
            boolean result = false;

            for (double each : array) {
                if(each == element){
                    result = true;
                }
            }
            return result;
        }

        //checks if given char is contained in the given array. returns boolean, contains(int[], int)
        public static boolean contains(char[] array, char element){
            boolean result = false;

            for (char each : array) {
                if(each == element){
                    result = true;
                }
            }
            return result;
        }

        //checks if given String is contained in the given array. returns boolean, contains(int[], int)
        public static boolean contains(String[] array, String element){
            boolean result = false;

            for (String each : array) {
                if(each == element){
                    result = true;
                }
            }
            return result;
        }

            //create a return method called addInteger that can add an Integer  after the  last index of an integer array
            public static int[] addElement(int[] array, int element) { //we must do int[] since we are using int arrays
                int[] result = new int[array.length + 1]; //we do +1 at the end of array.length, so it can contain the element as well

                int i = 0; //this 'i' represents the indexes of the new array
                for (int each : array) {
                    result[i++] = each;
                }
                result[i] = element; //whatever the number of 'i' is will be the last index

                return result;
            }

            //create a return method called addDouble that can add a double after the last index of a double array
            public static double[] addElement(double[] array, double element){
                double[] result = new double[array.length + 1];

                int i =0;
                for (double each : array) {
                    result[i++] = each;
                }

                result[result.length-1] = element; // element need to be assigned to the last index
                // result[i] = element;

                return result;

            }

            //create a return method called addString that can add a String after the last index of a String array
            public static String[] addElement(String[] array, String element) { //these two parameters must be created, or the method could never finish its function
                String[] result = new String[array.length + 1];

                int i = 0;
                for (String each : array) {
                    result[i++] = each;
                }
                result[i] = element;

                return result;

            }

            //create a return method called addChar that can add a char after last index of a char array
            public static char[] addElement(char[] array, char element) { //these two parameters must be created, or the method could never finish its function
                char[] result = new char[array.length + 1];

                int i = 0;
                for (char each : array) {
                    result[i++] = each;
                }
                result[i] = element;

                return result;

            }

                //returns the frequency of the given element from the given array (int)
                public static int frequencyOfElement(int[] array, int element){
                    int count = 0;
                    for (int each : array){
                        if(each == element){
                            count++;
                        }
                    }
                    return count;
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

                    //returns the unique elements of the array as a new array (int)
                    public static int[] uniqueElements(int[] array){
                        int[] result = {}; //new int[0]

                        for(int each : array){

                            if(ArraysUtility.frequencyOfElement(array, each) == 1){ //if the frequency is 1, then the element is unique
                                result = ArraysUtility.addElement(result, each) ;
                            }

                        }
                        return result;
                    }

                    //returns the unique elements of the array as a new array (double)
                    public static double[] uniqueElements(double[] array){
                        double[] result = {}; //new int[0]

                        for(double each : array){

                            if(ArraysUtility.frequencyOfElement(array, each) == 1){ //if the frequency is 1, then the element is unique
                                result = ArraysUtility.addElement(result, each) ;
                            }

                        }
                        return result;
                    }

                    //returns the unique elements of the array as a new array (char)
                    public static char[] uniqueElements(char[] array){
                        char[] result = {}; //new int[0]

                        for(char each : array){

                            if(ArraysUtility.frequencyOfElement(array, each) == 1){ //if the frequency is 1, then the element is unique
                                result = ArraysUtility.addElement(result, each) ;
                            }

                        }
                        return result;
                    }

                    //returns the unique elements of the array as a new array (String)
                    public static String[] uniqueElements(String[] array){
                        String[] result = {}; //new int[0]

                        for(String each : array){

                            if(ArraysUtility.frequencyOfElement(array, each) == 1){ //if the frequency is 1, then the element is unique
                                result = ArraysUtility.addElement(result, each) ;
                            }

                        }
                        return result;
                    }

                        //removes the index from the array, returns new array (int)
                        public static int[] removeElement(int[] array, int index){

                            if(index < 0 || index > array.length-1){
                                System.err.println("Invalid Index: " + index);
                                System.exit(0);
                            }

                            int[] result = new int[array.length-1];

                            int j = 0;
                            for (int each : array) {
                                if(each == array[index]){ //if the element of array is matching with the element at given index
                                    continue; //skip
                                }
                                result[j++] = each;
                            }
                            return result;
                        }

                        //removes the index from the array, returns new array (double)
                        public static double[] removeElement(double[] array, int index){

                            if(index < 0 || index > array.length-1){
                                System.err.println("Invalid Index: "+index);
                                System.exit(0);
                            }

                            double[] result = new double[array.length -1]; //1,2

                            int j = 0;
                            for (int i= 0; i < array.length; i++) {
                                if(i == index){  // if the index of array is matching with the given index
                                    continue; // skip
                                }
                                result[j++] = array[i];
                            }

                            return result;
                        }

                        //removes the index from the array, returns new array (char)
                        public static char[] removeElement(char[] array, int index){

                            if(index < 0 || index > array.length-1){
                                System.err.println("Invalid Index: "+index);
                                System.exit(0);
                            }

                            char[] result = new char[array.length -1]; //1,2

                            int j = 0;
                            for (int i= 0; i < array.length; i++) {
                                if(i == index){  // if the index of array is matching with the given index
                                    continue; // skip
                                }
                                result[j++] = array[i];
                            }

                            return result;
                        }

                        //removes the index from the array, returns new array (String)
                        public static String[] removeElement(String[] array, int index){

                            if(index < 0 || index > array.length-1){
                                System.err.println("Invalid Index: "+index);
                                System.exit(0);
                            }

                            String[] result = new String[array.length -1]; //1,2

                            int j = 0;
                            for (int i= 0; i < array.length; i++) {
                                if(i == index){  // if the index of array is matching with the given index
                                    continue; // skip
                                }
                                result[j++] = array[i];
                            }

                            return result;
                        }

                            //merge the given two arrays and returns the new array (int)
                            public static int[] merge(int[] arr1, int[] arr2){

                                int[] result = {}; //temporary array

                                for (int each : arr1){ //for each loop used to get each element for the array
                                    result = ArraysUtility.addElement(result, each); //this addElement method adds the element to the given array, returns new array, assign it back using 'result'
                                }
                                for (int each : arr2){ //for each loop used to get each element for the array
                                    result = ArraysUtility.addElement(result, each);
                                }
                                return result;
                            }

                            //merge the given two arrays and returns the new array (double)
                            public static double[] merge(double[] arr1, double[] arr2){

                                double[] result = {}; //temporary array

                                for (double each : arr1){ //for each loop used to get each element for the array
                                    result = ArraysUtility.addElement(result, each); //this addElement method adds the element to the given array, returns new array, assign it back using 'result'
                                }
                                for (double each : arr2){ //for each loop used to get each element for the array
                                    result = ArraysUtility.addElement(result, each);
                                }
                                return result;
                            }

                            //merge the given two arrays and returns the new array (char)
                            public static char[] merge(char[] arr1, char[] arr2){

                                char[] result = {}; //temporary array

                                for (char each : arr1){ //for each loop used to get each element for the array
                                    result = ArraysUtility.addElement(result, each); //this addElement method adds the element to the given array, returns new array, assign it back using 'result'
                                }
                                for (char each : arr2){ //for each loop used to get each element for the array
                                    result = ArraysUtility.addElement(result, each);
                                }
                                return result;
                            }

                            //merge the given two arrays and returns the new array (String)
                            public static String[] merge(String[] arr1, String[] arr2){

                                 String[] result = {}; //temporary array

                                for (String each : arr1){ //for each loop used to get each element for the array
                                    result = ArraysUtility.addElement(result, each); //this addElement method adds the element to the given array, returns new array, assign it back using 'result'
                                }
                                for (String each : arr2){ //for each loop used to get each element for the array
                                    result = ArraysUtility.addElement(result, each);
                                }
                                return result;
                            }

                                //reverses the given array, returns a new array (int)
                                public static int[] reverse(int[] array){

                                    int[] result = new int[array.length];
                                    int j = 0;
                                    for (int i = array.length - 1; i >= 0; i--) {
                                        result[j++] = array[i];
                                    }

                                    return result;
                                }

                                //reverses the given array, returns a new array (double)
                                public static double[] reverse(double[] array){

                                    double[] result = new double[array.length];
                                    int j = 0;
                                    for (int i = array.length - 1; i >= 0; i--) {
                                        result[j++] = array[i];
                                    }

                                    return result;
                                }

                                //reverses the given array, returns a new array (char)
                                public static char[] reverse(char[] array){

                                    char[] result = new char[array.length];
                                    int j = 0;
                                    for (int i = array.length - 1; i >= 0; i--) {
                                        result[j++] = array[i];
                                    }

                                    return result;
                                }

                                //reverses the given array, returns a new array (String)
                                public static String[] reverse(String[] array){

                                    String[] result = new String[array.length];
                                    int j = 0;
                                    for (int i = array.length - 1; i >= 0; i--) {
                                        result[j++] = array[i];
                                    }

                                    return result;
                                }

    //replace the element of the array at given index with the new element
    public static int[] replace(int[] array, int index, int newElement){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    } //(int)

    //replace the element of the array at given index with the new element
    public static double[] replace(double[] array, int index, double newElement){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    } //(double)

    //replace the element of the array at given index with the new element
    public static char[] replace(char[] array, int index, char newElement){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    } //(char)

    //replace the element of the array at given index with the new element
    public static String[] replace(String[] array, int index, String newElement){ //(String)

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }

        //replaces all the matching oldValue with newValue
        public static int[] replaceAll(int[] array, int oldValue, int newValue){
            for (int i = 0; i < array.length; i++) {

                if(array[i] == oldValue){
                    array[i] = newValue;
                }

            }

            return array;

        } //(int)

        //replaces all the matching oldValue with newValue
        public static double[] replaceAll(double[] array, double oldValue, double newValue){
            for (int i = 0; i < array.length; i++) {

                if(array[i] == oldValue){
                    array[i] = newValue;
                }

            }

            return array;

        } //(double)

        //replaces all the matching oldValue with newValue
        public static char[] replaceAll(char[] array, char oldValue, char newValue){
            for (int i = 0; i < array.length; i++) {

                if(array[i] == oldValue){
                    array[i] = newValue;
                }

            }

            return array;

        } //(char)

        //replaces all the matching oldValue with newValue
        public static String[] replaceAll(String[] array, String oldValue, String newValue){
            for (int i = 0; i < array.length; i++) {

                if (array[i].equals( oldValue) ) {
                    array[i] = newValue;
                }

            }

            return array;

        } //(String)

            //removes the duplicates from the given array, returns the new array
            public static int[] removeDuplicates(int[] array){

                int[] result = {};//{1,2,3}

                for (int each : array) {
                    if(!ArraysUtility.contains(result, each)){
                        result = ArraysUtility.addElement(result, each);
                    }
                }
                return result;
            }

            //removes the duplicates from the given array, returns the new array
            public static double[] removeDuplicates(double[] array){

                double[] result = {};

                for (double each : array) {
                    if(!ArraysUtility.contains(result, each)){
                        result = ArraysUtility.addElement(result, each);
                    }
                }
                return result;
            }

            //removes the duplicates from the given array, returns the new array
            public static char[] removeDuplicates(char[] array){

                char[] result = {};

                for (char each : array) {
                    if(!ArraysUtility.contains(result, each)){
                        result = ArraysUtility.addElement(result, each);
                    }
                }
                return result;
            }

            //removes the duplicates from the given array, returns the new array
            public static String[] removeDuplicates(String[] array){

                String[] result = {};

                for (String each : array) {
                    if(!ArraysUtility.contains(result, each)){
                        result = ArraysUtility.addElement(result, each);
                    }
                }
                return result;
            }

}


