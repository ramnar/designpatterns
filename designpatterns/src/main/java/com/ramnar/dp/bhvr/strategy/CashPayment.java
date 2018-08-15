package com.ramnar.dp.bhvr.strategy;

public class CashPayment implements IPayment {

	public void pay(double amount) {
		System.out.print("Cash payment of " + amount + "done successfully");

	}

}
