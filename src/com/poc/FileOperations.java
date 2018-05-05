package com.poc;

import java.io.*;

public class FileOperations {
	
	public FileOperations(){
		
	}                                                                
	
	public void readFile() {
		
		File file = new File("C:\\Users\\ABC\\eclipse-workspace\\FirstProject\\src\\com\\poc\\sample.txt");
		try {
			FileInputStream fis = new FileInputStream(file);
			int ascivalue = fis.read();
			
			while(true) {
				
				ascivalue = fis.read();
				if(ascivalue == -1) {
					
					break;		
				}
				
				else {
					
					System.out.println((char)ascivalue);
				}
				
				
			}
			
		fis.close();
			
			System.out.println(fis.read());
		}
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
