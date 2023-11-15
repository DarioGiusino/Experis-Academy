package org.snacks;

import java.util.Arrays;

public class JavaSnack12 {
	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		Integer[] arr2 = { 34, 35, 36, 37, 38 };
		
		int totLng = arr1.length + arr2.length;
		Integer[] arr3 = new Integer[totLng];
		
		int arr3Ind = 0;
		
		for(int i = 0; i < arr1.length; i++) {
				arr3[arr3Ind++] = arr1[i];
			
		}
		
		for(int i = 0; i < arr2.length; i++) {
			arr3[arr3Ind++] = arr2[i];
		
	}
		
		System.out.println(Arrays.asList(arr3));
		
	}
}
