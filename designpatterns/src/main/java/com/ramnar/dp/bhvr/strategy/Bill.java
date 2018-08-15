package com.ramnar.dp.bhvr.strategy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bill {
	
	private List<LineofItem> items =  new ArrayList<LineofItem>();
	
	public void addItem(LineofItem item) {
		items.add(item);
	}
	
	public void payBill(IPayment payment) {
		BigDecimal totalBill = new BigDecimal(0000.00);
		
		for(LineofItem item : items) {
			totalBill = totalBill.add(item.getCost());
		}
		
		payment.pay(totalBill.doubleValue());
	}

}
