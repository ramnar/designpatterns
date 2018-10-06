package com.ramnar.create.abstractfactory;
//I WANT HAPPINESS
public class Client {

	public static void main(String[] args) {
		AbstractFactory factory = FactoryProducer.getFactory("color");
		IColor color = factory.getColor("red");
		color.fill();
		
		AbstractFactory factory1 = FactoryProducer.getFactory("shape");
		IShape shape = factory1.getShape("rectangle");
		shape.draw();
	}

}
