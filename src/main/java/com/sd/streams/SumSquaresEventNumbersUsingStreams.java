package com.sd.streams;

import java.util.Arrays;
import java.util.List;

public class SumSquaresEventNumbersUsingStreams {

	public static void main(String[] args) {
		/*
		 * You are given a list of integers, and your task is to find and return the sum of the squares of all the even numbers in the list.

Write a Java method that takes the list of integers as input and returns the sum of the squares of the even numbers. The method should have the following signature:
		
		
		*/	
		
		Integer[] arr = {3, 5, 7, 9};
		List<Integer> list = Arrays.asList(arr);
		int response = sumOfSquaresOfEvenNumbers(list);
		System.out.println("response = "+response);
	}
	
	public static int sumOfSquaresOfEvenNumbers(List<Integer> numbers) {
	   
		if(numbers==null || numbers.size()==0) {
			return -1;
		}
		
		return numbers.stream()
				.filter(x -> x%2==0)
				.mapToInt(x -> x*x)
				.sum();
		
		
		
	}


}
