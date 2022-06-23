package com.qa.oop;

import java.util.ArrayList;
import java.util.List;

public class ListOfPpl {

	private List<EncupPerson> students = new ArrayList<>();

	public void add(EncupPerson input) {
		students.add(input);
	}

	public void findPerson(String name) {
		for (EncupPerson person : students) {
			if (person.getName().equals(name)) {
				System.out.println("Person found");
			}
		}
	}

	public void printList() {
		System.out.println(students);
	}

	public void printEchPerson() {
		for (EncupPerson person : students) {
			System.out.println(person);
		}
	}
}
