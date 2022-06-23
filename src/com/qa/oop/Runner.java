package com.qa.oop;

public class Runner {

	public static void main(String[] args) {

		EncupPerson samira = new EncupPerson("Samira", 36, "Data Analyst");
		EncupPerson andrew = new EncupPerson("Andrew", 25, "Student");
		EncupPerson emily = new EncupPerson("Emily", 45, "Accountant");

		ListOfPpl lp = new ListOfPpl();

		lp.add(samira);
		lp.add(andrew);
		lp.add(emily);

		lp.printList();
		
		lp.findPerson("Emily");
		
		lp.printEchPerson();

	}
}
