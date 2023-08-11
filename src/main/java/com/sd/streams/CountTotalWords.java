package com.sd.streams;

import java.util.List;

public class CountTotalWords {
	
	/*
	 * You are given a list of strings representing sentences. Your task is to find
	 * and return the total number of words in all the sentences combined.
	 * 
	 * Write a Java method that takes the list of strings as input and returns the
	 * total count of words across all sentences.
	 * 
	 */
	 public static void main(String args[]) {
	     //List<Integer> numbers = List.of(2, 3, 4, 5, 6);
	     List<String> sentenses = List.of("Hello world", "Java programming is fun", "Keep coding");
	     int response = countTotalWords(sentenses);
	     System.out.println("response "+response);
	    }
	    
	   public static int countTotalWords(List<String> sentences) {
	    return sentences.stream()
	            .mapToInt(x -> x.split(" ").length)
	            .sum() ;
	  
	}
}
