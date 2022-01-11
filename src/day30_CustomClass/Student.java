package day30_CustomClass;

public class Student {

    public String name;
    public char gender;
    public int age;
    public int ID;
    public char grade;

    public void setInfo(String name, char gender, int age, int ID, char grade) { //shortcut: right-click, generator, CTRL + A to select all, or CTRL + LMB to select desired ones. (remember to change the return type to 'void setInfo'
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }

    /*
    //'this.' keyword is only used when instance is same as local variable, like the example below
    public void setInfo(String name, char gender, int age, int ID, char grade){ //5 parameters
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }


     */

    public String toString() {
        return "Student: {" +
                " name = '" + name + '\'' +
                ", gender = " + gender +
                ", age = " + age +
                ", ID = " + ID +
                ", grade = " + grade + " " +
                '}';
    }

    public void code(){
        System.out.println(name + " is coding");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }


}
