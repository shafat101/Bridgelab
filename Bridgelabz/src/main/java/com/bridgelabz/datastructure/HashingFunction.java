package com.bridgelabz.datastructure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.bridgelabz.util.HashMap;
import com.bridgelabz.util.Utility;

public class HashingFunction {
//Given a collection of items, 
//a hash function that maps each item into a unique slot is referred to as a perfect hash function.	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner file = new Scanner(new File("/home/mobicom/Documents/HashMapfile.txt"));
		HashMap<Integer> h = new HashMap<Integer>();
		int data;
		int inputData;
		while(file.hasNext()) {
			
			data=file.nextInt();
			h.add(data);
			
		}
		h.printH();
		System.out.println("**********");
		String s = Utility.scannerString();
		if(Utility.numberOrNot(s)) {
			inputData = Utility.numberOrNotReturn(s);
			h.searchHa(inputData);
		}
		
	}
}
