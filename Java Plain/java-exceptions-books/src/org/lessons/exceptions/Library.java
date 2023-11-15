package org.lessons.exceptions;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Library {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int index = 0;

		System.out.println("Benvenuto, quanti libri vuoi creare?");
		int number = sc.nextInt();

		Book[] books = new Book[number];

		while (index < number) {
			System.out.println("------------Nuovo Libro----------------");
			System.out.print("Inserisci il titolo del libro: ");
			String title = sc.next();

			System.out.print("Inserisci il numero di pagine che contiene: ");
			int pages = sc.nextInt();

			System.out.print("Inserisci l'autore del libro: ");
			String author = sc.next();

			System.out.print("Inserisci l'editore del libro: ");
			String editor = sc.next();

			try {
				System.out.println("---------------------------------------\n");
				Book newBook = new Book(title, pages, author, editor);
				books[index++] = newBook;
			} catch (Exception e) {
				System.out.println("An error occured: " + e.getMessage() + "\nRitenta con un nuovo inserimeto...\n");
				continue;
			}
		}
		sc.close();

		for(int x = 0; x < books.length; x++) {
			try {
				FileWriter myWriter = new FileWriter("C:/Users/dario/Desktop/nuovo.txt", true);
				myWriter.write(books[x].toString() + "\n\n");
				myWriter.close();				
			} catch (Exception e) {
				System.out.println("Error creating file: " + e.getMessage());
			}
		}
		
		File textFile = new File("C:/Users/dario/Desktop/nuovo.txt");
		
		try {
			Scanner reader = new Scanner(textFile);
			System.out.println("\n----Libreria----\n");
			while(reader.hasNextLine()) {
				System.out.println(reader.nextLine());
			}
			reader.close();
		} catch (Exception e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
		
		
	}
}
