package com.ramnar.behaviour.command;

public class Client {
	
	public static void main(String[] args) {
		
		Broker brkr = new Broker();
		brkr.takeOrders(new BuyStock(new Stock("INFY", 100)));
		brkr.takeOrders(new BuyStock(new Stock("8KM", 100)));
		brkr.takeOrders(new BuyStock(new Stock("JUSTD", 100)));
		brkr.takeOrders(new SellStock(new Stock("INFY", 100)));
		
		brkr.placeOrders();
		
	}

}
