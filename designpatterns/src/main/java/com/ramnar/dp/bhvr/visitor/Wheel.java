package com.ramnar.dp.bhvr.visitor;

public class Wheel implements CarElement {

	public void accept(CarVisitor visitor) {
		visitor.visit(this);

	}

}
