package org.snacks;

public class JavaSnack3 {
	public static void main(String[] args) {
		int[] numArray = {1, 2, 3, 4, 5};
		
		int sum = 0;
		for(int i = 0; i < numArray.length; i+=2) {

			int val = numArray[i];
			sum += val;
		}
		
		System.out.println("la somma è: " + sum);
	}
}
