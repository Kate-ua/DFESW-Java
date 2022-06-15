package com.qa.flowofcontrol;

public class FlowOfControl {

	public static void methodOne() {
		System.out.println("Line 1");
	}

	public static void methodTwo() {
		System.out.println("Line 2");
	}

	public static void methodThree() {
		System.out.println("Line 3");
	}

	public static void main(String[] args) {
		methodOne();
		methodTwo();
		methodThree();
	}

}
