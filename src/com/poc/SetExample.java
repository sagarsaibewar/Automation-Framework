package com.poc;

import java.util.*;

public class SetExample {
	
	Set<String> ss;
	
	public SetExample(){
		
		ss = new LinkedHashSet<String>();
	}

public void addElelments() {
		
	ss.add("Inportia");
	ss.add("Chetan");
	ss.add("Sagar Saibewar");
	ss.add("Supriya");
	ss.add("Supriya");
	ss.add(null);
		
	}
	
	public void displayElements() {
		
		System.out.println(ss);
		
		Iterator<String> itr = ss.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
//		for(String val:ss) {
//			
//			System.out.println(val);
//			
//		}
		
		
		
	}
	
}
