package org.java.lessons.inheritance;

import java.util.Scanner;

public class Catalogo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Prodotto[] catalogo = new Prodotto[10];
		int i = 0;

		while(true) {

			System.out.println("Decidi quale nuovo prodotto inserire:" + "\n[1] Smartphone" + "\n[2] Televisore"
					+ "\n[3] Cuffie" + "\n[4] Esci");

			int choice = sc.nextInt();

			if (choice < 1 || choice > 4) {
				System.err.println("Selezione non valida!");
				continue;
			}

			switch (choice) {
			case 1: {
				System.out.println("Inserisci il nome dello smartphone...");
				String label = sc.next();

				System.out.println("Inserisci la marca dello smartphone...");
				String brand = sc.next();

				System.out.println("Inserisci il prezzo dello smartphone...");
				double price = sc.nextDouble();

				System.out.println("Inserisci l'iva del prodotto...");
				int vat = sc.nextInt();

				System.out.println("Inserisci i GB di RAM dello smartphone...");
				int ram = sc.nextInt();

				Smartphone prodotto = new Smartphone(label, brand, price, vat, ram);

				catalogo[i] = prodotto;
				i++;
			}
				break;

			case 2: {
				System.out.println("Inserisci il nome della televisione...");
				String label = sc.next();

				System.out.println("Inserisci la marca della televisione...");
				String brand = sc.next();

				System.out.println("Inserisci il prezzo della televisione...");
				double price = sc.nextDouble();

				System.out.println("Inserisci l'iva del prodotto...");
				int vat = sc.nextInt();

				System.out.println("Inserisci i pollici della tv...");
				String inches = sc.next();

				System.out.println("La tv è smart o no?");
				boolean isSmart = sc.nextBoolean();

				Televisore prodotto = new Televisore(label, brand, price, vat, inches, isSmart);

				catalogo[i] = prodotto;
				i++;
			}
				break;

			case 3: {
				System.out.println("Inserisci il nome delle cuffie...");
				String label = sc.next();

				System.out.println("Inserisci la marca delle cuffie...");
				String brand = sc.next();

				System.out.println("Inserisci il prezzo delle cuffie...");
				double price = sc.nextDouble();

				System.out.println("Inserisci l'iva del prodotto...");
				int vat = sc.nextInt();

				System.out.println("Inserisci il colore delle cuffie...");
				String color = sc.next();

				System.out.println("Le cuffie sono wireless o no?");
				boolean isWireless = sc.nextBoolean();

				Televisore prodotto = new Televisore(label, brand, price, vat, color, isWireless);

				catalogo[i] = prodotto;
				i++;
			}
				break;

			default:
				System.out.println("\nDi seguito il catalogo inserito:\n");
				
				for(int x = 0; x < i; x++) {
					if (catalogo[x] != null) {
						System.out.println("\n---------Prodotto " + x+1 +"-------------\n");
						System.out.println(catalogo[x]);
						}
				}
				sc.close();
				
				return;
			}

		}
	}
}
