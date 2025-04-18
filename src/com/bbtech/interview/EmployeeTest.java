package com.bbtech.interview;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeTest {

    public static void main(String[] args) {
        List<Employee> employees = EmployeeUtils.getEmployees();

        //Find the highest salary of employee in each dept
        Map<String, Employee> value = employees.stream()
                                .collect(Collectors.groupingBy(Employee::getDept,
                                        Collectors.collectingAndThen(
                                                Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
                                            Optional::get)));

        System.out.println("highest salary of employee in each dept : " + value);

        // Find the employee with the highest salary
        Employee employee = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .get();
        System.out.println("employee with the highest salary : " + employee);

        //Find the nth highest salary of employee
        List<Map.Entry<Double, List<Employee>>> empBySal = employees.stream()
                .collect(Collectors.groupingBy(Employee::getSalary,
                        Collectors.mapping(e -> e,Collectors.toList())))
                .entrySet()
                .stream()
                .sorted(Comparator.comparingDouble(entry -> -entry.getKey())) //'-' for descending order salary
//                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey())) //use either of the sort operation
                .toList();
        System.out.println("Employee nth salary : " + empBySal);

        // Compute sum of salaries by department
        Map<String, Double> totalByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept,
                        Collectors.summingDouble(Employee::getSalary)));
        System.out.println("sum of salaries by department : " + totalByDept);

        // Partition employees by a salary margin
        double PASS_THRESHOLD = 60000d;
        Map<Boolean, List<Employee>> empPartition = employees.stream()
                .collect(Collectors.partitioningBy(e -> e.getSalary() >= PASS_THRESHOLD));
        System.out.println("employee partition by sal : " + empPartition);
    }
}
