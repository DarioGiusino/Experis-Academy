package org.java.obj;

import org.java.inter.SwimmingAnimal;
import org.java.obj.abs.Animal;

public class Dolphin extends Animal implements SwimmingAnimal {
	@Override
	public String verse() {
		return "Verso del delfino";
	}
	
	@Override
	public String eat() {
		return "Cibo del delfino";
	}
	
	@Override
	public String swim() {
		return "Sto nuotando...";
	}
	
	@Override
	public String toString() {
		return "[Delfino]" + verse()
				+ "\nmangia: " + eat()
				+ "\ndorme: " + sleep()
				+ "\nazione: " + swim();
	}


}
