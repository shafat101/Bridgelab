package com.bridgelabz.creationaldesignpatterns;

import java.lang.reflect.Constructor;

public class UsingReflectiontodestroySingletonPattern {
	 public static void main(String[] args) {
		 EagerInitilization instanceOne = EagerInitilization.getInstance();
		 EagerInitilization instanceTwo = null;
	        try {
	            Constructor[] constructors = EagerInitilization.class.getDeclaredConstructors();
	            for (Constructor constructor : constructors) {
	                //Below code will destroy the singleton pattern
	                constructor.setAccessible(true);
	                instanceTwo = (EagerInitilization) constructor.newInstance();
	                break;
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        System.out.println(instanceOne.hashCode());
	        System.out.println(instanceTwo.hashCode());
	    }
}
