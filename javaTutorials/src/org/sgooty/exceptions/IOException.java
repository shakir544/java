package org.sgooty.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class IOException {
	
	public static void main(String args[]){ 
		
		String fileName = "FileName "; 
		
		try {
			InputStream inputStream = new FileInputStream(new File(fileName));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
