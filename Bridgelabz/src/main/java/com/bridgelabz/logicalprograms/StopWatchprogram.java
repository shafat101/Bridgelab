package com.bridgelabz.logicalprograms;

import com.bridgelabz.util.Utility;

public class StopWatchprogram {

	public static void main(String[] args) {
		String s;int n=0;int start,end;
		System.out.println("Type an key [1] and press enter to start : ");
		s = Utility.scannerString();
		if(Utility.numberOrNot(s)) {
			n = Utility.numberOrNotReturn(s);
			if(Utility.checkZero(n)) {
				System.out.println("!Invalid Input");
			}else {
				System.out.println(Utility.timeInMills());
				System.out.println("Enter [0] to stop");
				s = Utility.scannerString();
				if(Utility.numberOrNot(s)) {
					n = Utility.numberOrNotReturn(s);
					if(Utility.checkZero(n)) {
						System.out.println(Utility.timeInMills());
					}
					
				}
			}
		}
		
		

	}

}
