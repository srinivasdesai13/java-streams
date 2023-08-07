package com.sd.streams;

import java.util.List;

public class SumOfDistinctOddNumbers {

	/*
	You are given a list of integers, and your task is to find and return the count of distinct odd numbers in the list.
	Write a Java method that takes the list of integers as input and returns the count of distinct odd numbers. 
	A number is considered odd if it is not divisible by 2 (i.e., it leaves a remainder when divided by 2).
	*/
	
	
	public static void main(String args[]) {
	     List<Integer> list = List.of(2, 3, 5, 5, 7, 2, 9, 3);
	     int response = countDistinctOddNumbers(list);
	     System.out.println("response "+response);
	    }
	    
		public static int countDistinctOddNumbers(List<Integer> numbers) {

			return numbers.stream()

					.filter(x -> x % 2 == 1)
					.distinct()
					.reduce(0, (a, b) -> a + b);

		}
}
