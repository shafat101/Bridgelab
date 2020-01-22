package com.bridgelabz.util;

public class DoublyLinkedListUtility<T> {

	private ListNode head;
	private ListNode tail;
	private int length;
	
	
	private class ListNode{
		private T data;
		private ListNode next;
		private ListNode previous;
		
		public ListNode(T data) {
			this.data = data;
		}	
	}
	
	public DoublyLinkedListUtility() {
		this.head = null;
		this.tail = null;
		this.length =0;
		
	}
	public boolean isEmpty() {
		return head == null; //head == null
	}
	public int length() {
		return length;
	}

	
	//inseart at last
	public void inseartLast(T value) {
		ListNode newNode = new ListNode(value);
			if(isEmpty()) {
				head = newNode;
			}else {
				tail.next =	newNode;
				newNode.previous = tail;
			}
			
			tail = newNode;
			length++;
	}
	
	//Display Forward
	public void displayForward() {
		if(head == null) {
			return;
		}
		ListNode temp = head;
		while(temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	//Display BackWard
	public void displayBackward() {
		if(tail == null) {
			return;
		}
		ListNode temp = tail;
		while(temp != null) {
			System.out.print(temp.data +"-->");
			temp = temp.previous;
		}
		System.out.println("null");
	}
	
	//Insert at first
	public void insertFirst(T value) {
		ListNode newNode = new ListNode(value);
		if(isEmpty()) {
			tail = newNode;
		}else {
			head.previous = newNode;
		}
		newNode.next = head;
		head = newNode;
		length++;
	}
	
	
//	public static void main(String[] args) {
//		DoublyLinkedListUtility<Integer> dll = new DoublyLinkedListUtility<Integer>();
////		dll.insertFirst(2);
////		//dll.insertFirst(3);
////		
////		//dll.inseartLast(2);
////		dll.inseartLast(3);
////		
////		dll.displayForward();
////	//	dll.displayBackward();
//		dll.inseartLast(4);
//		dll.inseartLast(5);
//		dll.inseartLast(6);
//		dll.inseartLast(7);
//		dll.displayForward();
//	}

}
