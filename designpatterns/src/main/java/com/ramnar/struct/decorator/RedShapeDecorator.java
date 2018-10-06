package com.ramnar.struct.decorator;

public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(IShape decoratedShape) {
		super(decoratedShape);
		// TODO Auto-generated constructor stub
	}

	public void draw() {
		decoratedShape.draw();
		setBorder(decoratedShape);

	}

	private void setBorder(IShape decoratedShape) {
		System.out.println("Decorated with red border");
		
	}

}
