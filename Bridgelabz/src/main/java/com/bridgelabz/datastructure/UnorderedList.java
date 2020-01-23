package com.bridgelabz.datastructure;

import java.io.IOException;

import com.bridgelabz.util.SinglyLinkedListUtility;
import com.bridgelabz.util.SinglyLinkedListUtility.ListNode;
import com.bridgelabz.util.Utility;


public class UnorderedList{

	public static void main(String[] args) throws IOException {
		SinglyLinkedListUtility<Comparable> sll = new SinglyLinkedListUtility<Comparable>();
		
		String s = Utility.scannerString();
		ListNode head ;
		
		String[] arr;boolean flag = false;
		int position;
		 String str = "/home/mobicom/Documents/txt.txt";
		
		 arr =  (Utility.readFile(str)).split(" ");
		 
		   
		 //   sll.display(sll.arrayToList(arr, arr.length));
		 flag =  sll.searchElement(sll.arrayToList(arr, arr.length), s);
		
		  if(flag) {
			  position = sll.searchElementposition(sll.arrayToList(arr, arr.length), s);
	        	head = sll.deleteNodeAtPositionInSLL(sll.arrayToList(arr, arr.length), position);
			  
		  }else {
			 
			  head =  sll.inseartAtEnd(sll.arrayToList(arr, arr.length), s);
			//  System.out.println("***************************");
			  
		  }
		
		  str = Utility.sLLtoString(head);
		//  System.out.println(str);
		  if(str.isEmpty()) {
			  
		  }else {
			 if(Utility.createFile()) {
				 Utility.writeFile(str);
			 }
		  }
		  
	}
	
	
}
