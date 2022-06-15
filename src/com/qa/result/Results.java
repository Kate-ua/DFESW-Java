package com.qa.result;

 public class Results {
	 
	 public int Physics;
	 public int Chemistry;
	 public int Biology;
	 public int total;
	 public int percentage;
	 
	 public Results (int Physics, int Chemistry, int Biology) {
		 this.Physics = Physics;
		 this.Chemistry = Chemistry;
		 this.Biology = Biology;
		 this.total = Physics+Chemistry+Biology;
	 }

	public void Method1() {
		System.out.println(this.Physics);
		System.out.println(this.Chemistry);
		System.out.println(this.Biology);
		System.out.println(this.total);
}
	
	public void Method2() {
		this.percentage = (total * 100) /450;
		System.out.println(this.percentage);
	}
	
}