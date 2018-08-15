package com.ramnar.dp.bhvr.visitor;

public class Engine implements CarElement {

	public void accept(CarVisitor visitor) {
		visitor.visit(this);

	}

}
