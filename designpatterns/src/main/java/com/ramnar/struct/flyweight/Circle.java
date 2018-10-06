package com.ramnar.struct.flyweight;

import com.ramnar.struct.decorator.IShape;

public class Circle implements IShape {

	private String color;
	private int x, y, radius;
	
	public Circle(String color, int x, int y, int radius) {
		super();
		this.color = color;
		this.setX(x);
		this.setY(y);
		this.setRadius(radius);
	}

	public void draw() {
		System.out.println("Drawing circle with color " + color);

	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

}
