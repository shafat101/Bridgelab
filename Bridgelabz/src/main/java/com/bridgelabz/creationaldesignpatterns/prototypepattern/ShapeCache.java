package com.bridgelabz.creationaldesignpatterns.prototypepattern;

import java.util.Hashtable;

public class ShapeCache {
	
    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();
	
    public static Shape getShape(String shapeId) {
    	Shape cachedShape = shapeMap.get(shapeId);
    	return cachedShape;
    }
	
	public static void loadCache() {
		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(),circle);
		
		Square square = new Square();
		square.setId("2");
		shapeMap.put(square.getId(), square);
		
		Reactangle reactangle = new Reactangle();
		reactangle.setId("3");
		shapeMap.put(reactangle.getId(), reactangle);
		
		
	}
	
}
