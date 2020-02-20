package com.bridgelabz.creationaldesignpatterns;

public class StaticBlockInitilization {
	 private static StaticBlockInitilization instance;
	    
	    private StaticBlockInitilization(){}
	    
	    //static block initialization for exception handling
	    static{
	        try{
	            instance = new StaticBlockInitilization();
	        }catch(Exception e){
	            throw new RuntimeException("Exception occured in creating singleton instance");
	        }
	    }
	    
	    public static StaticBlockInitilization getInstance(){
	        return instance;
	    }
}
