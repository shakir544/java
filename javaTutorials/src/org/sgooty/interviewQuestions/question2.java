package org.sgooty.interviewQuestions;

public class question2 {
	public static void function(String s) { 
		System.out.println("String");
	}
	
	public static void function(Object o) { 
		System.out.println("Object");
	}
	
	public static void function(Integer i){ 
		System.out.println("Integer");
	}
	
	public static void main(String args[]) { 
		function(null);
	}
	
	//Answer : Compiler Error 
	// Function is ambigious 

}
