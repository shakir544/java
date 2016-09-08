package org.sgooty.linkedlists;

import java.util.HashMap;
import java.util.Map;

public class loopInList {
	
	// Function to find whether a list has a loop or not
	
	public static boolean ifListHasLoop(Node head) { 
		// Source 
		//http://stackoverflow.com/questions/2663115/how-to-detect-a-loop-in-a-linked-list
		
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
	
	// Function to find the length of the list in case of loop. 
	
	public static int lengthOfList(Node head) { 
		Map<Integer,Node> length = new HashMap<Integer,Node>();
		
		if(head ==null)
			return 0; 
		
		if(head.link == null)
			return 1; 
		
		length.put(1, head);
		
		
		
		while(true) { 
			
			head = head.link;
			
		}
		
	
	}
	
	
	public static void main(String args[]){
		
		Node head = new Node(); 
		head.link = new Node(); 
		head.link.link = new Node(); 
		head.link.link.link = new Node(); 
		head.link.link.link = head; 
	
		System.out.println(ifListHasLoop(head));
		
	}
	
	

}
