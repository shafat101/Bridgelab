package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.Utility;

public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("Enter the Length of array : ");
		String s = Utility.scannerString();
		int j = 0;
		if(Utility.numberOrNot(s)) {
			int n = Utility.numberOrNotReturn(s);
			int[] arr = new int[n];
				arr =	Utility.bubbleSort(Utility.scannerArray(n));
			for (int i : arr) {
				Utility.output("Order placed at "+j+" "+ i);
				j++;
			}
		}
		
		

	}

}
