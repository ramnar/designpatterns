package com.ramnar.dp.bhvr.strategy;

public class CardPayment implements IPayment {

	public void pay(double amount) {
		System.out.print("Card payment of " + amount + "done successfully");

	}

}
