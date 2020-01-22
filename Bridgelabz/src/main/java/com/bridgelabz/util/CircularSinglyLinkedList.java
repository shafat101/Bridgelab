package com.bridgelabz.util;

public class CircularSinglyLinkedList<T> {

	private ListNode last;
	private int length;
	
	
	private class ListNode<T>{
		private ListNode next;
		private T data;
		
		public ListNode(T data) {
			this.data=data;
		}
	}
	
	public CircularSinglyLinkedList(){
		last = null;
		length = 0;
	}
	
	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public void createCircularSinglyLinkList() {
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third  = new ListNode(3);
		ListNode fourth = new ListNode(4);
		
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = first;
		
		last = fourth;
	}
	
	public void display() {
		if(last == null) {
			return;
		}
		ListNode first = last.next;
		while(first != last) {
			System.out.println(first.data + " "	);
			first = first.next;
		}
		System.out.println(first.data);
	}
	
	//Insert First at singularLinkedList
	public void insertFirst(T data) {
		ListNode temp = new ListNode(data);
		if(last == null) {
			last = temp;
		}else {
			temp.next = last.next;
		}
		last.next = temp;
		length++;
	}
	
	//insert Last node
	public void insertLast(T data) {
		ListNode temp = new ListNode(data);
		if(last == null) {
			last = temp;
			last.next = last;
		}else {
			temp.next = last.next;
			last.next = temp;
			last = temp;
		}
		length++;
	}
	
//	public static void main(String[] args) {
//		CircularSinglyLinkedList<Integer> csll = new CircularSinglyLinkedList<Integer>();
//		//csll.createCircularSinglyLinkList();
//		csll.insertLast(10);
//		csll.insertLast(11);
//		csll.insertLast(12);
//		csll.display();
//
//	}

}
