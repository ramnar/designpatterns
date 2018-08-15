package com.ramnar.dp.bhvr.visitor;

public class Body implements CarElement {

	public void accept(CarVisitor visitor) {
		visitor.visit(this);

	}

}
