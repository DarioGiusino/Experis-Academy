package org.java.obj;

import org.java.obj.abs.Animal;

public class Dog extends Animal {
	@Override
	public String verse() {
		return "Verso del cane";
	}
	
	@Override
	public String eat() {
		return "Cibo del cane";
	}
	
	@Override
	public String toString() {
		return "[Cane]" + verse()
				+ "\nmangia: " + eat()
				+ "\ndorme: " + sleep();
	}
}
