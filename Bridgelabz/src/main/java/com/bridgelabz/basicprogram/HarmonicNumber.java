package com.bridgelabz.basicprogram;

import com.bridgelabz.util.Utility;

public class HarmonicNumber {

	public static void main(String[] args) {
		
		String n = Utility.scannerString();
		if(n.isEmpty()) {
			Utility.outputError();
		}else {
			boolean b = Utility.numberOrNot(n);
			String s;
			int numberOrNotReturn = Utility.numberOrNotReturn(n);
	         if(b) {
	        	 s = Utility.StringOf(Utility.harmonicNumber(numberOrNotReturn));
	        	 Utility.output(s);
	              	 
	         }
		}
		
	}

}
