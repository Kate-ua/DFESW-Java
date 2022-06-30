package com.qa.openclose;

public class JustGreeting implements Greeting {
	
	private String greetingType;
	
	public JustGreeting(String greeting) {
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


