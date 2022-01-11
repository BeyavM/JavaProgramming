package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

        String name = "Beyav Muhsen";
        String buildingNumber = "124";
        String streetName = "Wilson drive";
        String city = "Brooklyn";
        String state = "NY";
        int zipCode = 17614;

        System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode);

        System.out.println("-------------------------------------------------------------------");

        String name2 = "Beyav Muhsen",  //a single continued String variable, it's continued using a "," after every creation
                buildingNumber2 = "124",
                 streetName2 = "Wilson Drive",
                  city2 = "Brooklyn",
                   state2 = "NY",
                    zipCode2 = "17614";

        System.out.println(name2 + "\n" + buildingNumber2 + " " + streetName2 + " " + "\n" + city2 + ", " + state2 + " " + zipCode2);

        System.out.println("-------------------------------------------------------------------");

        String address = name2 + "\n" + buildingNumber2 + " " + streetName2 + " " + "\n" + city2 + ", " + state2 + " " + zipCode2; //how to put it into one string

        System.out.println(address); //the shortcut was created
    }

}
/* Create a class called ShippingAddress.java
Declare the following variables:
name
buildingNumber
streetName
city
state
zipCode

Use concatenation to print the full shipping address */
