package com.bridgelabz.basicprogram;

import java.util.ArrayList;

public class Factors {

	public static void main(String[] args) {
		
	     int n = 12;
	     ArrayList<Integer> arr = new ArrayList<Integer>();
	     while(n > 1) {
	    	 for(int i = 2;i <= n;i++) {
	    		 if(n % i == 0) {
	              arr.add(i);
	              n = n / i;
	              break;	    			 
	    		 }
	    	 }
	     }
	     for (Integer integer : arr) {
			System.out.println(integer);
		}
	     
	}

}
