package com.qa.oop2;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	private List<Vehicle> garage = new ArrayList<>();

	public void add(Vehicle input) {
		garage.add(input);
	}

	public void printEachVeh() {
		for (int i = 0; i < garage.size(); i++) {
			System.out.println(garage.get(i));
		}
	}

	public void calcBill() {
		for (Vehicle vehicle : garage) {
			vehicle.calcBill();
		}
	}

	public void removeVehId(String type) {
		List<Vehicle> toRemove = new ArrayList<>();

		for (Vehicle vehicle : garage) {
			if (vehicle.getClass().getSimpleName().equals(type)) {
				toRemove.add(vehicle);
			}
		}
		for (Vehicle vehicle : toRemove) {
			garage.remove(vehicle);

//			System.out.println();
			System.out.println("Vehicle removed");
//			System.out.println();

		}

	}
	public void emptyGarage() {
		garage.clear();
		System.out.println("There is no vehicle in the garage");
	}

}
