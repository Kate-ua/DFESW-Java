package com.qa.strings2;

public class ExerciseTwo {

	// count and return how many words there are in that String
	public int method1(String sentence) {
		String[] words = sentence.split(" ");
		return words.length;

	}

//print out this String in a vertical fashion, each word on a different line.
	public void method2(String sentence) {
		String[] words = sentence.split(" ");
		for (String word : words) {
			System.out.println(word);

		}
	}

// print out this String in a vertical fashion in reverse order, each word on a different line.
	public void method3(String sentence) {
		String[] words = sentence.split(" ");

		for (int i = words.length - 1; i >= 0; i--) {
			System.out.println(words[i]);
		}
	}

// takes 2 Strings; the first is message and the second is the String you want to find in the message. 
//	A boolean value should be returned to indicate whether or not the second String has been found in the message.	

	public boolean method4(String message, String sentencein) {
		return message.contains(sentencein);

	}

}
