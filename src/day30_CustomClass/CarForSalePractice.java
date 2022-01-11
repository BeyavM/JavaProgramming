package day30_CustomClass;

import utilities.ArraysUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class CarForSalePractice {

    public static void main(String[] args) {

        System.out.println();

        Car car1 = new Car();
        car1.carInfo(2002, "Mazda", "RX-7 Spirit R Type-A", 46800, "Clean Title", 42500, "Contact to schedule a meeting: (607)202-7441");
        System.out.println(car1);
        car1.sold();

        System.out.println();

        Car car2 = new Car();
        car2.carInfo(1999, "Mitsubishi", "Eclipse GSX", 71320, "Salvage Title", 12000, "Contact our offices for more information: (405)862-4036");
        System.out.println(car2);
        car2.sold();

        System.out.println();

        Car car3 = new Car();
        car3.carInfo(1991, "Nissan", "Skyline GT-R R32", 63400, "Clean Title", 49999, "");
        car3.inStock();

        System.out.println();

        Car car4 = new Car();
        car4.carInfo(2005, "Mitsubishi", "Lancer Evolution IX", 77114, "Clean Title", 38999, "Contact our offices here at Miami Sports Expo to schedule an appointment: (305)513-8616" );
        System.out.println(car4);

        System.out.println();

        //Car[] cars = { car1, car2, car3 };

        System.out.println("In Stock:");

        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1, car2, car3, car4));

        // v this code if undone will remove any car that meets the recall (the mazda rx-7 meets the recalls requirements, and will be repo'd)
        //carsList.removeIf( p -> p.make.equals("Mazda") && p.year >= 1995 && p.year <= 2003);

        for(Car each : carsList){
            System.out.println(each.make + ": " + each.price );

        }



    }

}
