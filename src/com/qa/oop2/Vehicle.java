package com.qa.oop2;

public class Vehicle {

	private String speed;
	private String iD;
	private String color;
	private String type;

	public Vehicle(String speed, String iD, String color, String type) {
		super();
		this.speed = speed;
		this.iD = iD;
		this.color = color;
		this.type = type;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public String getID() {
		return iD;
	}

	public void setID(String iD) {
		this.iD = iD;

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;

	}

	public void calcBill() {
		System.out.println("");
	}

	@Override
	public String toString() {
		return "Vehicle [speed=" + speed + ", iD=" + iD + ", color=" + color + ", type=" + type + "]";
	}
}
