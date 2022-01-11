package day20_Arrays;

import java.util.Arrays; //import for Arrays

public class ArraysIntro {

    public static void main(String[] args) {
//create a variable that's capable enough to contain 5 names
//prints [null, null, null, null, null]
        String[] myGroup = new String[5];   //this is a single-dimensional array, an array that has a single [], also, if an array is 'String' or 'int', the 'new' should also be the same variable type (ex: String[] x = new String)

        //System.out.println(myGroup); [Ljava.lang.String;@e9e54c2 <== this is what happens if I don't call the Arrays.toString() method /hashcode
        System.out.println(Arrays.toString(myGroup));      //correct way to print Arrays, result: [null, null, null, null, null] (null just means no object was given)


//prints [Gunay, Neira, Suat, Hulya, Mikael]
        String[] myGroup2 = new String[5];     //the size of this Array is fixed at 5 (0 - 4)
        myGroup2[0] = "Gunay";     //using index to specify each different String we created, index 0 contains Gunay, index 1 contains Neira, etc...
        myGroup2[1] = "Neira";     //to each index, only one element can be assigned
        myGroup2[2] = "Suat";
        myGroup2[3] = "Hulya";
        myGroup2[4] = "Mikael";

        System.out.println(Arrays.toString(myGroup2));     //[Gunay, Neira, Suat, Hulya, Mikael]


//Array Initialization
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
//                          0          1           2            3         4          5           6
        System.out.println(Arrays.toString(days));

        int number = 5;

        if(number < 1 || number > 7){   //if number is less than 1 or number is greater than 7, prints "Invalid Number"
            System.out.println("Invalid Number");
            System.exit(0);
        }

        System.out.println(days[number-1]);     //the number is -1 because indexes begin at 0, and since we are using monday-sunday as our example, the days in index are 0-6 rather than 1-7





    }

}
