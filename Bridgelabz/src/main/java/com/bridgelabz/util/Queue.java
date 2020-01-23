package com.bridgelabz.util;


class QNode { 
    int key; 
    QNode next; 
  
    // constructor to create a new linked list node 
    public QNode(int key) 
    { 
        this.key = key; 
        this.next = null; 
    } 
} 
public class Queue {
	
	// A class to represent a queue 
	// The queue, front stores the front node of LL and rear stores the 
	// last node of LL 
	
	    QNode front, rear; 
	    private int length; 
	    public Queue() 
	    { 
	        this.front = this.rear = null; 
	        this.length = 0;
	    } 
	  
	    // Method to add an key to the queue. 
	    void enqueue(int key) 
	    { 
	  
	        // Create a new LL node 
	        QNode temp = new QNode(key); 
	  
	        // If queue is empty, then new node is front and rear both 
	        if (this.rear == null) { 
	            this.front = this.rear = temp; 
	            return; 
	        } 
	  
	        // Add the new node at the end of queue and change rear 
	        this.rear.next = temp; 
	        this.rear = temp; 
	        length++;
	    } 
	  
	    // Method to remove an key from queue. 
	    QNode dequeue() 
	    { 
	        // If queue is empty, return NULL. 
	        if (this.front == null) {
	            return null; 
	        }
	        // Store previous front and move front one node ahead 
	        QNode temp = this.front; 
	        this.front = this.front.next; 
	  
	        // If front becomes NULL, then change rear also as NULL 
	        if (this.front == null) { 
	            this.rear = null; 
	        }
	        length--;
	        return temp; 
	    } 
	    public int length() {
			return length;
		}
	    public boolean isEmpty() {
			return length == 0;
		}

}
