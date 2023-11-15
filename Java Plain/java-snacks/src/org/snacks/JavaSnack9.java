package org.snacks;

import java.util.Scanner;

public class JavaSnack9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci un valore per l'altezza...");
		int height = sc.nextInt();
		
		System.out.println("Inserisci un valore per la base...");
		int basis = sc.nextInt();
		
		sc.close();
		
		System.out.println("l'area del rettangolo è: " + (basis * height));
		System.out.println("il perimetro del rettangolo è: " + ((2 * basis) + (2 * height)));
	}
}
