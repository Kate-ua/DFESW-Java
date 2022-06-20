package com.qa.array;

public class Array {

	public static int[] numberArray = new int[10];

	public static void main(String[] args) {
		numberArray[0] = 2;
		numberArray[1] = 4;
		numberArray[2] = 6;
		numberArray[3] = 8;
		numberArray[4] = 20;
 		numberArray[5] = 10;
		numberArray[6] = 12;
		numberArray[7] = 14;
		numberArray[8] = 16;
		numberArray[9] = 18;
				
		for (int i : numberArray) {
			System.out.println("Number: " + i);
		}

	}
}

