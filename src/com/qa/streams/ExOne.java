package com.qa.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ExOne {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();

		names.add("Michael");
		names.add("Dean");
		names.add("James");
		names.add("Chris");

		Stream<String> namesStream = names.stream();

		namesStream.filter(name -> ! name.contains("J")).forEach(value -> System.out.println("Hello " + value));

	}

}
