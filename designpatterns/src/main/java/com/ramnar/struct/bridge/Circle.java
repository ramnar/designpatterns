package com.ramnar.struct.bridge;

public class Circle extends Shape {
	
	private int x, y, radius;
	
	protected Circle(int x, int y, int radius, IDrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
		
	}

	@Override
	public void draw() {
		drawAPI.drawCircle(radius, x, y);

	}

}
