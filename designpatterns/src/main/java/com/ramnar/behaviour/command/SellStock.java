package com.ramnar.behaviour.command;

public class SellStock implements Order {
	
	private Stock stock;
	
	

	public SellStock(Stock stock) {
		super();
		this.stock = stock;
	}



	public void execute() {
		stock.sell();

	}

}
