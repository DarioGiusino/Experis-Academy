package org.snacks;

import java.util.Scanner;

public class JavaSnack10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("inserisci il raggio del cerchio...");
		int radius = sc.nextInt();
		
		sc.close();
		
		double area = radius * radius * Math.PI;
		double circumference = 2 * radius * Math.PI;
		
		System.out.println("l'area del cerchio è: " + area);
		System.out.println("la circonferenza del cerchio è: " + circumference);
	}
}
