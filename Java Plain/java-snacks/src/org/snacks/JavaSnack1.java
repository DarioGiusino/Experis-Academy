package org.snacks;
import java.util.Scanner;

public class JavaSnack1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci un numero...");
		int userNumber = scanner.nextInt();
		scanner.close();
		
		String result = userNumber % 2 == 0 ? "" + userNumber : "" + (userNumber + 1);
		
		System.out.println(result);
		
	}
}
