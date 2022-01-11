package day30_CustomClass;

public class Dog {

    public String name; //name of dog
    public int age; //age of dog
    public char gender; //gender of dog
    public String breed; //breed of dog
    public String size; //size of dog
    public String color; //color of dog

    //calling the set info method makes printing information out easier
    public void dogInfo(String dogName, int dogAge, char dogGender, String dogBreed, String dogSize, String dogColor){
        name = dogName;
        breed = dogBreed;
        age = dogAge;
        gender = dogGender;
        size = dogSize;
        color = dogColor;

    }

 //static means one copy for all objects, we want a different copy for all the dogs, so we use void
    public void eat(){
        System.out.println(name+ " is eating");
    }
    public void play(){
        System.out.println(name+ " is playing");
    }
    public void bark(){
        System.out.println(name+ " is barking");
    }

// after the object is created, to access the data, you use a dot (.) ((demonstrated in DogObjects class))

    //right-click the screen -> generate -> toString()
    public String toString() {
        return "Dog Description: {" +
                " name = '" + name + '\'' +
                ", age = " + age +
                ", gender = " + gender +
                ", breed = '" + breed + '\'' +
                ", size = '" + size + '\'' +
                ", color = '" + color + '\'' +
                '}';
    }
}
/*

Attributes:
 name, age, gender, breed, size, color


Actions:
 eat(), play(), bark() ....



 */