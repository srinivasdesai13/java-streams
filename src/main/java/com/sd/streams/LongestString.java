package com.sd.streams;
import java.util.*;

public class LongestString {

	/*
	 * You are given a list of words, and your task is to find and return the
	 * longest word from the list.
	 * 
	 * Write a Java method that takes the list of words as input and returns the
	 * longest word. If there are multiple words with the same maximum length, you
	 * can return any one of them.
	 */

	public static void main(String args[]) {
		List<String> words = List.of("java", "programming", "language");
		String response = findLongestWordUsingReduce(words);
		System.out.println("response " + response);
	}

	public static String findLongestWord(List<String> words) {
		return words.stream()
				.max(Comparator.comparingInt(String::length))
				.orElse("No Data Found");
	}
	
	public static String findLongestWordUsingReduce(List<String> words) {
		return words.stream()
				.reduce((s1,s2)->s1.length()>=s2.length()?s1:s2)
				.orElse("No Data Found");
	}
}
