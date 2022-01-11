package day30_CustomClass;

import java.util.ArrayList;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.dogInfo("Lucy", 5, 'M', "Husky", "Large", "Gray");

        /*
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'M';
        dog1.size = "Large";
        dog1.color = "Gray";

         */ //longer way (without shortcut)

        System.out.println(dog1); //Dog Description: { name = 'Lucy', age = 5, gender = M, breed = 'Husky', size = 'Large', color = 'Gray'}


        Dog dog2 = new Dog();
        dog2.dogInfo("Sparky", 3, 'F', "Teacup", "Medium", "White");

        /*
        dog2.name = "Sparky";
        dog2.breed = "Teacup";
        dog2.age = 3;
        dog2.gender = 'F';
        dog2.size = "Medium";
        dog2.color = "White";
        */ //longer way (without shortcut)

        System.out.println(dog2); //Dog Description: { name = 'Sparky', age = 3, gender = F, breed = 'Teacup', size = 'Medium', color = 'White'}


        Dog dog3 = new Dog();
        dog3.dogInfo("Jack", 8, 'M',"German Shepard", "Large", "Brown-Black");

        System.out.println(dog3); //Dog Description: { name = 'Jack', age = 8, gender = M, breed = 'German Shepard', size = 'Large', color = 'Brown-Black'}






        
    }

}
