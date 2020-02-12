

public class LinkedListsTest {
  public  ListNode head = null;
	//private ListNode head; //Head node to hold the list
	
	//Given a ListNode, print all elements it holds
	public void display(){
		if(head == null) {
			return;
		}
	 ListNode current = head;
	 while(current != null) {
		 System.out.print(current.data + " --> ");
		 current = current.next;
	 }
	 System.out.println();
	}
	
	//Returns the length of singlyLinkedList
	public int length(ListNode head) {
		if(head == null) {
			return 0;
		}
		ListNode current = head;
		int count = 0;
		while(current != null) {
			count++;
			current = current.next;
		}
		System.out.println("Length = " + count);
		return count;
	}
	
	//Insearting a Node in SinglyLinkedList at the Beggining
	public void insertAtBeggining(int x) {
		ListNode newNode = new ListNode(x);
		if(head == null) {
			head = newNode;
			return;
		}
		ListNode temp = head;
		newNode.next = temp;
		head = newNode;
	//	head.next = temp; 
		display();
	}
	
	//Insearting a Node in SinglyLinkedList at the End
	public void inseartAtEnd(ListNode head,int x) {
		if(head == null) {
			return;
		}
		ListNode newNode = new ListNode(x);
		ListNode current = head;
		while(null != current.next) {
			current = current.next;
			
		}
		current.next = newNode;
		display();
		
	}
	//Insearting a Node in SinglyLinkedList after a given node
	public void insearAfterGivenNode(ListNode previous,int x) {
		if(previous == null) {
			return;
		}
		ListNode newNode = new ListNode(x);
		
		newNode.next = previous.next;
		previous.next = newNode;
		
		//display(previous);
	}
	
	//Insearting a Node in SinglyLinkedList at a given position
	public ListNode inseartAtGivenPosition(ListNode head,int data,int p) {
		int size = length(head);
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
	public ListNode deleteFirstNodeInSingularLinkList(ListNode head) {
		
		if(head == null) {
			return head;
		}
		ListNode temp = head;
		head = head.next;
		temp.next = null;
		return temp;
	}
	
	//Deleating last node of s Linked List in java
	public ListNode deleteLastNodeFromSLL(ListNode head) {
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
	
	//Deleating node from a s Linked List at given Position
	public ListNode deleteNodeAtPositionInSLL(ListNode head,int position) {
		int size = length(head);
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
		return current;
		}
		
	}
	
	//Search an Element in a LinkedList
	public boolean searchElement(ListNode head,int searchKey) {
		
		if (head == null) {
			return false; 
		}
		ListNode current = head;
		while(current != null) {
			if(current.data == searchKey) {
				return true;
				
			}
			current = current.next;
		}
	return false;	
	}
	
	//Reverse a s Ll 
	public ListNode riverseLl(ListNode head) {
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
	public ListNode middleNode(ListNode head) {
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
	public ListNode nThNodeFromEnd(ListNode head,int n) {
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
	public ListNode removeDuplicates(ListNode head) {
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
	public ListNode insertIntoSortedList(ListNode head,int value) {
		ListNode newNode = new ListNode(value);
		if(head == null) {
			return head;
		}
		ListNode current = head;
		ListNode temp = null;
		while(current != null && current.data < newNode.data) {
			temp = current;
			current = current.next;
		}
		newNode.next = current;
		temp.next = newNode;
		return head;
	}
	
	//Remove a given Key from Singly Linked List
	public ListNode removeGiveKeyElement(ListNode head,int key) {
		if(head == null) {
			return head;
		}
		ListNode current = head;
		ListNode temp = null;
		
	while(current != null && current.data != key) {
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
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        ListNode head = new ListNode(10);
//        ListNode second = new ListNode(8);
//        ListNode third = new ListNode(11);
//        ListNode fourth = new ListNode(11);
//        ListNode fifth = new ListNode(15);
//        ListNode sixth = new ListNode(15);
        
		 //Attach them together to form a list
//        head.next = second; //10 --> 8
//        second.next = third;//8 --> 1
//        third.next = fourth;//1 --> 11
//		fourth.next = fifth;
//		fifth.next = sixth;
        LinkedListsTest linkedListsTest = new LinkedListsTest();
        linkedListsTest.insertAtBeggining(10);
        linkedListsTest.insertAtBeggining(12);
        linkedListsTest.insertAtBeggining(14);
        linkedListsTest.insertAtBeggining(102);
        linkedListsTest.insertAtBeggining(16);
        linkedListsTest.insertAtBeggining(108);
        linkedListsTest.display();        
        
      //  linkedListsTest.insertAtBeggining(head, 25);
      //  linkedListsTest.inseartAtEnd(head, 34);
      //   linkedListsTest.display(head);
      //  linkedListsTest.length(head);
       // ListNode ahead = linkedListsTest.inseartAtGivenPosition(head,14, 1);
       // linkedListsTest.display(ahead);
     //   linkedListsTest.insearAfterGivenNode(head, 90);
       // ListNode last = linkedListsTest.deleteNodeAtPositionInSLL(head, 1);
      //  System.out.println();
       // System.out.println(last.data);
//        if(linkedListsTest.searchElement(head, 8)) {
//        	System.out.println("Search Element Found !!");
//        }else {
//        	System.out.println("Search Element Not Found !! ");
//        }
     //   ListNode reverseListHead = linkedListsTest.riverseLl(head);
       // linkedListsTest.display(reverseListHead);
//        ListNode middleNode = linkedListsTest.middleNode(head);
//        System.out.println(middleNode.data);
//        ListNode nThnode = linkedListsTest.nThNodeFromEnd(head, 2);
//        System.out.println(nThnode.data);
//        for(int i = 0;i < 5;i++) {
//        	linkedListsTest.insertAtBeggining(head, i);;
//        	 linkedListsTest.display(head);
//        	// System.out.println();
//        }
//       
       
       // System.out.println(duplicates.data);
	}
}
