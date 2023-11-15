package org.lessons.java;

public class CibiPreferiti {
	public static void main(String[] args) {
		// define an array
		String[] foods = {"pane", "pasta", "frutta", "melanzane", "anguria", "limone", "melograno", "pera", "cipolla"};
		
		// print array length
		System.out.println("La lunghezza della classifica è: " + foods.length);
		
		// print first element of the array
		System.out.println("Il primo cibo in classifica è: " + foods[0]);
		
		// print last element of the array
		int lastElemenet = foods.length - 1;
		System.out.println("L'ultimo cibo in classifica è: " + foods[lastElemenet]);
		
		// print the element in the middle
		int middleElement = foods.length / 2;
		System.out.println("Il cibo a metà classifica è: " + foods[middleElement]);
	}
}
