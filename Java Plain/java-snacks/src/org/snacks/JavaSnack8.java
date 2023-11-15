package org.snacks;

import java.util.Arrays;
import java.util.Random;

public class JavaSnack8 {
	public static void main(String[] args) {
		Random rnd = new Random();
		
		Integer[] evenArr = new Integer[10];
		Integer[] oddArr = new Integer[10];
		
		for(int i = 0; i < 10; i++) {
			int rndNum = rnd.nextInt(0, 100);
			
			if (rndNum % 2 == 0) {
				evenArr[i] = rndNum;
			} else {
				oddArr[i] = rndNum;
			}
		}
		
		System.out.println(Arrays.asList(evenArr));
		System.out.println(Arrays.asList(oddArr));
	}
}
