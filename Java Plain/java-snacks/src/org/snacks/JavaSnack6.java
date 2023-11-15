package org.snacks;

import java.util.Random;
import java.util.Scanner;

public class JavaSnack6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("inserisci un valore limite...");
		int limit = sc.nextInt();
		sc.close();
		
		Random rnd = new Random();
		
		int sum = 0;
		
		while(sum <= limit) {
			int numb = rnd.nextInt(0, 100);
			System.out.println("numero uscito: " + numb);
			sum += numb;
		}
		
		System.out.println("la somma dei valori usciti: " + sum);
		System.out.println("il limite inserito: " + limit);
	}
}
