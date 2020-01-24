package com.bridgelabz.junittesting;

import com.bridgelabz.util.Utility;

public class DayofWeek {

	public static void main(String[] args) {
		 System.out.println("Enter the month : ");
		 String month = Utility.scannerString();
		 System.out.println("Enter the day : ");
		 String day = Utility.scannerString();
		 System.out.println("Enter the year : ");
		 String year = Utility.scannerString();
		int _month = 0,_day = 0,_year = 0;
		
		
		if(Utility.numberOrNot(month) || Utility.numberOrNot(day) || Utility.numberOrNot(year)) {
			
			_month = Utility.numberOrNotReturn(month);
			_day = Utility.numberOrNotReturn(day);
			_year = Utility.numberOrNotReturn(year);
			
			int res = Utility.day(_month, _day, _year);
			
			System.out.println(res);
			
		}

	}

}
