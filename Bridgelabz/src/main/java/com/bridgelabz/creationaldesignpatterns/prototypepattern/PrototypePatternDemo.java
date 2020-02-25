package com.bridgelabz.creationaldesignpatterns.prototypepattern;

public class PrototypePatternDemo {

	public static void main(String[] args) {
		
		ShapeCache.loadCache();
		
		Shape clonedShape = (Shape) ShapeCache.getShape("1");
		System.out.println("shape : " + clonedShape.getType());
		
		Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
		System.out.println("shape : " + clonedShape2.getType());
		
		Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
		System.out.println("shape : "+ clonedShape3.getType());
	}
	
	
}
