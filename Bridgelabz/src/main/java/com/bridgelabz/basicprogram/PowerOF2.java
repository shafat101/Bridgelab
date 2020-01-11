/************************************************************************************************************************
 * purpose :  takes a command-line argument N and prints a table of the powers of 2 that are less than or equal to 2^N **
 *                                                                                                                     **   
 * @author SHAFAT BASHIR                                                                                               **
 * @version 1.0                                                                                                        **
 * @since 10/01/2020                                                                                                   **
 * **********************************************************************************************************************        
 */
package com.bridgelabz.basicprogram;

import com.bridgelabz.util.Utility;

public class PowerOF2 {

	public static void main(String[] args) {

		Utility.output("Enter the Value of N : ");
		String s = Utility.scannerString();
		int n;
		if (Utility.numberOrNot(s)) {
			n = Utility.numberOrNotReturn(s);
			if (n < 31) {
				for (int i = 0; i <= n; i++) {
			        Utility.output(Utility.StringOf(Math.pow(2, i)));
				}
			} else {
				Utility.output("! Invalid input value ,datatype int  can't it");
			}
		}

	}



}
