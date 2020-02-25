package com.bridgelabz.structuraldesignpatterns.facadedesignpattern;

public class ShapeMaker {

	private Shape circle;
	private Shape reactangle;
	private Shape square;
	
	
	public  ShapeMaker() {
	 circle = new Circle();
	 reactangle = new Reactangle();
	 square = new Square();
	}
	
	public void drawCircle() {
		circle.draw();
	}
	
	public void drawReactangle() {
		reactangle.draw();
	}
	
	public void drawSquare() {
		square.draw();
	}
}
