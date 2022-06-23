package com.qa.oop2;

public class Car extends Vehicle {

		private String model;
		private String brand;
		
			
			public Car(String speed, String iD, String color, String type, String model, String brand) {
			super(speed, iD, color, type);
			this.model = model;
			this.brand = brand;
		}

			public String getModel() {
				return model;
			}

			public void setModel(String model) {
				this.model = model;
			}

			public String getBrand() {
				return brand;
			}

			public void setBrand(String brand) {
				this.brand = brand;
			}
			
			@Override
			public void calcBill() {
				System.out.println("Car bill is 10");
				}
			

			@Override
			public String toString() {
				return "Car [model=" + model + ", brand=" + brand + ", getSpeed()=" + getSpeed() + ", getID()="
						+ getID() + ", getColor()=" + getColor() + ", getType()=" + getType() + "]";
			}

			
					
		} 
		


		
		
		
			