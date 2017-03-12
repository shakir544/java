package org.sgooty.exceptions;

public class StackOverflowError {
	
	public static void parent(){ 
		child(); 
	}
	
	public static void child(){ 
		parent();
	}
	
	public static void main(String args[]){ 
		parent(); 
	}

}
