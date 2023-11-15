package org.java.lessons.inheritance;

import java.util.Random;

public class Smartphone extends Prodotto {
	
	private String IMEI;
	private int memory;
	
	public Smartphone(String label, String brand, double price, int vat, int memory) {
		super(label, brand, price, vat);
		
		Random rnd = new Random();
		IMEI = "" + rnd.nextInt(999999999);
		
		setMemory(memory);
	}

	public String getIMEI() {
		return IMEI;
	}

	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	@Override
	public String toString() {
		return super.getDescription()
				+ "\nCodice IMEI: " + getIMEI()
				+ "\nQuantità di memoria: " + getMemory() + "GB";
	}

}
