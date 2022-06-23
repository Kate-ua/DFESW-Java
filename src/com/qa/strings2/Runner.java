package com.qa.strings2;

public class Runner {

	public static void main(String[] args) {
		ExerciseTwo ext = new ExerciseTwo();

		int numOfWords = ext.method1("Hello World I am here");
		System.out.println(numOfWords);

		ext.method2("Word by word");
		ext.method3("Reversing sentence");

		boolean result = (ext.method4("Good morning everyone", "morning everyone"));
		System.out.println(result);
	}
}
