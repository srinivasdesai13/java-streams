package com.sd.streams;

import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseFruits {

	/*
	 * You are given a list of strings representing names of fruits. Your task is to
	 * find and return a comma-separated string that contains the names of fruits in
	 * uppercase letters.
	 * 
	 * Write a Java method that takes the list of strings as input and returns a
	 * single string containing the uppercase names of fruits, separated by commas.
	 */
	public static void main(String args[]) {
	     List<String> fruits = List.of("apple", "banana", "orange", "kiwi", "mango");
	     String response = uppercaseFruitsUsingCollectors(fruits);
	     System.out.println("response "+response);
	    }
	    
	   public static String uppercaseFruits(List<String> fruits) {
	   
	        return fruits.stream()
	        .map(String::toUpperCase)
	        .reduce((a,b)->a+","+b)
	        .get();
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	    }
	   
	   public static String uppercaseFruitsUsingCollectors(List<String> fruits) {
		   
	        return fruits.stream()
	        .map(String::toUpperCase)
	        .collect(Collectors.joining(","));
	        
	    }
}
