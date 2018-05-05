package com.poc;

public class StringOperations {

	String fullName="Sagar Saibewar";
	
	public void printCharofString() {
		
		int len = fullName.length();
		
	
		for(int index=0;index<len;index=index++) {
			
			if(fullName.charAt(index)== 'a' || fullName.charAt(index)== 'e'
					|| fullName.charAt(index)== 'i' || fullName.charAt(index)== 'o' || fullName.charAt(index)== 'u') {
				
				System.out.println(fullName.charAt(index) + "");
				
		}
	}
	}
	
	
	public void sampleOperations() {
		
		String name = "chetan";
		
		String fname= "chetan";
	
		String lname = new String("Chetan");
		
		System.out.println(lname.hashCode());
		
		System.out.println(fname);
		
		System.out.println(name.hashCode());
		
		System.out.println(name);
		
		System.out.println(name.hashCode());
		
		name = name.concat("Bendre");
		
		System.out.println(name);
		
		System.out.println(name.hashCode());
	
	}
	
	public void reverseString(String str) {
		
		int len = str.length();
		
		int lastI=len-1;
		
		for(int i=0;i<len;i++) {

			System.out.print(str.charAt(lastI));
			
			lastI--;
		}
		
//		for(int i=len-1;i>=0;i--) {
//			System.out.println(str.charAt(i));
//		}
		
				
	}
	
	
	public void handlingExceptions() throws Exception {
		
		String companyName="Inportia";
		
		try {
			
			System.out.println("Before exception");
			
			System.out.println(companyName.length());
			
			System.out.println("After exception");
			
			System.out.println(companyName.charAt(0));
			
			Exception po = new Exception();
			
			throw po;
			
		}
		
//		catch(NullPointerException npe) {
//			
//			System.out.println("In null catch block");
//			
//		}
//		
//		catch(RuntimeException rte) {
//			
//			System.out.println("In runtime block");
//			
//		}
		
		finally {
			System.out.println("In finally block");
		}
		
	}
	
	
}
