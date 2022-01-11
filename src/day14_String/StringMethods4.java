package day14_String;

public class StringMethods4 {

    public static void main(String[] args) {
//.repeat();

        String str = "Cydeo";
        String str2 = str.repeat(4); //"CydeoCydeoCydeoCydeo"
        System.out.println(str2);

        String s1 = "wooden Spoon";
        String s2 = s1.repeat(10); //Wooden Spoon Wooden Spoon Wooden Spoon...
        System.out.println(s2);

        System.out.println("Beyav\n" .repeat(8)); //prints 'Beyav' 8 times, all new lines '\n'



    }

}
