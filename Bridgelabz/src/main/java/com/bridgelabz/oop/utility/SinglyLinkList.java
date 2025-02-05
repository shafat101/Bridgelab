package com.bridgelabz.oop.utility;

public class SinglyLinkList <T> {
	singlyAssignList sal = new singlyAssignList(null);
	
	ListNode head = sal.getHead(); //Head node to hold the list
	//Given a ListNode, print all elements it holds
	public  void display(){
		if(head == null) {
			return;
		}
	 ListNode current = head;
	 while(current != null) {
		 System.out.println(current.data );
		 current = current.next;
	 }
	}
	
	//Returns the length of singlyLinkedList
	public  int length() {
		if(head == null) {
			return 0;
		}
		ListNode current = head;
		int count = 0;
		while(current != null) {
			count++;
			current = current.next;
		}
		//System.out.println("Length = " + count);
		return count;
	}
	
	//insert
//	public ListNode insertt(ListNode head,) {
//		
//	}
	
	//Insearting a Node in SinglyLinkedList at the Beggining
	public  ListNode insertAtBeggining(T x) {
//		if(head == null) {
//			return head;
//		}
		ListNode newNode = new ListNode(x);
		newNode.next = head;
		head = newNode;
		
	//	display(head);
		return head;
	}
	
	//Insearting a Node in SinglyLinkedList at the Beggining
			public  ListNode insertAtBeggining(int x) {
//				if(head == null) {
//					return head;
//				}
				ListNode newNode = new ListNode(x);
				newNode.next = head;
				head = newNode;
				
			//	display(head);
				return head;
			}
	//Insearting a Node in SinglyLinkedList at the End
	public  ListNode inseartAtEnd(T x) {
		if(head == null) {
			return head;
		}
		ListNode newNode = new ListNode(x);
		ListNode current = head;
		while(null != current.next) {
			current = current.next;
			
		}
		current.next = newNode;
		
		
		//display(head);
		return head;
	}
	//Insearting a Node in SinglyLinkedList after a given node
	public  void insearAfterGivenNode(T x) {
		ListNode previous = head;
		if(previous == null) {
			return;
		}
		ListNode newNode = new ListNode(x);
		
		newNode.next = previous.next;
		previous.next = newNode;
		sal.setHead(newNode);
		display();
	}
	
	//Insearting a Node in SinglyLinkedList at a given position
	public  ListNode inseartAtGivenPosition(T data,int p) {
		int size = length();
		if(p > size + 1 || p < 1) {
			
			return head;
		}
		ListNode newNode = new ListNode(data);
		if(p == 1) {
			newNode.next = head;
			return newNode;
		}else {
			
		
		ListNode previous = head;
		int count = 1;
		while(count < p -1) {
			previous = previous.next;
			count++;
		}
		ListNode current = previous.next;
		newNode.next = current;
		previous.next = newNode;
		}
		return head;
	}
	
	//Delete firstnode from linklist in java
	public  ListNode deleteFirstNodeInSingularLinkList() {
		
		if(head == null) {
			return head;
		}
		ListNode temp = head;
		head = head.next;
		temp.next = null;
		return temp;
	}
	
	//Deleting last node of s Linked List in java
	public  ListNode deleteLastNodeFromSLL() {
		if(head == null) {
			return head;
		}
		ListNode last = head;
		ListNode previousToLast = null;
		while(last.next != null) {
			previousToLast = last;
			last = last.next;
		}
		previousToLast.next = null;
		return last;	
	}
	
	//Deleting node from a s Linked List at given Position
	public  ListNode deleteNodeAtPositionInSLL(int position) {
		int size = length();
		if(position > size || position < 1) {
			return head;
		}
		if(position == 1) {
			ListNode temp = head;
			head = head.next;
			temp.next = null;
			return temp;
		}else {
		ListNode previous = head;
		int count = 1;
		while(count < position - 1) {
			previous = previous.next;
			count++;
		}
		ListNode current = previous.next;
		previous.next = current.next;
		current.next = null;
		return head;
		}
		
	}
	
//	Search an Element in a LinkedList
	public  boolean searchElement(T searchKey) {
		
		if (head == null) {
			return false; 
		}
		ListNode current = head;
		while(current != null) {
			if(current.data.equals(searchKey)) {
				return true;
				
			}
			current = current.next;
		}
	return false;	
	}
	
	//Returns position of key element
    public  int searchElementposition(ListNode head,T searchKey) {
		
		
		ListNode current = head;
		int count = 0;
		while(current != null) {
			count++;
			if(current.data.equals(searchKey)) {
				return count;
				
			}
			current = current.next;
		}
	return 0;	
	}

	//Reverse a s Ll 
	public  ListNode riverseLl() {
		if(head == null) {
			return head;
		}
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}
	
	//Find the middle node in sLL
	public  ListNode middleNode() {
		if(head == null) {
			return head;
		}
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		while (fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		return slowPtr;
	}
	
	//Returns the Nth Node for the End of s LinkedList
	public  ListNode nThNodeFromEnd(int n) {
		if(head == null) {
			return head;
		}
		if(n <= 0) {
			throw new IllegalArgumentException("Invalid Value : n = "+n);
		}
	  ListNode mainPtr = head;
	  ListNode refPtr = head;
	  int count = 0;
	  while(count < n) {
		  if(refPtr == null) {
			  throw new IllegalArgumentException(n + " is greater than the number of nodes in the list");
		  }
		  refPtr = refPtr.next;
		  count++;
	  }
	  while(refPtr != null) {
		  refPtr = refPtr.next;
		  mainPtr = mainPtr.next;
	  }
	  return mainPtr;
	  
	}
	
	//Removes the duplicates from the sorted LinkList
	public  ListNode removeDuplicates() {
		   if(head == null) {
			   return head;
		   }
		   ListNode current = head;
		   while(current != null && current.next != null) {
			   if(current.data == current.next.data) {
				   current.next = current.next.next;
			   }else {
				   current = current.next;
			   }
			   
		   }
		   return head;
	}
	
	//Insert Element into Sorted List
	public  ListNode insertIntoSortedList(T value) {
		ListNode newNode = new ListNode(value);
		if(head == null) {
			return head;
		}
		ListNode current = head;
		ListNode temp = null;
		while(current != null && (((Integer) current.data).compareTo((Integer)newNode.data)<0))
		{
			temp = current;
			current = current.next;
		}
		newNode.next = current;
		temp.next = newNode;
		return head;
	}
	
	//Remove a given Key from Singly Linked List
	public  ListNode removeGiveKeyElement(T key) {
//		if(head == null) {
//			return head;
//		}
		ListNode current = head;
		ListNode temp = null;
		
	while(current != null && current.data !=  key) {
		temp = current;
		current = current.next;
	}
	if(current == null) {
		return head; 
		}
	temp.next = current.next;
	return head;
	}
	
	
	
	//it contains a static inner class listnode
	public  static class ListNode<T>{
	   T data;
	    ListNode next;
		
		public ListNode(T data) {
			this.data = data;
			this.next = null;
		}
	}
	public ListNode arrayToList(T arr[],int n) {
		ListNode head = null;
		
		
	    for (int i = n - 1; i >= 0 ; i--) {
	    	//head = null;
//	    	String s = "shafat";
	    	head = insertAtBeggining((T) arr[i]); 
	    	
	    }
	   // System.out.println(head);
	    return head; 
	}
	public ListNode arrayToList(int arr[],int n) {
		ListNode head = null;
		
		
	    for (int i = n - 1; i >= 0 ; i--) {
	    	//head = null;
//	    	String s = "shafat101";
	    	head = insertAtBeggining(arr[i]); 
	    	
	    }
	   // System.out.println(head);
	    return head; 
	}


}
