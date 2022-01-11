package day21_ForEachLoop;

public class ReverseNames {

    public static void main(String[] args) {
//prints every name in reverse
        String[] names = {"Cydeo School", "Wooden Spoon", "Java Programming", "SQL Programming", "Selenium Automation", "API Testing", "Database Testing", "Manual Testing"};

        for (String each : names){ //each: "Cydeo School", "Wooden Spoon", "Java Programming" ....
            String reversed = "";

            for (int i = each.length()-1; i >= 0; i--) {
                each.charAt(i);
                reversed += each.charAt(i);
            }
            System.out.println(reversed); //prints every word above, but reversed: "loohcS oedyC"....
        }






    }

}
