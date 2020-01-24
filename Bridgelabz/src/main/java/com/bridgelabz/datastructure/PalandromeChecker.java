package com.bridgelabz.datastructure;


import com.bridgelabz.util.Utility;

public class PalandromeChecker {

	public static void main(String[] args) {
		System.out.println("Enter the String to Know Palandrome or Not : ");
		String s = Utility.scannerString();
	    boolean res = Utility.palandromeFunction(s);
        System.out.println(res);
        
	}

}
