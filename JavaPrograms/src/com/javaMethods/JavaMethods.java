package com.javaMethods;

public class JavaMethods {
	
	private static int sumNumbers(int x, int y) {
		return x + y;
	}
	
	private static Double sumNumbers(double a, double b) {
		return a + b;
	}
	
	public static void printToConsole(String name) {
		System.out.println("hello " + name);
		
	}

	public static void main(String[] args) {
	
		System.out.println(sumNumbers(10, 20));
		System.out.println(sumNumbers(10.3, 10));
		printToConsole("world");
		
	}
	
}

		
		
//NOTES
		
        //System.out.println("methods in java");
		// method is a block of code that can be referred to by name
		// and can be called at any point in prog simply with the method name..
		//or simply a junk of code that can e performed under request
		//chunk of code performed under request
		//each method has an access modifier...private(accessed only in class javaMethods here scope)
		//static means method and this class are connected but not other class instances.
		// static vs non static
		//return type int,void
		//method name are CAMELCASE
		//method params(int x, inty)
		//method name + params  = method signaure....
		//NB: ACCESS MODIFIER IS NOT PART OF METHOD SIGNATURE DUE TO OVERLOADING i.e WE
		
		//CAN HAVE 2 METHODS "SUM" WITH SAME NAME BUT DIFFERENT FUNCTIONALITY ONE ADDING
		
		// INT ANOTHER DOUBLE JAVA CAN DISCERN THEM WITHOUT METHOD NAME
		

