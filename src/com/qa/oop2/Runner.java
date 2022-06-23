package com.qa.oop2;

public class Runner {

	public static void main(String[] args) {

		Car car = new Car("Fast", "C", "White", "Car", "Camry", "Toyota");
		Motorbike motorbike = new Motorbike("Fast", "MB", "Black", "Motorbike", 50, "steel");
		Boat boat = new Boat("Slow", "B", "Brown", "Boat", "A class", "wood");

		Garage gar = new Garage();

		gar.add(car);
		gar.add(motorbike);
		gar.add(boat);

		gar.printEachVeh();
		
		gar.calcBill();
		gar.removeVehId("Boat");
//		gar.emptyGarage();

	}

}
