package com.javaMethods;

public class ParameterPassing {
	
	private static int test(int i) {
		i +=20;  
		return i;

	}

	public static void main(String[] args) {
		int i = 10;
		i = test(i);
		System.out.println("i after test()" + i);
		System.out.println();
	
		
	
	}

}
//pass by val - work with copy(which is created in  stack) original left untouched
//pass by reference - work with memory address/actual value....
//in java primitive and referece types are passed by val...