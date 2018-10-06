package com.ramnar.behaviour.visitor;

public class Car implements CarElement {

	CarElement[] elements;
	
	public Car() {
		elements = new CarElement[]{new Body(), new Engine(), new Wheel()};
	}
	public void accept(CarVisitor visitor) {
		for(CarElement element : elements) {
			element.accept(visitor);
		}
		visitor.visit(this);
	}

}
