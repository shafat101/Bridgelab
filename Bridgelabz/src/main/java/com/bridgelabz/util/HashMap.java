package com.bridgelabz.util;

import com.bridgelabz.util.SinglyLinkedListUtility.ListNode;

public class HashMap<T> {
	int len = 11;
   ListNode<T> head;
   ListNode<T> a[] = new ListNode[len];
   
   public void add(T data) {
	   
	   int index=(int)data%len;
	   if(a[index] == null) {
		   a[index] = new ListNode(data);
	   }
	   else {
		   ListNode<T> n = a[index];
		   while(n.next != null) {
			   n=n.next;
		   }
		   n.next=new ListNode(data);
	   }
   }
   public void printH() {
	   for (int i = 0;i < a.length;i++) {
		   if(a[i]!=null) {
			   ListNode<T> temp = a[i];
			   do {
				   System.out.println(temp.data + "  ");
				   temp=temp.next;
			   }while(temp!=null);
		   }
	   }
	   System.out.println();
   }
   public void searchHa(T searchEl) {
	   int index = (int) searchEl%len;
	   int count = 0;
	   if(a[index] == searchEl) {
		  System.out.println("Element Found");
	   }else {
		   
		   if(a[index] != null) {
		   ListNode<T> temp = (ListNode<T>) a[index];
		   while(temp!=null) {
			   count++;
			   if(temp.data == searchEl) {
				   System.out.println("Element found in OrderOf  ("+count+")  Time  : "+temp.data);
				  
				   break;
			   }else {
				   temp=temp.next;
			   }
		   }
		   if(temp == null) {
			   System.out.println("Element Not found !"); 
		   }
		  
		   }
	   }
   }
}
