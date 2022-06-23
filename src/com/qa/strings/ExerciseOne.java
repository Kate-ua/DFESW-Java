package com.qa.strings;

public class ExerciseOne {

	public static void main(String[] args) {
		String strOne = "yesterday it was raining";
		String strTwo = "today it is sunny";

		String strThree = strTwo.concat("," + " " + strOne);
		System.out.println(strThree.toUpperCase());
		
		String strFour = ((strTwo.substring(0, 12)) + strOne.substring(17, strOne.length()));
		System.out.println(strFour.toUpperCase());
	}
	
}
