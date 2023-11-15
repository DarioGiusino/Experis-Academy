package org.snacks;

import java.util.Scanner;

public class JavaSnack4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("inserisci una stringa...");
		String userString = scanner.nextLine();
		
		scanner.close();
		
		StringBuffer sbr = new StringBuffer(userString);
		String reversedString = "" + sbr.reverse();
		
		String result = userString.equals(reversedString) ? "parola palindroma" : "parola NON palindroma";
		
		System.out.println(result);
		
//		if(userString.equals(reversedString)) {
//			System.out.println("parola palindroma");
//		} else {
//			System.out.println("parola NON palindroma");
//		}
		
	}
}
