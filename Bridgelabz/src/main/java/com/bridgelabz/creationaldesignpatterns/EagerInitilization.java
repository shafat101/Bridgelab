package com.bridgelabz.creationaldesignpatterns;




 

public class EagerInitilization {
	
	
	 private static final EagerInitilization instance = new EagerInitilization();
	    
	    //private constructor to avoid client applications to use constructor
	    private EagerInitilization(){}

	    public static EagerInitilization getInstance(){
	        return instance;
	    }
}
