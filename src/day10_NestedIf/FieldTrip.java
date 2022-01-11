package day10_NestedIf;

public class FieldTrip {

    public static void main(String[] args) {

        int grade = 6; // 1 - 6
        String location = "";
        int groupNumber = 1;
        String nameOfTeacher = "";

        if(grade >= 1 && grade <= 6){ //nested if

            if(grade == 1) {
                location = "Apple Orchard";
                groupNumber = 3;
                nameOfTeacher = "Ms.Smith";
            }else if(grade == 2){
                location = "Zoo";
                groupNumber = 7;
                nameOfTeacher = "Ms.Lee";
            }else if(grade == 3){
                location = "Aquarium";
                groupNumber = 5;
                nameOfTeacher = "Ms.Wilson";
            }else if(grade == 4){
                location = "Movie Theatre";
                groupNumber = 2;
                nameOfTeacher = "Mr.Marcus";
            }else if(grade == 5){
                location = "Eiffel Tower";
                groupNumber = 1;
                nameOfTeacher = "Mrs.Williams";
            }else if(grade == 6){
                location = "New York City";
                groupNumber = 4;
                nameOfTeacher = "Mr.Smart";
            }
            System.out.println("grade " + grade + ": " + location + ", " + "group number: " + groupNumber + ", " + nameOfTeacher );
        }else{
            System.out.println("Invalid Grade");
        }


    }

}
