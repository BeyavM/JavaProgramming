package day20_Arrays;

public class InterviewQuestion_ReverseWord {

    public static void main(String[] args) {

        String vinny = "transportation";
        String s = "";

        for (int i = vinny.length()-1; i >= 0; i--) {
            s += vinny.charAt(i);
        }

        System.out.println(s);




    }

}
