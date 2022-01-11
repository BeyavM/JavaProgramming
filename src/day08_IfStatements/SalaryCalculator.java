package day08_IfStatements;

public class SalaryCalculator {

    public static void main(String[] args) {

        int hourlyRate = 50,
            weeklyHours = 45;

        double stateTaxRate = 7.25, //must divide by 100
               federalTaxRate = 9.3;


        //--------------------------------------------------------

        int salaryBeforeTax = hourlyRate * weeklyHours * 52; //52 weeks in a year
        double stateTax = salaryBeforeTax * stateTaxRate / 100; //divide it by 100 to get the percent
        double federalTax = salaryBeforeTax * federalTaxRate / 100;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;
        double weeklyIncome = salaryAfterTax / 52;
        //--------------------------------------------------------
        System.out.println("Gross pay is: $" + salaryBeforeTax);
        System.out.println("State tax: $" + stateTax);
        System.out.println("Federal tax: $" + federalTax);
        System.out.println("Total tax: $" + totalTax);
        System.out.println("Net Income: $" + salaryAfterTax);
        System.out.println("Weekly Income: $" + weeklyIncome);

    }

}
