/*******************************************************************************************************
 * purpose : To take  User Input n and flips the coin n times and logs percentage of heads and tails” ** 
 *                                                                                                    **
 * @author SHAFAT BASHIR                                                                              ** 
 * @version 1.0                                                                                       **
 * @since 11/01/2020                                                                                  **
 * *****************************************************************************************************
 */
package com.bridgelabz.basicprogram;

import java.util.logging.Level;
import java.util.logging.Logger;
import com.bridgelabz.util.Utility;

public class FlipCoin {

	public static void main(String[] args) {
		System.out.println("Enter the Number : ");
         int n = Utility.scannerInt(),head = 0,tail = 0;
         float headPer = (float) 0.0;
         float tailPer = (float) 0.0;
         Logger logger = Logger.getLogger(FlipCoin.class.getName());
		if(n > 0) {
			for(int i = 0;i <= n;i++) {
	           if ((Utility.rNumberGenerator()) < 0.5) {
	        	   head += 1;
	           }else {
	        	   tail += 1;
	           }	
			}
		}  
		    headPer = (float) Utility.percentage(head,n);
		    tailPer = (float) Utility.percentage(tail,n);

		    logger.log(Level.INFO,"Percentage of Heads + "+headPer+"%");
		    logger.log(Level.INFO,"Percentage of tails + "+tailPer+"%");
	}	
	}



