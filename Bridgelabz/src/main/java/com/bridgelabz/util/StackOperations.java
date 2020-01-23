package com.bridgelabz.util;

import java.util.EmptyStackException;

public class StackOperations<T> {

	private ListNode top;
	private int length;
	
	private class ListNode{
		private T data;
		private ListNode next;
		
		
		public ListNode(T data) {
			this.data = data;
		}		
	}
	public StackOperations() {
		top = null;
		length = 0;
	}
	public int length() {
		return length;
	}
	public boolean isEmpty() {
		return length == 0;
	}
	public void push(T data) {
		ListNode temp = new ListNode(data);
		temp.next = top;
		top = temp;
		length++;
	}
	public int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		int result = (int) top.data;
		top = top.next;
		length--;
		return result;
	}
	public int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return (int) top.data;
	}
	
	

}
