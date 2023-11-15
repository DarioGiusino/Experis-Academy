package org.snacks;

import java.util.Arrays;

public class JavaSnack13 {
	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		Integer[] arr2 = { 34, 35, 36, 37, 38 };
		
		int lng1 = arr1.length;
		int lng2 = arr2.length;
		
		Integer[] subArr1 = new Integer[lng1];
		Integer[] subArr2 = new Integer[lng2];
		
		subArr1[0] = arr2[0];
		subArr2[0] = arr1[0];
		
		for(int i = 1; i < lng1; i++) {
			subArr1[i] = arr1[i];
		}
		for(int i = 1; i < lng2; i++) {
			subArr2[i] = arr2[i];
		}
		
		System.out.println(Arrays.asList(subArr1));
		System.out.println(Arrays.asList(subArr2));
	}
}
