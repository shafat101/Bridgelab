package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.Utility;

public class Distance {

	public static void main(String[] args) {
		int abc = 2;int[] arr = Utility.scannerArray(abc);		
		Utility.output(Utility.StringOf(Utility.cDistance(arr[0], arr[1])));
	}

}
