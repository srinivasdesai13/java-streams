package com.sd.streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalculateAverageGrade {

	public static void main(String[] args) {;
		
		List<String> grades = List.of("Alice:A", "Bob:B", "Carol:C", "David:D");
		double response = calculateAverageGrade(grades);
        System.out.println("response "+response);
	}
	
	public static double calculateAverageGrade(List<String> grades) {
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 5);
		map.put("B", 4);
		map.put("C", 3);
		map.put("D", 2);
		map.put("E", 1);
		return grades.stream()
				.mapToDouble(s -> map.get(s.split(":")[1]))
				.average()
				.orElse(0.0d);
	}


}
