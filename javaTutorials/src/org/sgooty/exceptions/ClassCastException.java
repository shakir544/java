package org.sgooty.exceptions;

class Parent { 
	
}

class child extends Parent{ 
	
}

public class ClassCastException {
	
	public static void main(String args[]){ 
		Parent p = new Parent(); 
		//child c = (Parent)p;
		//org.sgooty.exceptions.ClassCastException.main(ClassCastException.java:15)  will be occured

		
	}

}
