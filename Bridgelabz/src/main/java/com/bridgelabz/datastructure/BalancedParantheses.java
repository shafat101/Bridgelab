package com.bridgelabz.datastructure;

import com.bridgelabz.util.StackOperations;
import com.bridgelabz.util.Utility;


public class BalancedParantheses {

	public static void main(String[] args) {
		StackOperations<Integer> stack = new StackOperations<Integer>();
		System.out.println("Enter the Arithmetic Expression : ");
		String s =  Utility.scannerString();
		int count1=0,count2=0;
		for(int i = 0;i < s.length();i++) {
			//System.out.println(s.charAt(i));
			if(s.charAt(i) == '(') {
				stack.push((int) '(');
				count1++;
			}else if(s.charAt(i) == ')') {
				if(stack.isEmpty()) {
					count2++;
					continue;
				}
				count2++;
				stack.pop();
			}
		}
		if(count1 == count2) {
			System.out.println("Empty stack : ");
		}else {
			System.out.println("Stack not empty : ");
		}

	}

}
