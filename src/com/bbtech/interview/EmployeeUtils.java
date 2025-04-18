package com.bbtech.interview;

import java.util.ArrayList;
import java.util.List;

public class EmployeeUtils {

    public static List<Employee> getEmployees(){
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Bindusagar", "Bhoi", "IT", 120000d));
        employees.add(new Employee("Mitali", "Sahu", "IT", 80000d));
        employees.add(new Employee("Subhra", "Patel", "IT", 70000d));
        employees.add(new Employee("Pradeep", "Naik", "HR", 60000d));
        employees.add(new Employee("Sunu", "Naik", "HR", 50000d));
        employees.add(new Employee("Binodini", "Bhoi", "HR", 55000d));
        employees.add(new Employee("Sabyasachi", "Sahu", "FINANCE", 90000d));
        employees.add(new Employee("Dilip", "Patel", "FINANCE", 80000d));
        employees.add(new Employee("Sanjeeb", "Naik", "FINANCE", 70000d));
        employees.add(new Employee("Sunil", "Patel", "ACCOUNT", 50000d));
        employees.add(new Employee("Deepak", "Patel", "ACCOUNT", 40000d));
        employees.add(new Employee("Om", "Bhoi", "ACCOUNT", 60000d));

        return employees;
    }
}
