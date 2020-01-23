package com.bridgelabz.datastructure;

import com.bridgelabz.util.SinglyLinkedListUtility;
import com.bridgelabz.util.SinglyLinkedListUtility.ListNode;
import com.bridgelabz.util.Utility;

public class OrderedList {

	public static void main(String[] args) {
		SinglyLinkedListUtility<Integer> sll = new SinglyLinkedListUtility<Integer>();
		String str = "",path = "/home/mobicom/Documents/unOrderedNums.txt";
		String[] strng;
		int[]  sortedARRAY;
		try{
			str = Utility.readFile(path);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		strng = str.split(",") ;
		int[] intarray = new int[strng.length];
		int i = 0;
		for (int l = 0;l < strng.length;l++) {
			intarray[i] = Integer.parseInt(strng[l].trim());
			i++;
		}
		sortedARRAY = Utility.bubbleSort(intarray);
		ListNode head = sll.arrayToList(sortedARRAY, sortedARRAY.length);
		  
		
		String s = Utility.scannerString();
		if(Utility.numberOrNot(s)) {
			int num = Utility.numberOrNotReturn(s);
			if(sll.searchElement(head, num)) {
			ListNode headr =	sll.deleteNodeAtPositionInSLL(head, sll.searchElementposition(head, num));
			sll.display(headr);
			}else {
				ListNode headr =	sll.insertIntoSortedList(head, num);
				sll.display(headr);
			}
			
		}
        
		

	}

}
