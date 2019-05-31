// Employee class Test
// Author: CHIMA CHUKWUEBUKA
// Date: 30th May 2019

public class EmployeeTest{

    public static void main(String[] args){

        Employee employee2 = new Employee("Chima", "Chukwuebuka", 200.0);
        Employee employee3 = new Employee("Chris", "Brown", 2000);

        System.out.println("Monthly Salary is: " + employee2.getSalary());
        System.out.println("Yearly Salary is: " + employee2.getSalary());
        System.out.println("Yearly Salary After 10% Increase: " + employee2.getSalary());

        System.out.println("Monthly Salary is: " + employee3.getSalary());
        System.out.println("Yearly Salary is: " + employee3.getSalary());
        System.out.println("Yearly Salary After 10% increase: " + employee3.getSalary());
    }
}