package com.qa.uniquesum;

public class UniqueSum {
	public void uniquesum (int numOne, int numTwo, int numThree) {
		
		if (numOne == numTwo && numOne == numThree) {
			System.out.println("0");
		} else if (numOne == numThree) {
			System.out.println(numTwo);
		} else if (numTwo == numThree) {
			System.out.println(numOne);
		} else if (numOne == numTwo) {
			System.out.println(numThree);
		} else {
			System.out.println(numOne + numTwo + numThree);
		}
	}

}
