package com.ramnar.behaviour.command;

public class BuyStock implements Order {
	
	private Stock stock;
	
	

	public BuyStock(Stock stock) {
		super();
		this.stock = stock;
	}



	public void execute() {
		stock.buy();

	}

}
