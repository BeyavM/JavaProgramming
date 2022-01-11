package day15_ForLoop;

public class Practice2 {

    public static void main(String[] args) {

        String s = "Java";

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));
        System.out.println();

        for (int i = 0; i < s.length(); i++){
            System.out.println(s.charAt(i));
        }

        String s1 = "";

        for(int i = s.length()-1; i >= 0; i--){
            s1 += s.charAt(i);
        }

        System.out.println(s1);




    }

}
