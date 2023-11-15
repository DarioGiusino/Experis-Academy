package org.java.lessons.inheritance;

public class Shop {
	public static void main(String[] args) {
		System.out.println("-----------------------\n");
		
		Prodotto p1 = new Prodotto("Prodotto1", "Marca1", 10.99, 22);
		System.out.println(p1);
		
		System.out.println("\n-----------------------\n");
		
		Smartphone s1 = new Smartphone("Smartphone1", "Marca2", 20.99, 22, 32);
		System.out.println(s1);
		
		System.out.println("\n-----------------------\n");
		
		Televisore t1 = new Televisore("Televisore1", "Marca3", 30.99, 22, "65", true);
		System.out.println(t1);
		
		System.out.println("\n-----------------------\n");
		
		Cuffia c1 = new Cuffia("Cuffia1", "Marca4", 40.99, 22, "verde", false);
		System.out.println(c1);
		
		System.out.println("\n-----------------------");
	}
}
