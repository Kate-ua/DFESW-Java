package com.qa.operators;

public class Operators {
	
	public void calculator(int numOne, int numTwo) {
		System.out.println(numOne+numTwo);
	}
	
	public void multipl(int numOne, int numTwo) {
		System.out.println(numOne*numTwo);
	}
	
	public void substruct(int numOne, int numTwo) {
		System.out.println(numOne-numTwo);
	}
	
	public void division(double numOne, double numTwo) {
		if (numOne < numTwo) {
		System.out.println(numOne/numTwo);
	} else {
		System.out.println("Devision can not be performed");
	}
	}
}
