package com.bridgelabz.junittesting;

import com.bridgelabz.util.Utility;

public class TemperatureConversion {

	public static void main(String[] args) {
		System.out.println("Enter the input Temp : ");
	  	String x = Utility.scannerString();
	  	System.out.println("Enter the Unit to convert (F / C) : ");
	  	String y = Utility.scannerString();
	  	
	  	if(Utility.numberOrNot(x) && Utility.validatinginputChar(y)) {
	  	double res =	Utility.tempConversion(Utility.numberOrNotReturn(x), y.charAt(0));
	  	Utility.output(Utility.StringOf(res));
	  	}else {
	  		Utility.output("Invalid Input");
	  	}
	
	}

}
