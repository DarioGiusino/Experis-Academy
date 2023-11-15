package org.snacks;

import java.util.Random;

public class JavaSnack7 {
	public static void main(String[] args) {
		Random rnd = new Random();
		
		int num = rnd.nextInt(0, 100);
		
		while(num % 3 != 0 || num % 5 != 0) {
			num = rnd.nextInt(0, 100);
		}
		
		System.out.println(num);
	}
}
