package jana60.bank;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci il tuo nome per creare il conto...");
		String userName = sc.next();
		
		Conto c = new Conto(userName);
		
		System.out.println("Benvenuto, " + userName 
				+ "\n Inserisci 1 per aggiungere denaro,"
				+ "2 per prelevare denaro"
				+ "o 3 per uscire.");
		String userChoice = sc.next();
		
		if(userChoice.equals("1")) {
			System.out.println("inserisci l'importo da versare...");
			int addAmount = sc.nextInt();
			c.addMoney(addAmount);
			System.out.println(c);
		} else if (userChoice.equals("2")) {
			System.out.println("inserisci l'importo da prelevare...");
			int withdrawAmount = sc.nextInt();
			c.withdrawMoney(withdrawAmount);
			System.out.println(c);
		} else {
			System.out.println("grazie e arrivederci");
			System.out.println(c);
		}
		sc.close();
	}
}
