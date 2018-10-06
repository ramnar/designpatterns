package com.ramnar.behaviour.chainofresponsibility;

public class Client {
	
	public static void main(String[] args) {
		
		ProjectManager mgr = new ProjectManager();
		SeniorProjectManager spm = new SeniorProjectManager();
		DeliveryManager deliverymgr = new DeliveryManager();
		mgr.setNext(spm);
		spm.setNext(deliverymgr);
		
		mgr.processRequest(100000);
		
	}

}
