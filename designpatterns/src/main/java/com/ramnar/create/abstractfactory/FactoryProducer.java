package com.ramnar.create.abstractfactory;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(String choice) {
		if("color".equalsIgnoreCase(choice)) {
			return new ColorFactory();
		}else if("shape".equalsIgnoreCase(choice)) {
			return new ShapeFactory();
		}
		return null;
	}

}
