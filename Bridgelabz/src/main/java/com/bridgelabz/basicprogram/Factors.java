package com.bridgelabz.basicprogram;

import com.bridgelabz.util.Utility;

public class Factors {

	public static void main(String[] args) {
		System.out.println("Enter the value OF N :");
	    String s = Utility.scannerString();
	    if(Utility.numberOrNot(s)) {
	    	int n = Utility.numberOrNotReturn(s);
	    	Utility.arrayPrint(Utility.factors(n));
	    }
	     
	     
	}

}
