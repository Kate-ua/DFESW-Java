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
		
		if (this.Physics <90 && this.Chemistry<90 && this.Biology<90) {
			System.out.println(this.percentage);
			System.out.println("Sorry, you failed three subjects");
		}
		else if  ((this.Physics < 90 && this.Chemistry < 90) || (this.Physics < 90 && this.Biology < 90) || (this.Chemistry<90 && this.Biology<90)) {
			System.out.println(this.percentage);
			System.out.println("Sorry, you failed two subjects");
		
					
		}else if (this.percentage < 60 || this.Physics < 90 || this.Chemistry < 90 || this.Biology < 90) {
			System.out.println(this.percentage);
			System.out.println("Sorry, you failed one subject");
			
		 }else {
		System.out.println(this.percentage);
		System.out.println("Congratulations! You passed!");
	}
	}
 }
 