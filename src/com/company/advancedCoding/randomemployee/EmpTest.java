package com.company.advancedCoding.randomemployee;

public class EmpTest {
    public static void main(String[] args) {
        Employee fred = new Employee("Fred", "Freddy", 40000, 33);
        Employee harry = new Employee("Harry", "Harrison", 50000, 25);
        Employee george = new Employee("Ben", "Benson", 60000, 40);

//        Employee[] employees = new Employee[] {fred, harry, george};

        Company google = new Company();
//        google.addEmployees(fred, harry, george);
        System.out.println("Average Salary of employee: " + google.getAverageSalary());
        System.out.println("Oldest Employee of google: " + google.getOldestEmployee());
        System.out.println("Current night shift: " + google.getRandomEmployee());

    }
}
