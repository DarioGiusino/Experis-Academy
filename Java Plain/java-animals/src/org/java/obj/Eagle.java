package org.java.obj;

import org.java.inter.FlyingAnimal;
import org.java.obj.abs.Animal;

public class Eagle extends Animal implements FlyingAnimal {
	@Override
	public String verse() {
		return "Verso dell'aquila";
	}
	
	@Override
	public String eat() {
		return "Cibo dell'aquila";
	}
	
	@Override
	public String fly() {
		return "Sto volando...";
	}
	
	@Override
	public String toString() {
		return "[Aquila]" + verse()
				+ "\nmangia: " + eat()
				+ "\ndorme: " + sleep()
				+ "\nazione: " + fly();
	}
}
