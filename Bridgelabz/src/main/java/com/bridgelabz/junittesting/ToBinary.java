package com.bridgelabz.junittesting;

import java.util.ArrayList;

import com.bridgelabz.util.Utility;

public class ToBinary {

	public static void main(String[] args) {
		String s = Utility.scannerString();
		ArrayList<Integer> arr;
		if(Utility.numberOrNot(s)) {
			int num = Utility.numberOrNotReturn(s);
			arr = Utility.toBinary(num);
			 arr = 	Utility.reverseArr(arr);
			 for (int i : arr) {
					System.out.print(i);
				}
		}
		
	
    
    
	
	}

}
