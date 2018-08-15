package com.ramnar.dp.bhvr.command;

public class Stock {
	
	private String name;
	private int quantity;
	
	public Stock(String name, int quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
	}
	
	public void buy() {
		System.out.println("Purchased stock " + name + " of quantity " + quantity);
	}
	
	public void sell() {
		System.out.println("Sell stock " + name + " of quantity " + quantity);

	}

	
}
