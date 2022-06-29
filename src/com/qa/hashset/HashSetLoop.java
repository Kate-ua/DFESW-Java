package com.qa.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetLoop {

	public static void main(String[] args) {
		
			
				Set <String> students = new HashSet<>();

				students.add("Student1");
				students.add("Student2");
				students.add("Student3");
				
				students.forEach(System.out::println);
				
				


	}

}
