package com.qa.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ExThree {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();

		numbers.add(3);
		numbers.add(4);
		numbers.add(7);
		numbers.add(8);
		numbers.add(12);

		Stream<Integer> numbersStream = numbers.stream();

		// Remove odd numbers
//		numbersStream.filter(number -> number % 2 == 0).forEach(number -> System.out.println(number));

		// Remove even numbers
//		numbersStream.filter(number -> number % 2 != 0).forEach(number -> System.out.println(number));

		
		// finding max value
//		int max = numbersStream.max(Integer::compare).get();
//		System.out.println(max);
		
		// another way
//		int maxNum = numbersStream.max((numOne, numTwo) -> Integer.compare(numOne, numTwo)).get();
//		System.out.println(maxNum);
		
		
		
		// finding min value
//		int min = numbersStream.min(Integer::compare).get();
//		System.out.println(min);
		
		//another way
//		int minNum = numbersStream.min((numOne, numTwo) -> Integer.compare(numOne, numTwo)).get();
//		System.out.println(minNum);
		
		
		// find the sum of the list
//		int sum = numbersStream.reduce((num1, num2) -> num1 + num2).get();
//		System.out.println(sum);
		
		
		//Square every number in the list then remove the even numbers and then find the min value.
		int result = numbersStream.map(number -> (int) Math.pow(number, 2)).filter(number -> number % 2 != 0).min((numOne, numTwo) -> Integer.compare(numOne, numTwo)).get();
		System.out.println(result);
		
		
	}			
}