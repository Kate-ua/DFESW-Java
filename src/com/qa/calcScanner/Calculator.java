package com.qa.calcScanner;

import java.util.Scanner;

public class Calculator {

	public void calculation() {
		
		Scanner scan = new Scanner(System.in); 
			
			boolean flag = true;

			while (flag) {
				System.out.println("Please enter a number: ");
				float numOne = scan.nextFloat();

				System.out.println("Please enter another number: ");
				float numTwo = scan.nextFloat();

				scan.nextLine();

				System.out.println(
						"For addition press +, for substruction press - , for division press / , for multiplication press * ");

				String choice = scan.nextLine();

				if (choice.equalsIgnoreCase("+")) {
					System.out.println(numOne + numTwo);

				} else if (choice.equalsIgnoreCase("-")) {
					System.out.println(numOne - numTwo);

				} else if (choice.equalsIgnoreCase("*")) {
					System.out.println(numOne * numTwo);

				} else if (choice.equalsIgnoreCase("/")) {

					if (numTwo != 0) {
						System.out.println(numOne / numTwo);
					} else {
						System.out.println("Devision can not be performed");
					}

				} else {
					System.out.println("Bad choice");
									
				}

				System.out.println("Do you want to continue? Yes/No");

				String choice2 = scan.nextLine();

				if (choice2.equalsIgnoreCase("yes")) {
					continue;
				} else if (choice2.equalsIgnoreCase("no")) {
					System.out.println("Calculation is over");
					flag = false;
					continue;

				} else {
					flag = false;
					System.out.println("Bad choice! Start all over");

				}
			}
		}

	}


