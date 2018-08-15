package com.ramnar.dp.bhvr.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
	
	private List<Order> orders = new ArrayList<Order>();
	
	public void takeOrders(Order order) {
		orders.add(order);
	}
	
	public void placeOrders() {
		for(Order order : orders) {
			order.execute();
		}
		orders.clear();
	}

}
