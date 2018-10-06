package com.ramnar.create.abstractfactory;

public class ColorFactory extends AbstractFactory {

	@Override
	public IShape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IColor getColor(String color) {
		if("green".equalsIgnoreCase(color)) {
			return new GreenColor();
		}else if("red".equalsIgnoreCase(color)) {
			return new RedColor();
		}
		return null;
	}

}
