package com.qa.oop2;

public class Motorbike extends Vehicle {
	
	private int engPower;
	private String chassis;
	
		
		public Motorbike(String speed, String iD, String color, String type, int engPower, String chassis) {
		super(speed, iD, color, type);
		this.engPower = engPower;
		this.chassis = chassis;
	}


		public int getEngPower() {
			return engPower;
		}


		public void setEngPower(int engPower) {
			this.engPower = engPower;
		}


		public String getChassis() {
			return chassis;
		}


		public void setChassis(String chassis) {
			this.chassis = chassis;
		}

		@Override 
		public void calcBill() {
			System.out.println("Motorbike bill is 20");
			}

		@Override
		public String toString() {
			return "Motorbike [engPower=" + engPower + ", chassis=" + chassis + ", getSpeed()=" + getSpeed()
					+ ", getID()=" + getID() + ", getColor()=" + getColor() + ", getType()=" + getType() + "]";
		}

	
	
}

	