package com.ramnar.behaviour.visitor;

public class Client {

	public static void main(String[] args) {
		Car car = new Car();
		car.accept(new CarDoVisitor());

	}

}
