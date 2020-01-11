package com.bridgelabz.basicprogram;

public class HarmonicNumber {

	public static void main(String[] args) {
		
		double x = 1;
		int n = 10;
		double j = 1;
		//core logic
		for(double i = 2;i <= n;i++) {
			
			x += j/i;
			
		}
		System.out.println(x);

	}

}
