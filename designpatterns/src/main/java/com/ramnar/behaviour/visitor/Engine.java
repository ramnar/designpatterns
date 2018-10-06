package com.ramnar.behaviour.visitor;

public class Engine implements CarElement {

	public void accept(CarVisitor visitor) {
		visitor.visit(this);

	}

}
