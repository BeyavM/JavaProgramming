package day10_NestedIf;

public class CampusTime {

    public static void main(String[] args) {

        double salary = 162500; //salary will determine tax rate
        boolean isMarried = true; //if married, the tax is reduced by 5%

        double taxRate = 0; //temporary value

        if(salary >= 130000){ //if salary is greater than or equal to 130000, then tax rate will be 35%
            taxRate = 0.35;
        } else if (salary >= 100000) {
            taxRate = 0.30;
        } else if (salary >= 80000){
            taxRate = 0.25;
        } else {
            taxRate = 0.20;
        }

        if (isMarried) { //if married, tax rate drops by 5%
            taxRate -= 0.05;
        }

        double salaryAfterTax = salary - (salary*taxRate);

        System.out.println("Salary after tax = " + salaryAfterTax);
    }



}
/* Create a class called CampusTime, an integer variable named time is given with a number between 1~24 has been initialized, write a program that can find out if the campus is open or not. Campus is open from 8 am(8) to 11 pm (23) If user enters a time within the open time they should see message: “open”  but if the time entered is outside of operating hours they should see: “ closed”

2. Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

 */