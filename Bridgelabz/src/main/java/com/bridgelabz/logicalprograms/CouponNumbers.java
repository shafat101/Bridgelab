package com.bridgelabz.logicalprograms;

import com.bridgelabz.util.Utility;

public class CouponNumbers {

	public static void main(String[] args) {
		System.out.println("Enter the Number of Coupons you want : ");
	     String s =	Utility.scannerString();
	      
	     if(Utility.numberOrNot(s)) {
	    	 int n = Utility.numberOrNotReturn(s);
	    	 if(Utility.checkZero(n)) {
	    		 Utility.output("You Entered the Zero value : ");
	    	 }else {
	    		 while(n > 0) {
	    			 Utility.output(Utility.generatingRandom(15));
	    			 n--;
	    		 }
	    	 }
	     }
	     
	     
	     
		
		
	}

}
