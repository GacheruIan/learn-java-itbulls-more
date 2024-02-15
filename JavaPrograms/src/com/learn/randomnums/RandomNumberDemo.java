package com.learn.randomnums;

import java.util.Random;

public class RandomNumberDemo {

	public static void main(String[] args) {
		Random nums = new Random();
		System.err.println(nums.nextInt());
		System.out.println(nums.nextInt(100)); //random nums from 0-99
		System.out.println(nums.nextInt(100) + 1); //random nums from 1 - 100 
	}

}
