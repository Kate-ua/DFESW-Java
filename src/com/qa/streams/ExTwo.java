package com.qa.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ExTwo {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(3);
		numbers.add(4);
		numbers.add(7);
		numbers.add(8);
		numbers.add(12);
		
		Stream<Integer> numbersStream = numbers.stream();
		
		int mult = numbersStream.reduce((num1, num2) -> num1 * num2).get();
		System.out.println(mult);
		

	}

}
