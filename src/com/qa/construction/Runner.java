package com.qa.construction;

public class Runner {

	public static void main(String[] args) {
		Dog snowy = new Dog ("Bulldog", "small", "white");
		
		Dog chapa = new Dog ("Shepherd", "big");
		
		System.out.println("Snowy breed is " + snowy.breed);
		System.out.println("Snowy size is " + snowy.size);
		System.out.println("Snowy color is " + snowy.color);
		System.out.println();
		System.out.println(chapa.breed);
		System.out.println(chapa.size);
		System.out.println(chapa.color);
		

	}

}
