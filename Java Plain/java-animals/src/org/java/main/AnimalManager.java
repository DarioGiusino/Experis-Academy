package org.java.main;

import org.java.inter.FlyingAnimal;
import org.java.inter.SwimmingAnimal;

public class AnimalManager{

	public String letFly(FlyingAnimal obj) {
		return obj.fly();
	}
	
	public String letSwim(SwimmingAnimal obj) {
		return obj.swim();
	}
}
