package com.ramnar.behaviour.iterator;

public class Client {

	public static void main(String[] args) {
		MContainer namesRepository = new MContainer();

		for (Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
			String name = (String) iter.next();
			System.out.println("Name : " + name);
		}
	}

}
