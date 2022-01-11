package day30_CustomClass;

public class Car {

    public int year;
    public String make;
    public String model;
    public int mileage;
    public String title;
    public double price;
    public String contact;

    public void carInfo(int carYear, String carMake, String carModel, int carMileage, String carTitle, double carPrice, String carContact){ //the variables inside of the parameters are our local variables
        year = carYear;
        make = carMake;
        model = carModel;
        mileage = carMileage;
        title = carTitle;
        price = carPrice;
        contact = carContact;

    }

    public String toString() {
        return " Car for sale: { " +
                year + " " +
                make + " " +
                model + ", Mileage: "+
                mileage + ", " +
                title+ ", Price: $" +
                price + ", " +
                contact + " " +
                '}';
    }




    public void drive(){
        System.out.println(" " + "Driving " +make+ " " +model);
    }

    public void sold(){
        System.out.println(" " + make + " " + model + " has been sold and is leaving our dealership, congratulations to the new owner!");
    }

    public void inStock(){
        System.out.println(" *NEW* "+ year + " " + make + " " + model + " is now in stock at our dealership!");
    }


}
