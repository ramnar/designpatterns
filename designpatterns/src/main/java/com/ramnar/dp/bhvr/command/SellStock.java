package com.ramnar.dp.bhvr.command;

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
