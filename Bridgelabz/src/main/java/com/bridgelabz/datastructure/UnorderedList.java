package com.bridgelabz.datastructure;

import java.io.IOException;

import com.bridgelabz.util.AssignValues;
import com.bridgelabz.util.SinglyLinkedListUtility;
import com.bridgelabz.util.SinglyLinkedListUtility.ListNode;
import com.bridgelabz.util.Utility;


public class UnorderedList{

	public static void main(String[] args) throws IOException {
		SinglyLinkedListUtility<Comparable> sll = new SinglyLinkedListUtility<Comparable>();
		AssignValues assn = new AssignValues(null);
		String s = Utility.scannerString();
		ListNode head ;
		
		String[] arr;boolean flag = false;
		int position;
		 String str = "/home/mobicom/Documents/txt.txt";
		
		 arr =  (Utility.readFile(str)).split(" ");
		 
		   
		 //   sll.display(sll.arrayToList(arr, arr.length));
		 assn.setHead(sll.arrayToList(arr, arr.length));
		 flag =  sll.searchElement(s);
		
		  if(flag) {
			  position = sll.searchElementposition(sll.arrayToList(arr, arr.length), s);
			  assn.setHead(sll.arrayToList(arr, arr.length));
	        	head = sll.deleteNodeAtPositionInSLL(position);
			  
		  }else {
			  assn.setHead(sll.arrayToList(arr, arr.length));
			  head =  sll.inseartAtEnd(s);
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
