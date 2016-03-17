package org.sgooty.linkedlists;

public class loopInList {
	
	public boolean ifListHasLoop(Node head) { 
		
		// Base Case 
		if (head == null || head.link == null)
			return false; 
		
		Node slow, fast; 
		
		slow = fast = head; 
		
		while(true) { 
			
			slow = slow.link; 
			fast = fast.link.link; 
			
			if(fast ==null || fast.link==null) { 
				return false; 
			}
			
			if(slow == fast)
				return true; 
		}
		
	}
	
	public static void main(String args[]){
		
		Node head = new Node(); 
		head.link = new Node(); 
		head.link.link = new Node(); 
		head.link.link.link = new Node(); 
		head.link.link.link = head; 
		
		
		// Create object 
		loopInList lil = new loopInList();
		
		
		System.out.println(lil.ifListHasLoop(head));
		
	}

}
