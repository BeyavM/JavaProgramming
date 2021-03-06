package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your building number: ");
        String buildingNumber = input.next();

        input.nextLine();

        System.out.println("Enter your street name: ");
        String streetName = input.nextLine();

        System.out.println("Enter your city name: ");
        String cityName = input.nextLine();

        System.out.println("Enter your state: ");
        String state = input.nextLine();

        System.out.println("Enter your zip code: ");
        int zipCode = input.nextInt();

        input.nextLine();

        System.out.println(fullName + ": " + buildingNumber + " " + streetName + " " + cityName + ", " + state + " " + zipCode);

        input.close();
    }

}
/*

   enter your full name
   enter your building number
   enter your street name
   enter your city name
   enter your state
   enter your zip code

   display the shipping address

 */