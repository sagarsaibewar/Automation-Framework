package com.poc;

import java.util.*;

public class MapExample {

	Map<Integer,List<String>> mm;
	
	public MapExample(){
		
		mm = new HashMap<Integer,List<String>>();
		
	}
	
	
	public void addElements() {
		
		List <String> ll = new ArrayList<String>();
		ll.add("sdfsdf");
		ll.add("jdfsdfs");
		
		mm.put(1,ll);
		
////		mm.put(1, "chetan");
//		mm.put(2, "1234");
//		mm.put(3, "Sagar");
//		mm.put(4, "Sagar");
//		mm.put(5, null);
//		mm.put(null,"qwere");
//		mm.put(null,"abc");
	}
	
	public void display() {
		
		System.out.println(mm);
		Set <Integer> keys = mm.keySet();
		
		for(Integer kk:keys) {
			
			System.out.println(mm.get(kk));
			
			List<String> values = mm.get(kk);
			
			for(String vv : values) {
				
				System.out.println("Key :" +kk + ":" + vv);
			}
		}
	}
	
	public void removeElements() {
		
		
	}
}
