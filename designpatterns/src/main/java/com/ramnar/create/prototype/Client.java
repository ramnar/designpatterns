package com.ramnar.create.prototype;

public class Client {
	
	public static void main(String[] args) {
		 ShapeCache.loadCache();

	      Shape clonedShape = (Shape) ShapeCache.getShape("1");
	      System.out.println("Shape : " + clonedShape.getType());			

	      Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
	      System.out.println("Shape : " + clonedShape3.getType());	
	}

}
