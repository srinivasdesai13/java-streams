package com.sd.streams;

import java.util.Comparator;
import java.util.List;

public class YoungestStudentWithMostCourses {
	
	/*
	 * You are given a list of Student objects, each representing a student with a
	 * name, age, and a list of Course objects they are enrolled in. Your task is to
	 * find and return the name of the student who is the youngest and enrolled in
	 * the most courses.
	 * 
	 * Write a Java method that takes the list of Student objects as input and
	 * returns the name of the youngest student with the highest number of enrolled
	 * courses.
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("Alice", 20,
				List.of(new Course("Math"), new Course("Physics"), new Course("Chemistry")));
		Student student2 = new Student("Bob", 22, List.of(new Course("History"), new Course("English")));
		Student student3 = new Student("Charlie", 19, List.of(new Course("Computer Science"), new Course("Math")));
		List<Student> students = List.of(student1, student2, student3);
		String response = findYoungestStudentWithMostCourses2(students);
		System.out.println("respons " + response);

	}

	public static String findYoungestStudentWithMostCourses(List<Student> students) {
		return students.stream().max((b1, b2) -> {
			return b1.getCourses().size() - b2.getCourses().size();
		}).get().getName();
	}
	public static String findYoungestStudentWithMostCourses2(List<Student> students) {
		return students.stream()
				.max(Comparator.comparingInt(s -> s.getCourses().size()))
				.get().getName();
	}
}

class Student {
	private String name;
	private int age;
	private List<Course> courses;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public Student(String name, int age, List<Course> courses) {
		super();
		this.name = name;
		this.age = age;
		this.courses = courses;
	}

	// Constructor, getters, and setters
}

class Course {
	private String courseName;

	public Course(String courseName) {
		super();
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	// Constructor, getters, and setters
}
