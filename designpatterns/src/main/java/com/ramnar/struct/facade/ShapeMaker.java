package com.ramnar.struct.facade;

public class ShapeMaker {
	
	private Square square;
	private Circle circle;
	private Rectangle rectangle;
	public ShapeMaker() {
		square = new Square();
		circle = new Circle();
		rectangle = new Rectangle();
	}
	
	public void drawCircle() {
		circle.draw();
	}
	
	public void drawSquare() {
		square.draw();
	}
	
	public void drawRectangle() {
		rectangle.draw();
	}
	
	

}
