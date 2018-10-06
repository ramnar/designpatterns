package com.ramnar.struct.bridge;

public class RedCircle implements IDrawAPI {

	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing red circle  of radius " + radius + " and coordinates " + x + " " + y);

	}

}
