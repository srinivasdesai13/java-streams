package com.sd.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.*;

public class HighestPaidEmployeesByDepartment {
	
	/*
	 * You are given a list of Employee objects, each representing an employee with
	 * attributes like name, department, and salary. Your task is to find and return
	 * the name of the highest-paid employee in each department.
	 * 
	 * Write a Java method that takes the list of Employee objects as input and
	 * returns a Map<String, String> where the keys are department names, and the
	 * values are the names of the highest-paid employees in each department.
	 * 
	 */
	

	public static void main(String[] args) {

		
		
		
		Employee employee1 = new Employee("Alice", "HR", 60000.0);
        Employee employee2 = new Employee("Bob", "IT", 70000.0);
        Employee employee3 = new Employee("Charlie", "HR", 55000.0);
        Employee employee4 = new Employee("David", "IT", 75000.0);
        Employee employee5 = new Employee("Eve", "Finance", 80000.0);
        
        List<Employee> list = List.of(employee1,employee2,employee3,employee4,employee5);
        
        Map<String, String> response = findHighestPaidEmployeesByDepartment(list);
        System.out.println("response "+response);
		
		
		
		
		
	}
	
	public static Map<String, String> findHighestPaidEmployeesByDepartment(List<Employee> employees) {
        return employees.stream()
            .collect(
                Collectors.groupingBy(
                    Employee::getDepartment,
                    Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
                        highestPaidEmployee -> highestPaidEmployee.map(Employee::getName).orElse("")
                    )
                )
            );
    }

}


class Employee {
    private String name;
    private String department;
    private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(String name, String department, double salary) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

    // Constructor, getters, and setters
}
