package com.inportia;

import com.poc.*;

public class SampleClass {

	public static void main(String[] args) {
		
		
		
		ListExample le = new ListExample();
		
		le.addElelments();
		le.displayElements();
		
		SetExample set = new SetExample();
		
		set.addElelments();
	    set.displayElements();
	    
	    MapExample map = new MapExample();
	    map.addElements();
	    map.display();
	    
	    FileOperations file = new FileOperations();
	    file.readFile();
	    
	
	    
	    
//	StringOperations so = new StringOperations();
//	try {
//		so.handlingExceptions();
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	
		
//		Student sagar; // Object declaration
//		sagar = new Student("Sagar Saibewar");
//		sagar.printStudentDetails();
//		
//		Student prasad = new Student("Prasad Deshmukh");
//		prasad.printStudentDetails();
//		Student supriya = new Student("Supriya Deshpande");
//		supriya.printStudentDetails();
//		Student chetan = new Student("Chetan Bendre");
//		chetan.printStudentDetails();
//		
//		
//		EngineeringStudent sumit = new EngineeringStudent();
//		sumit.printStudentDetails();
//		
//		Student sachin = new EngineeringStudent();
//		sachin.printStudentDetails();
		
		
//		Syallabus comp;
//		Proffesor compProf;
		
		// TODO Auto-generated method stub
		/*System.out.println("Hello world");
		learningDatatypes();
		addition();
		substraction();
		multiplication();
		division();
		int result;
		result= addition(5,9);
		System.out.println("Addition is:" +result);
		result=substraction(10,8);
		System.out.println("Subtraction is:" +result);
		result=multiplication(5,8);
		System.out.println("multiplication is:" +result);
		result=division(7,0);
		System.out.println("Division is:" +result);

		printNumbers(1,10);
		
		printNumbersinDesc(1,10);
		
		printNumbersinMultiple(1,10);
*/		
		//printNumbersintriple();
//		int choice=8;
//		
//		swap();
//		swap1();
//		switch(choice) {
//		
//			case 1: System.out.println(addition(3,6));
//				break;
//			case 2:System.out.println(substraction(5,6));
//				break;
//			case 3:System.out.println(multiplication(4,8));
//				break;
//			case 4:System.out.println(division(8,4));
//				break;
//			default: System.out.println("Incorrect choice");
//		}
	}
	public static void learningDatatypes() {
		byte a=0; //Declaration of a variable
		short b=1;
		int c=2;
		long d=3;
		float e=4;
		double f=5;
		char g='Z';
		boolean h=true;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		

	}

	//methods without input parameters
	static void addition() {
		int a=2;
		int b=3;
		System.out.println("Addition is:" +(a+b));
	}

	static void substraction() {
		int x=5;
		int y=2;
		System.out.println("Substraction is:"+(x-y));
	}

	static void multiplication()
	{
		int d=5;
		int y=6;
		System.out.println("Multiplication is:"+(d*y));	
	}

	static void division()
	{
		int d=6;
		int y=6;
		System.out.println("Division is:"+(d/y));	

	}

	//method with input parameters
	static int addition(int a,int b) {
		
		//System.out.println("Addition is:" +(a+b));
		return a+b;
	}

	static int substraction(int a,int b) {
		
		//System.out.println("Subtraction is:" +(a-b));
		return a-b;
	}

	static int multiplication(int a,int b) {
	
	//System.out.println("Multiplication is:" +(a*b));
	return a*b;
	}

	static int division(int a,int b) {
		
		//System.out.println("Division is:" +(a/b));
		
		int quotient =0;
		if(b==0) {
			System.out.println("Value of divisior is:" +b);
		}
		else {
			quotient=a/b;
		}
		return quotient;
	}
	
	// //Swapping 2 numbers without 3rd variable
	
	static void swap() {
		int x = 10;
        int y = 20;
        System.out.println("Before swap:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
        x = x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swap:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
		
		
	}
	
	//Swapping 2 numbers with 3rd variable
	
	static void swap1() {
		int x = 10;
        int y = 20;
        int temp =30;
        System.out.println("Before swap:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
        temp = x;
        x = y;
        y = temp;
        
        System.out.println("After swap:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
	}

	
	// //Print numbers in Ascending with WHILE LOOP
	
	static void printNumbers(int start,int end) {
	
		int number=111;
		while(start!=end+1) {
			System.out.println(number);
			number++;
			start++;
		}
		
	}
	
	//Print numbers in Descending with WHILE LOOP
	
	static void printNumbersinDesc(int start,int end) {
		
		int number=111;
		
		while(start!=end+1) {
			System.out.println(number);
			number--;
			start++;
		}
	}
	
	//Print numbers in Multiples with WHILE LOOP
	
	static void printNumbersinMultiple(int start,int end) {
		int number=2;
		
		while(start!=end+1) {
			System.out.println(number);
			number=2*number;
			start++;
	
	}
	
	}
		static void printNumbersintriple() {
			int i=1;
			while(i<=3) {
				int num=i;
				int counter=1;
				while(counter<=3) {
					System.out.print(num + " ");
					counter++;
				
				}
				i++;
			}
			
		}
		
		public<A,E> void addition(A u,A v) {
			
			System.out.println(u);
			System.out.println(v);
			
			
			
		}
}


