package com.sd.streams;

import java.util.List;

public class SumOfSquaresOfOddNumbers {

	public static void main(String args[]) {
	     List<Integer> numbers = List.of(2, 3, 4, 5, 6);
	     int response = sumOfSquaresOfOddNumbers(numbers);
	     System.out.println("response "+response);
	    }
	    
	    public static int sumOfSquaresOfOddNumbers(List<Integer> numbers) {

	        return numbers.stream()
	            .filter(x -> x%2==1)
	            .map(x -> x*x)
	            .reduce(0,(a,b)->a+b);

	    }
}
