package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Beyav";  //whatever I choose to change these variable names to, it will change everywhere, ex: if i change 'beyav' to 'conor'.
        String lastName = "Muhsen";//to get a space in between two strings in a row, you must put an actual space in the string itself, as you can see.
        int age = 20;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        int salary = 150000;
                                    // v an added space
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        //full name of the person is

        System.out.println("Full name of the person is " + fullName); //I chose not to end this statement with a period, however if I did, it would be (+ ".").
        System.out.println("--------------------------------------------------");
        System.out.println(fullName + " is " + age + " years old."); //I used the 'int' I created to list '20' whenever I insert the keyword 'age'
        System.out.println("--------------------------------------------------");
        //fullName is jobTitle + , works at + companyName
        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName + " and " + fullName + "'" + " salary is $" + salary + ".");
    }

}
/* create a class called "FullName.java"
    Declare the following:
        firstName
        lastName
    use concatenation to print the full address

 */