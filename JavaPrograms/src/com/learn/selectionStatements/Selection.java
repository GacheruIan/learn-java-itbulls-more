package com.learn.selectionStatements;

//import java.util.Scanner;

public class Selection {

	public static void main(String[] args) {
//		Scanner user = new Scanner(System.in);
//		System.out.print("enter number: ");
//		int number = user.nextInt();
//		
//		if(number >= 0 && number <= 29) {
//			System.out.println("fail");
//		}else if(number >= 30 && number <= 49) {
//			System.out.println("pass");
//			
//		}else if(number >= 50 && number <= 99) {
//			System.out.println("keep up!");
//		}else {
//			System.out.println("waiting....");
//		}
//		
//		for(int i = 0; i < 10; i++) {
//			if(i % 2 == 0) {
//				System.out.println("num is even: " + i);
//			}else {
//				System.out.println("num is odd: " + i );
//			}
//			}

		// declare a var x with no 0
		// declare another var with no 10
		// condition will be while x>y print x

//	int x = 0;
//	int y = 10;
//	while(x < y) {
//		System.out.println("print: " + x);
//		x++;
//
//	}

//		int n = 10;
//		do {
//			System.out.println("tick " + n);
//			n--;
//		} while (n > 0);
		
		int a,b,c;
		
		for(a = 10, b = 20, c = 30; (a > 0); a--, b--) {
			System.out.println("a =" + a);
			System.out.println("b =" + b);
			System.out.println("c = " + c);
		}

	}
}
