package com.ramnar.create.abstractfactory;

public class ShapeFactory extends AbstractFactory {

	@Override
	public IShape getShape(String shape) {
		if("circle".equalsIgnoreCase(shape)) {
			return new Circle();
		}else if("rectangle".equalsIgnoreCase(shape)) {
			return new Rectangle();
		}
		return null;
	}

	@Override
	public IColor getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

}
