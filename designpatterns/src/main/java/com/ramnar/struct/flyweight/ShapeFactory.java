package com.ramnar.struct.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
	
	private static Map<String, Object> map = new HashMap<String, Object>();
	
	public static Circle getCircle(String color) {
		Circle circle = (Circle)map.get(color);
		if(circle == null) {
			circle = new Circle("green", 10, 20, 30);
			map.put("green", circle);
		}
		
		return circle;
	}
	

}
