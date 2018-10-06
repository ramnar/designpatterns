package com.ramnar.struct.decorator;

public abstract class ShapeDecorator implements IShape {
	
	protected IShape decoratedShape;
	
	public ShapeDecorator(IShape decoratedShape) {
		super();
		this.decoratedShape = decoratedShape;
	}

	public void draw() {
		decoratedShape.draw();

	}

}
