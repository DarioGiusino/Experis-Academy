package org.snacks;

import java.util.Random;
import java.util.Scanner;

public class JavaSnack5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("inserisci un numero....");
		int userNumb = scanner.nextInt();
		
		scanner.close();
		
		Random generator = new Random();
		
		int[] numbArray = new int[userNumb]; 
		
		int sum = 0;
		int evenSum = 0;
		int oddNumbers = 0;
		int oddSum = 0;
		
		for(int i = 0; i < numbArray.length; i++) {
			
			numbArray[i] = generator.nextInt(0, 100);
			
			sum += numbArray[i];
			
			if(numbArray[i] % 2 == 0) {
				evenSum += numbArray[i];
			} else {
				oddSum += numbArray[i];
				oddNumbers++;
			}
		}
		
		double med = (double) sum / numbArray.length;
		
		double oddMed = 0;
		if(oddNumbers > 0) {
			oddMed = (double) oddSum / oddNumbers;
		}
		
		int min = numbArray[0];
		int max = numbArray[0];
		
		for (int i = 0; i < numbArray.length; i++) {
			System.out.println(numbArray[i]);
			if(numbArray[i] < min) {
				min = numbArray[i];
			} else {
				max = numbArray[i];
			}
		}
		
		System.out.println("La somma dei numeri estratti è: " + sum);
		System.out.println("La somma dei numeri pari estratti è: " + evenSum);
		System.out.println("La media dei numeri estratti è: " + med);
		System.out.println("La media dei numeri dispari estratti è: " + oddMed);
		System.out.println("Il minimo dei numeri estratti è: " + min);
		System.out.println("Il massimo dei numeri estratti è: " + max);
		

	}
}
