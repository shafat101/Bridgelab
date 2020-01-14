package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.Utility;

public class Quadratic {

	public static void main(String[] args) {
		int abc = 3;int[] arr = Utility.scannerArray(abc);
		Utility.output(Utility.StringOf(Utility.rootOne(arr[0], arr[1], arr[2])));
		Utility.output(Utility.StringOf(Utility.rootTwo(arr[0], arr[1], arr[2])));
	}

}
