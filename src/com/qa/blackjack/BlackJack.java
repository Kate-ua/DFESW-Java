package com.qa.blackjack;

public class BlackJack {
	public void blackjack (int numOne, int numTwo) {
		if ((numOne > 0 && numOne <21) && (numTwo > 0 && numTwo <21) && (numTwo>numOne)) {
			System.out.println(numTwo);
		} else if ((numOne > 0 && numOne <21) && (numTwo > 0 && numTwo <21) && (numOne>numTwo)){
			System.out.println(numOne);
		} else 
			System.out.println("0");
	}

}
