package com.ramnar.behaviour.visitor;

public class Wheel implements CarElement {

	public void accept(CarVisitor visitor) {
		visitor.visit(this);

	}

}
