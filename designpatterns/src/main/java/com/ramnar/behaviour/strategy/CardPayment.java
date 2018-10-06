package com.ramnar.behaviour.strategy;

public class CardPayment implements IPayment {

	public void pay(double amount) {
		System.out.print("Card payment of " + amount + "done successfully");

	}

}
