package com.qa.exceptions;

public class Runner {

	public static void main(String[] args) {
		Exceptions ex = new Exceptions();
		
		try{
			ex.questionOne();
		}catch (DivisionException de) {
			System.out.println(de.getMessage());
		}
		
	}

}
