package com.ramnar.dp.bhvr.template;

public class EOrder extends OrderTemplate {

	@Override
	public void doSelect() {
		System.out.println("Select item to buy");

	}

	@Override
	public void doPayment() {
		System.out.println("Make the online payment");

	}

	@Override
	public void doGiftWrap() {
		System.out.println("Do gift wrapping as this is a gift");

	}

	@Override
	public void doDelivery() {
		System.out.println("Deliver product to the customer");

	}

}
