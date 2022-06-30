package com.qa.openclose;

public class Runner {

	public static void main(String[] args) {

		FormalGreeting fg = new FormalGreeting("Good evening, Sir.");
		CasualGreeting cg = new CasualGreeting("Sup m8?");
		JustGreeting jg = new JustGreeting("Hello");
		
		
		Greeter greeter = new Greeter();
		
		String greetForm = greeter.greet(fg);
		String greetCas = greeter.greet(cg);
		String greetJust = greeter.greet(jg);
		
		
		System.out.println("Formal greeting: " + greetForm);
		System.out.println("Casual greeting: " + greetCas);
		System.out.println("Standart greeting: " + greetJust);
		
	}
	}


