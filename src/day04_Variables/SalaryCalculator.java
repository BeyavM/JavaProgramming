package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {

        //hourlyRate, weeklyHours

        int hourlyRate = 65;
        int weeklyHours = 45;
        int numberOfWeeks = 52;

        int salary = hourlyRate * weeklyHours * numberOfWeeks; /*to get salary, you multiply hourlyRate by weeklyHours */
                                                    /* the 52 is the weeks in a year, which is needed for this calculation */
        // System.out.println(salary); /* when printing a VARIABLE using sout, do NOT USE QUOTATIONS (" ") */
        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("numberOfWeeks = " + numberOfWeeks);
        System.out.println("salary = $" + salary);
        /* soutv to get the print statement above, the 'v' in 'soutv' stands for variable*/






    }



}
