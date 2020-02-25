package com.bridgelabz.creationaldesignpatterns.prototypepattern;

public class Circle extends Shape{

	public Circle(){
		type = "Circle";
	}
	
	@Override
  public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Circle ::draw() method");
	}

}
