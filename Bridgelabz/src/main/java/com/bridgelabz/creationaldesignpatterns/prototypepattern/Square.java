package com.bridgelabz.creationaldesignpatterns.prototypepattern;

public class Square extends Shape{

	public Square() {
		type = "Square";
	}
	
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("inside Square ::draw() method");
	}

}
