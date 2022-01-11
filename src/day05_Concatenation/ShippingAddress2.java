package day05_Concatenation;

public class ShippingAddress2 {

    public static void main(String[] args) {

        String name2 = "Michael Corleone",
                buildingNumber2 = "7441",
                streetName2 = "Lakeshore Dr",
                city2 = "Long Island",
                state2 = "NY",
                zipCode2 = "11478";

        String address = name2 + "\n" + buildingNumber2 + " " + streetName2 + " " + "\n" + city2 + ", " + state2 + " " + zipCode2;

        System.out.println(address);   //the shortcut has been created, whenever I need to post an address, I use this variable.

    } 

}
