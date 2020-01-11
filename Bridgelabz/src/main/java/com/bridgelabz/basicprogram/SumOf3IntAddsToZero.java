package com.bridgelabz.basicprogram;

import com.bridgelabz.util.Utility;

public class SumOf3IntAddsToZero {

	public static void main(String[] args) {
		System.out.println("Enter the length of elements : ");
		String s = Utility.scannerString();
		int n;int[] arr = new int[Utility.numberOrNotReturn(s)];
		if(Utility.numberOrNot(s)) {
			n = Utility.numberOrNotReturn(s);
			
			for(int i = 0;i < n;i++) {
				System.out.println("Enter the "+(i+1)+" Element : ");
				s = Utility.scannerString();
				if(Utility.numberOrNot(s)) {
					arr[i] = Utility.numberOrNotReturn(s);
				}else {
					continue;
				}
			}
			
		}else {
			System.out.println("! Wrong input ");
		}
		Utility.nOfTriples(arr);
	}
}
