package com.poc;

import java.util.*;

public class ListExample {
	
	List<String> ll;
	
	public ListExample(){
		
		ll = new ArrayList<String>();
	}

	
	public void addElelments() {
		
		ll.add("Inportia");
		ll.add("Chetan");
		ll.add("Sagar Saibewar");
		ll.add("Supriya");
		ll.add("Supriya");
	}
	
	public void displayElements() {
		
		System.out.println(ll);
		
		int len = ll.size();
		for(int i=0;i<len;i++) {
			
			System.out.println(ll.get(i));
		}
		
	}
	
	public void removeElements() {
		
	}
	
}
