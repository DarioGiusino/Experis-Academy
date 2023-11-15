package org.lessons.java.shop;

public class Main {
	public static void main(String[] args) {
		Prodotto product = new Prodotto(
				"disco di Salmo", 
				"disco pubblicato da Machete crew in collaborazione con me.", 
				2.70, 
				22);
		
		System.out.println(product);
	}
}
