package com.qa.singleresp;

public class Runner {

	public static void main(String[] args) {
		
		Car myCar = new Car("white", "X0", 100);
		System.out.println("My car was " + myCar.getColour());
		
		Mechanic mechanic = new Mechanic();
		mechanic.paint(myCar,  "green");
		System.out.println("Mechanic painted it " + myCar.getColour());
		
		Me me = new Me();
		me.repaint(myCar, "purple");
		System.out.println("I did not like it, so I painted it " + myCar.getColour());
		

	}

}
