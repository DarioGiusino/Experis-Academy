package org.lessons.java;
import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		// define a scanner listening input from user
		Scanner scanner = new Scanner(System.in);
		
		// define questions for the user
		String firstQuestion = "Quanti chilometri vuoi percorrere?";
		String secondQuestion = "Quanti anni hai?";
		
		// ask first question ad collect the input
		System.out.println(firstQuestion);
		int userKms = scanner.nextInt();
		
		// ask first question ad collect the input
		System.out.println(secondQuestion);
		int userAge = scanner.nextInt();
		
		// define a default for the ticket price
		double ticketPrice = userKms * 0.21;
		
		// if user age is < 18 discount is 20%
		if(userAge < 18) {
			ticketPrice -= (ticketPrice * 20) / 100;
		} 
		// if user age is > 65 discount is 40%
		else if (userAge > 65) {
			ticketPrice -= (ticketPrice * 40) / 100;
			}
		
		// print ticket price
		System.out.println("Il prezzo del biglietto è " + ticketPrice);
		
		// close the scanner listening
		scanner.close();
	}
}
