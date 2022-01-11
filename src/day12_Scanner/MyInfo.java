package day12_Scanner;

import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        input.nextLine(); //input.nextLine(); is MANDATORY to create a space when previous input is not nextLine();

        System.out.println("Gender: ");
        String gender = input.next();

        System.out.println("Enter your full name: ");
        String name = input.nextLine();

        input.nextLine();

        System.out.println("Enter your phone number: ");
        long phoneNumber = input.nextLong();

        input.nextLine();

        System.out.println("Enter your zip code: ");
        int zipCode =  input.nextInt();

        input.nextLine();

        System.out.println("Enter your school name: ");
        String schoolName = input.nextLine();

        System.out.println("Enter your city: ");
        String city = input.nextLine();

        System.out.println("Enter your state: ");
        String state = input.nextLine();

        System.out.println("Enter your building number: ");
        int buildingNumber = input.nextInt();

        input.nextLine();

        System.out.println("Enter your street name: ");
        String street = input.nextLine();

        input.close();

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("Address: \n\t" +buildingNumber+" "+street+" "+city+" "+state+" "+zipCode   );
        System.out.println("schoolName = " + schoolName);



    }

}
/* Create a class called MyInfo. Write a program that can ask the user to:
            1. Enter your age (int) nextInt();
            2. Enter your gender (String- One word ONLY) next();
            3. Enter your full name (String- Multiple words) nextLine();
            4. Enter your phone number (long)
            5. Enter your zip code (int)
            6. Enter your School name (String- Can be Multiple words)
            7. Enter your city name (String- Can be Multiple words)
            8. Enter your state name (String- One word ONLY)
            9. Enter your building number (int)
            10. Enter your Street name

        MAKE SURE USER CAN ENTER ALL THE INPUT

 */