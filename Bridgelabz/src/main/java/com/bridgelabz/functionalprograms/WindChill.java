package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.Utility;

public class WindChill {

	public static void main(String[] args) {
		int ab = 2;int[] arr = Utility.scannerArray(ab);
		if (Utility.validatingInputRange(arr[0], arr[1])) {
			Utility.output(Utility.StringOf(Utility.windChill(arr[0], arr[1])));
		}

	}

}
