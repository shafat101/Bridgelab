package com.bridgelabz.structuraldesignpatterns.adapterdesignpattern;

public class Sparrow implements Bird{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Sparrow class Flying");
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
	    System.out.println("Sparrow class Sound");	
	}

}
