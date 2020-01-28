package com.bridgelabz.datastructure;

import com.bridgelabz.util.Utility;

public class ExtendPrimeNumbers {

	public static void main(String[] args) {
int[][] arr = new int[26][10];
		
		int low = 0;
		int high = 1000;
		int j = 0;
		
			
		
		while(low < high) {
		low +=  (high / 10);
	//	System.out.println(low);
		int[] arr1D = Utility.rangePrineNumbers(low - 100,low);
		//System.out.println("**************");
		for(int l = 0;l < 25;l++){
			arr[l][j] = arr1D[l];	
		}
		j++;	
	}
		for(int k = 0;k < arr.length;k++){
			for(int m = 0;m < arr[k].length;m++) {
				System.out.print(arr[k][m] + "  ");
			}
			System.out.println();
		}
	}

	}


