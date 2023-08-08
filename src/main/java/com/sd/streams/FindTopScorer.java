package com.sd.streams;

import java.util.Comparator;
import java.util.List;

public class FindTopScorer {

	
	/*
	 * You are given a list of strings representing names of students and their
	 * corresponding scores in an exam. Each string is formatted as "Name:Score".
	 * Your task is to find and return the name of the student who scored the
	 * highest.
	 * 
	 * Write a Java method that takes the list of strings as input and returns the
	 * name of the student with the highest score. If there are multiple students
	 * with the same highest score, you can return any one of their names.
	 * 
	 * 
	 * For example, if the input list is ["Alice:85", "Bob:92", "Carol:78",
	 * "David:92"], the method should return either "Bob" or "David" because they
	 * are the students with the highest score of 92.
	 * 
	 * If the input list is ["Eva:89", "Frank:89", "Grace:89"], the method should
	 * return any of "Eva", "Frank", or "Grace" because they all have the highest
	 * score of 89.
	 * 
	 */
	
	
	public static void main(String[] args) {
		List<String> words= List.of("Alice:85", "Bob:92", "Carol:78", "David:92");
	     
	     String response = findTopScorer(words);
	     System.out.println("response "+response);

	}
	
	 public static String findTopScorer(List<String> scores) {
         return scores.stream()
           .max(Comparator.comparingInt(s -> Integer.parseInt(s.split(":")[1])))
           .map(s -> s.split(":")[0])
           .orElse("No data found");
   }

}
