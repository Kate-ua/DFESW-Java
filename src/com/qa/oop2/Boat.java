package com.qa.oop2;

public class Boat extends Vehicle {
	
	private String length;
	private String material;
	
	
	public Boat(String speed, String iD, String color, String type, String length, String material) {
		super(speed, iD, color, type);
		this.length = length;
		this.material = material;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	@Override 
	public void calcBill() {
		System.out.println("Boat bill is 10");
		}
	
	@Override
	public String toString() {
		return "Boat [length=" + length + ", material=" + material + ", getSpeed()=" + getSpeed() + ", getID()="
				+ getID() + ", getColor()=" + getColor() + ", getType()=" + getType() + "]";
	}
	
	

}
