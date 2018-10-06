package com.ramnar.struct.bridge;

public class GreenCircle implements IDrawAPI {

	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing green circle  of radius " + radius + " and coordinates " + x + " " + y);

	}

}
