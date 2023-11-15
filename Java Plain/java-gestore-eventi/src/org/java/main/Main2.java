package org.java.main;

public class Main2 {
	
	public static void main(String[] args) {
		
		String p1 = "anna";
		String p2 = "radar";
		String p3 = "ciccio";
		String p4 = "andrea";
		String p5 = "Anna";
		
		System.out.println(isPalindrome(p1));
		System.out.println(isPalindrome(p2));
		
		System.out.println(isPalindrome(p3));
		System.out.println(isPalindrome(p4));
		System.out.println(isPalindrome(p5));
		
	};
	
	public static Boolean isPalindrome(String string) {
	String newString = string.toLowerCase();
	
	char[] charsList = newString.toCharArray();
	
	for(int i = 0; i < (charsList.length/2); i++ ) {
		
		if(charsList[i] != charsList[charsList.length - (i+1)]) {
			return false;
		}
	}
	return true;	
	
	};
	
}
