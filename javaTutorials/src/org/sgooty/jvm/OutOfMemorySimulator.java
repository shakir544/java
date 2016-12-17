package org.sgooty.jvm;

import java.util.Map;
import java.util.HashMap;

public class OutOfMemorySimulator {
	
	private static Map<String,OutOfMemorySimulator> leakContainer = new HashMap<String,OutOfMemorySimulator>(); 
	private final static String dataPrefix = "dataDataDataDataData"; 
	private final static boolean slowExecution = true; 
	
	public static void main(String args[]) { 
		System.out.println("Starting the program to crash");
		
	for (int i=0; i< 10000000 ; i++) { 
	
		String data = dataPrefix + i; 
		try { 
			leakContainer.put(data, new OutOfMemorySimulator()); 
			
			
			
			if(slowExecution & i%50==0) { 
				try{ 
					Thread.sleep(1);
				}catch(Exception ignore){}
			
			}
		}catch(Throwable e){ 
			System.out.println("OutOfMemoryException");
			throw e; 
		}
	}
	
	System.out.println("Completed testing");
		
	}
	
	
}
