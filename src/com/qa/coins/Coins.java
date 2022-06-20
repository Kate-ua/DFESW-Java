package com.qa.coins;

public class Coins {
	double cost;
	double amount;
	double change;

	public Coins(double cost, double amount) {
		this.cost = cost;
		this.amount = amount;
		this.change = amount - cost;

	}

	public void Change() {
		while (change > 0) {
			
				if (change >= 50) {
					System.out.println(" UKP 50 note");
					change -= 50;
				} else if (change >= 20) {
					System.out.println(" UKP 20 notes");
					change -= 20;
				} else if (change >= 10) {
					System.out.println(" UKP 10 notes");
					change -= 10;
				} else if (change >= 5) {
					System.out.println(" UKP 5 notes");
					change -= 5;
				} else if (change >= 2) {
					System.out.println(" UKP 2 coin");
					change -= 2;
				} else if (change >= 1) {
					System.out.println(" UKP 1 coin");
					change -= 1;
				} else if (change >= 0.5) {
					System.out.println(" 50p coin");
					change -= 0.5;
				} else if (change >= 0.2) {
					System.out.println(" 20p coin");
					change -= 0.2;
				} else if (change >= 0.1) {
					System.out.println(" 10p coin");
					change -= 0.1;
				} else if (change >= 0.05) {
					System.out.println(" 5p coin");
					change -= 0.05;
				} else if (change >= 0.02) {
					System.out.println(" 2p coin");
					change -= 0.02;
				} else if (change >= 0.01) {
					System.out.println(" 1p coin");
					change -= 0.01;
				}
			}
		}
	}

