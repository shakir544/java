package org.sgooty.exceptions;

public class InterruptedException{
	
		
	public static void main(String args[]){ 
		
		Thread t = new Thread() { 
			
			public void run() { 
				try { 
					Thread.sleep(10000);
				}catch(Exception e){ 
					e.printStackTrace();
				}
			}
		};
		
		t.start();
		
		try{ 
			Thread.sleep(300);
		}catch(Exception e){ 
			e.printStackTrace();
		}

	}
	
	
	

}
