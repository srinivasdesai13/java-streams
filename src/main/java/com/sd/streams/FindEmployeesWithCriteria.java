package com.sd.streams;

import java.util.List;
import java.util.stream.Collectors;

public class FindEmployeesWithCriteria {

	public static void main(String args[]) {
	     Employee employee1 = new Employee("Alice", "Engineering", 60000, List.of(new Project("ProjectA", "Engineering")));
	    Employee employee2 = new Employee("Bob", "Marketing", 75000, List.of(new Project("ProjectB", "Marketing"), new Project("ProjectC", "Sales")));
	    Employee employee3 = new Employee("Charlie", "Sales", 80000, List.of(new Project("ProjectD", "Sales"), new Project("ProjectE", "Engineering")));
	    List<Employee> list = List.of(employee1,employee2,employee3);
	    List<String> response =  findEmployeesWithCriteria(list,70000);
	    System.out.println("response "+response);
	    }
	    
	    public static List<String> findEmployeesWithCriteria(List<Employee> employees, double salaryThreshold) {
	        return employees.stream()
	        .filter(e -> e.getSalary()>=salaryThreshold)
	        .filter(e -> e.getProjects().stream().map(Project::getDepartment).distinct().count()>=2)
	        .map(e -> e.getName())
	        .collect(Collectors.toList());
	    
	    }

	}


class Employee {
    private String name;
    private String department;
    private double salary;
    private List<Project> projects;
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
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	public Employee(String name, String department, double salary, List<Project> projects) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.projects = projects;
	}

    // Constructor, getters, and setters
}

class Project {
    private String projectName;
    private String department;
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Project(String projectName, String department) {
		super();
		this.projectName = projectName;
		this.department = department;
	}

    // Constructor, getters, and setters
}

