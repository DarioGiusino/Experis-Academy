package org.snacks;

import java.util.Random;

public class JavaSnack2 {
	public static void main(String[] args) {
		String[] firstNameList = {"nome1", "nome2", "nome3", "nome4", "nome5", "nome6", "nome7"};
		String[] lastNameList = {"cognome1", "cognome2", "cognome3", "cognome4", "cognome5", "cognome6", "cognome7"};
		
		Random generator = new Random();
		
		for(int i = 0; i < firstNameList.length; i++) {
			String rndName = firstNameList[generator.nextInt(firstNameList.length)];
			String rndSurname = lastNameList[generator.nextInt(lastNameList.length)];
			
			System.out.println(rndName + rndSurname);
		}
	}
}
