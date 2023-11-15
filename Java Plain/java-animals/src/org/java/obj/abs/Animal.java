package org.java.obj.abs;

public abstract class Animal {
	public abstract String verse();
	public abstract String eat();
	
	public String sleep() {
		return "ZzZzZzZ";
	}
	
	@Override
	public String toString() {
		return verse();
	}
}
