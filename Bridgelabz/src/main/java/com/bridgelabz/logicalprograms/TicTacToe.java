package com.bridgelabz.logicalprograms;

import com.bridgelabz.util.Utility;

public class TicTacToe {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
//		arr[0][0] = 'x';
		int n = 0;boolean flag = true;
		
		
	     for (int i = 0;i < arr.length;i++) {
	    	 for (int j = 0;j < arr.length;j++) {
	    		 if (flag) {
	    			 arr[i][j] = n--; 
	    		 } 
	    	 }
	     }
	     //input
	     arr[0][0] = 1;arr[0][1] = 1;arr[0][2] = 0;
	     
	     for (int i = 0;i < arr.length;i++) {
	    	 for (int j = 0;j < arr.length;j++) {
	    		 if(arr[i][j] < 0) {
	    			 System.out.print(" " + "-");
	    		 }else {
	    			 System.out.print(" " + arr[i][j]);
	    		 }
	    		 
	    	 }
	    	 System.out.println("");
	     }
	     
		if(Utility.winningLogic(arr)) {
			System.out.println("Some one Won");
		}
	}

}
