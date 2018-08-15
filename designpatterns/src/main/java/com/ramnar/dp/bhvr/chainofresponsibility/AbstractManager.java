package com.ramnar.dp.bhvr.chainofresponsibility;

public abstract class AbstractManager {
	
	private AbstractManager next;
	
	public void setNext(AbstractManager next) {
		this.next = next;
	}
	
	abstract protected long getMaxBudget();
	
	abstract protected String getRole();
	
	public void processRequest(long amount) {
		if(amount <= this.getMaxBudget()) {
			System.out.println("Budget of " + amount + " is approved by " + getRole());
		}else if(next != null){
			next.processRequest(amount);
		}
	}

}
