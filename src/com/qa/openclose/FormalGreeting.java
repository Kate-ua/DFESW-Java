package com.qa.openclose;

public class FormalGreeting implements Greeting {
	
	private String greetingType;
	
	public FormalGreeting(String greeting) {
		this.greetingType = greeting;
	
	}
	
	public String getGreetingType() {
		return greetingType;
		
	}
	
	public void setGreetingType(String greetingType) {
		
		this.greetingType = greetingType;
		
	}
	@Override 
	public String greet() {
		return greetingType;
	
	}
	
	}
