package com.qa.helloworld;

public class HelloWorld {

	public static void main(String[] args) {
		String result = returnString("Original value");
		System.out.println(result);
	}

	public static void printMessage(String myMessage) {
		// DataType variableName = value;
		String message = "Hellow World";
		System.out.println(message);

	}

	public static String returnString(String myMessage) {
		return myMessage + " I've added someting to this!";
	}
}