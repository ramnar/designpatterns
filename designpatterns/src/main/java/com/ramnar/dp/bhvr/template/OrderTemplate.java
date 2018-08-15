package com.ramnar.dp.bhvr.template;

public abstract class OrderTemplate {
	
	
	public abstract void doSelect();
	
	public abstract void doPayment();
	
	public abstract void doGiftWrap();
	
	public abstract void doDelivery();
	
	public void order(boolean isGiftWrap) {
		
		doSelect();
		doPayment();
		if (isGiftWrap) doGiftWrap();
		doDelivery();
		
	}

}
