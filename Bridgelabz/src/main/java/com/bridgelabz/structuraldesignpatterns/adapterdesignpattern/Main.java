package com.bridgelabz.structuraldesignpatterns.adapterdesignpattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Sparrow sparrow = new Sparrow();
     ToyDuck toyduck = new PlasticToyDuck();
     
  // Wrap a bird in a birdAdapter so that it  
     // behaves like toy duck 
     ToyDuck birdAdapter = new BirdAdapter(sparrow); 
     System.out.println("Sparrow..."); 
     sparrow.fly(); 
     sparrow.makeSound(); 

     System.out.println("ToyDuck..."); 
     toyduck.squeak(); 

     // toy duck behaving like a bird  
     System.out.println("BirdAdapter..."); 
     birdAdapter.squeak(); 
	}

}
