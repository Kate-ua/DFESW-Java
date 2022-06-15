package com.qa.construction;

public class Dog {
	public String breed;
	public String size;
	public String color = "white";
	
	public Dog(String breed, String size, String color) {
		this.breed = breed;
		this.size = size;
		this.color = color;
	}
	
	public Dog(String breed, String size) {
		this.breed = breed;
		this.size = size;
	}
	
	}
