package com.bridgelabz.logicalprograms;

import com.bridgelabz.util.Utility;

public class StopWatchprogram {

	public static void main(String[] args) {
		String s;int n=0;int start = 0,end = 0;
		System.out.println("Type an key [1] and press enter to start : ");
		s = Utility.scannerString();
		if(Utility.numberOrNot(s)) {
			n = Utility.numberOrNotReturn(s);
			if(Utility.checkZero(n)) {
				System.out.println("!Invalid Input");
			}else {
				start =(int) Utility.timeInMills();
				System.out.println(start);
				System.out.println("Enter [0] to stop");
				s = Utility.scannerString();
				if(Utility.numberOrNot(s)) {
					n = Utility.numberOrNotReturn(s);
					if(Utility.checkZero(n)) {
						end =(int) Utility.timeInMills();
						System.out.println(end);
					}
					
				}
			}
		}
		System.out.println("Time Elapsed : "+(end - start) / 1000 +" Seconds");
		

	}

}
