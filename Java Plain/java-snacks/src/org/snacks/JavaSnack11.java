package org.snacks;

import java.util.Scanner;

public class JavaSnack11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("inserisci un valore...");
		int num = sc.nextInt();
		sc.close();
		
		for (int i=num/2; i>1; i--) {
			if(num%i == 0) {
				System.out.println("un divisore di: " + num + " è " + i);
			}
		}
		
		
	}
}
