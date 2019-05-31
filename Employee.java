// Employee Class
// Author: CHIMA CHUKWUEBUKA
// Date: 30th May 2019

public class Employee{
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public void setFirstName(String firstname){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setSalary(double salary){
        if(salary < 0){
            System.out.println("Invalid Amount");
        }
        if(salary > 0){
            this.salary = salary;
        }
}
    public double getSalary(){
        return salary;
    }
    public double employeeYearlySalary(){
        double yearlySalary = salary * 12;
        return yearlySalary;
    }
    public double employeeYearlySalaryAfterRaise(){
        double q = 1.1 * salary;
        double t = q * 12;
        return t;
    }
}