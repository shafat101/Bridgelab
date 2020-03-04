package com.bridgelabz.oop.utility;



public class Queue<T> {
	
	// A class to represent a queue 
	// The queue, front stores the front node of LL and rear stores the 
	// last node of LL 
	
	    Qnode front, rear; 
	    private int count; 
	    public Queue() 
	    { 
	        this.front = this.rear = null; 
	        this.count = 0;
	    } 
	  
	    public  void display(Qnode head){
			if(head == null) {
				return;
			}
			Qnode current = head;
		 while(current != null) {
			 System.out.println(current.key );
			 current = current.next;
		 }
		}
	    // Method to add an key to the queue. 
	    public void enqueue(T key) 
	    { 
	  
	        // Create a new LL node 
	        Qnode temp = new Qnode(key); 
	  
	        // If queue is empty, then new node is front and rear both 
	        if (this.rear == null) { 
	            this.front = this.rear = temp; 
	            return; 
	        } 
	  
	        // Add the new node at the end of queue and change rear 
	        this.rear.next = temp; 
	        this.rear = temp; 
	        count++;
	    } 
	  
	    // Method to remove an key from queue. 
	    public Qnode dequeue() 
	    { 
	        // If queue is empty, return NULL. 
	        if (this.front == null) {
	            return null; 
	        }
	        // Store previous front and move front one node ahead 
	        Qnode temp = this.front; 
	        this.front = this.front.next; 
	  
	        // If front becomes NULL, then change rear also as NULL 
	        if (this.front == null) { 
	            this.rear = null; 
	        }
	        count--;
	        return temp; 
	    } 
	    public int size() {
	    	return count;
	    }
	    public boolean isEmpty() {
			return (size() == 0);
		}
	    

}
