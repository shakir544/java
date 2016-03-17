package org.sgooty.interviewQuestions;

public class question1 {
	
	public static void function(String s) { 
		System.out.println("String");
	}
	
	public static void function(Object o) { 
		System.out.println("Object");
	}
	
	public static void main(String args[]) { 
		function(null);
	}
	
	// String can take null values 
	// out put would be : String

}
