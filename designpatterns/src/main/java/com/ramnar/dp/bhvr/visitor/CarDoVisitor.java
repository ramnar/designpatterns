package com.ramnar.dp.bhvr.visitor;

public class CarDoVisitor implements CarVisitor {

	public void visit(Body body) {
		System.out.println("Moving my body");

	}

	public void visit(Engine engine) {
		System.out.println("Starting the engine");

	}

	public void visit(Wheel wheel) {
		System.out.println("Turning the wheel");

	}

	public void visit(Car car) {
		System.out.println("Starting the car");

	}

}
