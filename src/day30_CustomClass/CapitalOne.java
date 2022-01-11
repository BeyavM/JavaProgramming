package day30_CustomClass;

public class CapitalOne {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();

        employee1.setInfo("John", 'M', 25, 6205, "Developer", 100000, true);
        employee2.setInfo("Justina", 'F', 23, 1443, "QA", 120000, false);
        employee3.setInfo("Larry", 'M', 29, 2003, "Manager", 112500, true);
        employee4.setInfo("Beyonce", 'F', 32, 2137, "Senior QA", 90000, true);
        employee5.setInfo("Alexander", 'M', 41, 2234, "SDET", 152000, true);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};

        int countFullTime = 0;
        int countPartTime = 0;
        double max = employees[0].salary;
        double min = employees[0].salary;

        for (Employee employee : employees) {

            if (employee.isFullTime) {
                countFullTime++;
            } else {
                countPartTime++;
            }

            if(employee.salary > max){
                max = employee.salary;
            }
            if(employee.salary < min){
                min = employee.salary;
            }

        }
        System.out.println("countFullTime = " + countFullTime); //4 full-time
        System.out.println("countPartTime = " + countPartTime); //1 part-time
        System.out.println("max = " + max); // max salary: 152000.0
        System.out.println("min = " + min); // min salary: 90000.0

    }
}
