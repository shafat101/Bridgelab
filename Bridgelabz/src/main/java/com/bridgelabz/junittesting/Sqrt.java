package com.bridgelabz.junittesting;

import com.bridgelabz.util.Utility;

public class Sqrt {

	public static void main(String[] args) {
		String s = Utility.scannerString();
		if(Utility.numberOrNot(s)) {
			int num = Utility.numberOrNotReturn(s);
		double res =	Utility.sqrtNewtonsMethod(num);
		Utility.output("Square root of "+num +" by Newtons method = "+res);
		}

	}

}
