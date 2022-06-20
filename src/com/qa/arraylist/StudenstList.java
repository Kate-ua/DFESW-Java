package com.qa.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudenstList {

	public static void main(String[] args) {
		List<String> students = new ArrayList<>();
		students.add("Brenda");
		students.add("Sharon");
		students.add("Kateryna");
		students.add("Efosa");
		students.add("Anthony");
//		System.out.println(students);

//		for ( String name : students) {
//			System.out.println(name);
//		}

//		System.out.println(students.get(3));
//		students.set(0, "Ola");
//		System.out.println(students);
//	}

//		students.remove(4);
//		System.out.println(students);
//	}
//		Collections.sort(students);
//		for (String i : students) {
//			System.out.println(i);
//		}
//	}
//		Collections.reverse(students);
//		System.out.println(students);
//	}
		Collections.swap(students, 0, 3);
		System.out.println(students);
	}
}
