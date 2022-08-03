package Book03_ObjectOrientatedProgramming.Chapter04.DeterminingObjectType;

public class Employee {
    public static void main(String[] args) {
       // Employee emp = getEmployee();
        Employee emp1 = new SalariedEmployee();
        Employee emp2 = new HourlyEmployee();
        String msg;
        if (emp1 instanceof SalariedEmployee) {
            msg = "The employee's salary is ";
            msg += ((SalariedEmployee) emp1).getFormattedSalary();
        } else {
            msg = "The employee's hourly rate is ";
            msg += ((HourlyEmployee) emp2).getFormattedRate();
        }
        System.out.println(msg);
    }
}
