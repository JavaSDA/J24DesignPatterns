package com.company.advancedCoding.randomemployee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Company {
    private List<Employee> employees;

    public Company() {
        this.employees = new ArrayList<>();
    }

    public void addEmployees(Employee... employees) {
        this.employees.addAll(Arrays.asList(employees));
    }

    public double getAverageSalary() {
        // Initialize a sum variable to 0
        double sum = 0;

        // loop through the components and accumulate the sum
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }

        // return the sum / num of elements
        return sum / employees.size();
    }

    public Employee getOldestEmployee() {

        if (employees.isEmpty()) return null;

        // Initialize the first employee, you encounter as the oldest
        Employee currentOldest = employees.get(0); // employees[0]

        // compare the other employees to find out real oldest
        // and store the value in the variable above
        for (Employee currentEmployee : employees) {
            if (currentEmployee.getAge() > currentOldest.getAge()) {
                currentOldest = currentEmployee;
            }
        }

        // return the oldest after the iteration is done
        return currentOldest;
    }

    public Employee getRandomEmployee() {
        if (employees.isEmpty()) return null;
        Random random = new Random();
        int randomIndex = random.nextInt(employees.size());
        return employees.get(randomIndex);
    }
}
