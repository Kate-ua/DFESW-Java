package com.qa.hashmap;

import java.util.HashMap;

public class MorseTranslator {

	private HashMap<String, String> codeAndLetter;

	public MorseTranslator() {

		this.codeAndLetter = new HashMap<>();

		this.codeAndLetter.put(".---", "J");
		this.codeAndLetter.put("...-", "V");
		this.codeAndLetter.put(".-", "A");
		this.codeAndLetter.put("..", "I");
		this.codeAndLetter.put("...", "S");
		this.codeAndLetter.put("-.-.", "C");
		this.codeAndLetter.put(".-..", "L");
		this.codeAndLetter.put("---", "O");
		this.codeAndLetter.put("-.-", "K");
		this.codeAndLetter.put("/", " ");
	}

	public void translate(String input) {
		
		String[] inputArray = input.split(" ");
			
					
			for (String value : inputArray) {
				System.out.print(codeAndLetter.get(value));
		}
		}

}
