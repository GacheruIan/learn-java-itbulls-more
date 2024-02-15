package com.learn.selectionStatements;

import java.util.*;
import java.util.Scanner;

public class NewLineForDigitAssignment1 {

	public static void main(String[] args) {
		//enter first
		Scanner input = new Scanner(System.in);
		System.out.print("enter number: ");
		String nums = input.next();

		for(char x : nums.toCharArray()) {
		System.out.println(x);
		} 
		
		

	}

}
