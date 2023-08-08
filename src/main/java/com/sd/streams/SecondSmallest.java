package com.sd.streams;

import java.util.List;

public class SecondSmallest {

	/*
	 * You are given a list of integers, and your task is to find and return the
	 * second smallest integer in the list.
	 * 
	 * Write a Java method that takes the list of integers as input and returns the
	 * second smallest integer. If there are duplicate second smallest integers, you
	 * can return any one of them.
	 * 
	 */
	
	public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 2, 8, 1, 4, 7, 3);
        Integer secondSmallest = findSecondSmallest(numbers);
        System.out.println("Second smallest: " + secondSmallest); // Output: Second smallest: 2
    }

    public static Integer findSecondSmallest(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .sorted()
                .skip(1) // Skip the first smallest element
                .findFirst() // Find the second smallest element
                .orElse(null); // Handle case where there's no second smallest element
    }

}
