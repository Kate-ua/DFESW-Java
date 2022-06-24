package com.qa.calcScanner;

import java.util.Scanner;

public class Calculator {

	public void calculation() {
		Scanner scan = new Scanner(System.in);

		boolean flag = true;

		while (flag) {
			System.out.println("Please enter a number: ");
			int numOne = scan.nextInt();

			System.out.println("Please enter another number: ");
			int numTwo = scan.nextInt();

			scan.nextLine();

			System.out.println(
					"What calculation method would you like to performe? Addition, substruction, division, multiplication");

			String choice = scan.nextLine();

			if (choice.equalsIgnoreCase("addition")) {
				System.out.println(numOne + numTwo);

			} else if (choice.equalsIgnoreCase("substruction")) {
				System.out.println(numOne - numTwo);

			} else if (choice.equalsIgnoreCase("multiplication")) {
				System.out.println(numOne * numTwo);

			} else if (choice.equalsIgnoreCase("division")) {

				if (numTwo!=0) {
					System.out.println(numOne / numTwo);
				} else {
					System.out.println("Devision can not be performed");
				}

			} else {
				System.out.println("Bad choice");
			}
		}

	}

}
