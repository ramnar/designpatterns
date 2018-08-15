package com.ramnar.dp.bhvr.visitor;

public interface CarVisitor {

	void visit(Body body);
	
	void visit(Engine engine);
	
	void visit(Wheel wheel);
	
	void visit(Car car);

}
