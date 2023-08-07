package com.sd.streams;

import java.util.Arrays;
import java.util.List;

public class SumOfValidNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList(new String[] {"apple", "15", "banana", "30", "5", "grape"});
		System.out.println("response "+sumOfValidNumbers(list));
	}
	
	  public static int sumOfValidNumbers(List<String> strings) {
		    // Your implementation here
			
			return strings.stream()
	        		.filter(x -> x.matches("\\d+"))
	        		.mapToInt(Integer::parseInt)
	        		.sum();
			
		
			
		}



}
