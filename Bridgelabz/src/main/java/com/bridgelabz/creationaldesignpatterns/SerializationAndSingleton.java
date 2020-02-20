package com.bridgelabz.creationaldesignpatterns;

public class SerializationAndSingleton {
	 private static final long serialVersionUID = -7604766932017737115L;

	    private SerializationAndSingleton(){}
	    
	    private static class SingletonHelper{
	        private static final SerializationAndSingleton instance = new SerializationAndSingleton();
	    }
	    
	    public static SerializationAndSingleton getInstance(){
	        return SingletonHelper.instance;
	    }
}
