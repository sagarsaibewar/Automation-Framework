//Method Overloading:
	
	//1. Method name is same
	//2. Count of parameters can be changed
	//3. Same count of parameters but different data types
	//4. Same data type but sequence can be changed
	//5. It takes place in same CLASS
	//6. Return type is not considered in it.



package com.poc;

public class Student {
	
	String name;
	double fees;
	String dept;
	static int id=0;
	
	static {
		System.out.println("I am in Static block");
	}
	
	public Student() {
		System.out.println("I am Constructor");
		
	}

	public Student(String name){
		
		this.name=name;
		id++;
		//id=id+1;
		//id+=1;
		System.out.println("Student name is:"+ name);
	}
	
	public Student(String name,String dept){
		
		this.name=name;
		this.dept=dept;
		
	}
	
	public Student(double fees,String name){
		
		this.fees=fees;
		this.name=name;
		
		
	}
	
	public Student(String name,double fees){
		this.name=name;
		this.fees=fees;
		
	}
	
	  public void printStudentDetails() {
		  
		  System.out.println("Parent:");
		System.out.println("Name:"+ name);
		System.out.println("ID:"+ id);
		
	}
}
