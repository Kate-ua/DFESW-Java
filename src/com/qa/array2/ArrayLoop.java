package com.qa.array2;

public class ArrayLoop {

	public static void main (String[] args) {
		method2();
	}

	public static void method2() {
		int[] values = new int[10];
		for (int i = 0; i < values.length; i++) {
			values[i] = i + 2;
			System.out.println(values[i]);

		}

	}
}
