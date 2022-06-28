package com.qa.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

class Exceptions {

	public void questionOne() throws DivisionException {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter two numbers: ");

		
		try {
			float numOne = scan.nextFloat();
			float numTwo = scan.nextFloat();
			
			if (numTwo>numOne) {
				throw new DivisionException();
			
			}
			
			System.out.println(numOne / numTwo);
			
		} catch (InputMismatchException ime) {
			ime.printStackTrace();
			System.out.println("Invalid");
			
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			
				
		} finally {
			scan.close();

		}

	}
}
