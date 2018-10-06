package com.ramnar.create.factory;

public class ShapeFactory {
	
	public static IShape getShape(String shape) {
		if("circle".equalsIgnoreCase(shape)) {
			return new Circle();
		}else if ("rectangle".equalsIgnoreCase(shape)) {
			return new Rectangle();
		}
		return null;
	}

}
