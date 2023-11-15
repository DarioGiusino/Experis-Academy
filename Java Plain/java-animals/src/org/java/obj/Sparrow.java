package org.java.obj;

import org.java.inter.FlyingAnimal;
import org.java.obj.abs.Animal;

public class Sparrow extends Animal implements FlyingAnimal {
	@Override
	public String verse() {
		return "Verso del pettirosso";
	}
	
	@Override
	public String eat() {
		return "Cibo del pettirosso";
	}
	
	@Override
	public String fly() {
		return "Sto volando...";
	}
	
	@Override
	public String toString() {
		return "[Pettirosso]" + verse()
				+ "\nmangia: " + eat()
				+ "\ndorme: " + sleep()
				+ "\nazione: " + fly();
	}

}
