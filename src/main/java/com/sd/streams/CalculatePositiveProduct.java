package com.sd.streams;

import java.util.List;

public class CalculatePositiveProduct {

	/*
	 * You are given a list of integers. Your task is to find and return the product
	 * of all positive integers in the list. If there are no positive integers in
	 * the list, the method should return 1.
	 * 
	 * Write a Java method that takes the list of integers as input and returns the
	 * product of all positive integers. If there are no positive integers, the
	 * method should return 1.
	 * 
	 * 
	 */
	
	
	public static void main(String args[]) {
	     List<Integer> numbers = List.of(2, -3, 4, -5, 6);
	     int response = calculatePositiveProduct(numbers);
	     System.out.println("response "+response);
	    }
	    
	   public static int calculatePositiveProduct(List<Integer> numbers) {
	    return numbers.stream()
	    .filter(x -> x>0)
	    .reduce(1,(a,b)->a*b);
	}

}
