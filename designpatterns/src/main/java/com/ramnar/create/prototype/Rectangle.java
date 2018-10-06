package com.ramnar.create.prototype;

public class Rectangle extends Shape {
	
	public Rectangle() {
		type = "rectangle";
	}

	@Override
	void draw() {
		System.out.println("Inside rectangle draw method");

	}

}
