package com.ramnar.create.factory;

public class Client {

	public static void main(String[] args) {
		ShapeFactory.getShape("circle").draw();

	}

}
