/***********************************************************************************
 * purpose : A program with cubic running time. Read in N integers and counts the **
 * number of triples that sum to exactly 0.prints the distinct triplets.          **                                                                                                     **
 * @author SHAFAT BASHIR                                                          **                   ** 
 * @version 1.0                                                                   **                  **
 * @since 11/01/2020                                                              **                 **
 * *********************************************************************************
 */
package com.bridgelabz.functionalprograms;

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
					i--;
					continue;
				}
			}
			
		}else {
			System.out.println("! Wrong input ");
		}
		Utility.nOfTriples(arr);
	}
}
