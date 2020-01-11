package com.bridgelabz.basicprogram;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.bridgelabz.util.Utility;

public class LeapYear {

	public static void main(String[] args) {
		
		String returnyear =  Utility.scannerString();
		int year;
		Logger logger = Logger.getLogger(LeapYear.class.getName());
		if (returnyear.length() > 3 && returnyear.length() < 5 ) {
			year = Integer.parseInt(returnyear);
			if(Utility.leapOrNot(year)) {
				logger.log(Level.INFO, "Year is a Leap Year : ");
			}else {
				logger.log(Level.INFO, "Year is Not a Leap Year : ");
			}
		}
		
		
	}

}

