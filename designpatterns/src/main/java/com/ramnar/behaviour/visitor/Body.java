package com.ramnar.behaviour.visitor;

public class Body implements CarElement {

	public void accept(CarVisitor visitor) {
		visitor.visit(this);

	}

}
