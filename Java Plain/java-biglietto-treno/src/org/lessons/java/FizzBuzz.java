package org.lessons.java;

import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		
//		for(int i = 1; i <= 100; i++) {
//			if(i % 5 == 0 && i % 3 == 0) {
//				System.out.println("FizzBuzz");
//			} else if (i % 3 == 0) {
//				System.out.println("Fizz");
//			} else if (i % 5 == 0) {
//				System.out.println("Buzz");
//			} else {
//				System.out.println(i);
//			}
//		}
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dove ti vuoi fermare?");
		int userPoint = scanner.nextInt();
		
		for(int i = 1; i <= userPoint; i++) {
		if(i % 5 == 0 && i % 3 == 0) {
			System.out.println("FizzBuzz");
		} else if (i % 3 == 0) {
			System.out.println("Fizz");
		} else if (i % 5 == 0) {
			System.out.println("Buzz");
		} else {
			System.out.println(i);
		}
	}
		scanner.close();
	}
}
