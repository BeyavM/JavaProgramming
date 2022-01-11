package day36_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'M', 2, "Small", "White");
        dog.eat();
        dog.drink();
        dog.move();
        dog.sleep();
        dog.bark();
        System.out.println(dog); //Animal{name='Max', breed='Husky', gender=M, age=2, size='Small', color='White'}


        Cat cat = new Cat();
        cat.setInfo("Tom", "Generic house cat", 'M', 1, "Medium", "Black" );
        cat.eat();
        cat.drink();
        cat.move();
        cat.sleep();
        cat.meow();
        cat.scratch();
        System.out.println(cat); //Animal{name='Tom', breed='Generic house cat', gender=M, age=1, size='Medium', color='Black'}

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher khan", "Bengal", 'M', 4, "Large", "Orange");
        tiger.eat();
        tiger.drink();
        tiger.move();
        tiger.sleep();
        tiger.hunt();
        tiger.roar();
        System.out.println(tiger); //Animal{name='Sher khan', breed='Bengal', gender=M, age=4, size='Large', color='Orange'}



    }

}
