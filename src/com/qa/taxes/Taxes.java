package com.qa.taxes;

public class Taxes {
	
// Task 2 creating two independent methods:
//		public void percentagetax(int salary) {
//		if (salary >= 45000) {
//			System.out.println("25% tax");
//		} else if (salary > 29999 && salary < 44999) {
//			System.out.println("20% tax");
//		} else if (salary > 19999 && salary < 29999) {
//			System.out.println("15% tax");
//		} else if (salary > 14999 && salary < 19999) {
//			System.out.println("10%");
//		} else {
//			System.out.println("no taxes to pay");
//		}
//		}
	
	public void taxamount(int salary) {
		if (salary >= 45000) {
			System.out.println("25% tax, UKP " + (25 * salary) / 100 + " to pay");
		} else if (salary > 29999 && salary < 44999) {
			System.out.println("20% tax, UKP " + (20 * salary) / 100 + " to pay");
		} else if (salary > 19999 && salary < 29999) {
			System.out.println("15% tax, UKP " + (15 * salary) / 100 + " to pay");
		} else if (salary > 14999 && salary < 19999) {
			System.out.println("10% tax, UKP " + (10 * salary) / 100 + " to pay");
		} else {
			System.out.println("no taxes to pay");
		}
	}
}
