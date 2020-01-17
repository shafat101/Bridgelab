package com.bridgelabz.junittesting;

import com.bridgelabz.util.Utility;

public class MonthlyPayment {

	public static void main(String[] args) {
		System.out.println("Enter the value of P : ");
	   String _P = Utility.scannerString();
	   System.out.println("Enter the value of Y : ");
	   String _Y = Utility.scannerString();
	   System.out.println("Enter the value of R : ");
	   String _R = Utility.scannerString();

	   if(Utility.numberOrNot(_P) && Utility.numberOrNot(_P) && Utility.numberOrNot(_P)) {
		   double p,y,r;
		   p = Utility.numberOrNotReturn(_P);y = Utility.numberOrNotReturn(_Y);r = Utility.numberOrNotReturn(_R);
		  double res = Utility.payment(p, y, r);
		  Utility.output("The Monthly Payment is : " + res);
	   }
	   
	}

}
