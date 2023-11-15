package org.java.lessons.inheritance;

public class Cuffia extends Prodotto {

	private String color;
	private boolean wireless;
	
	public Cuffia(String label, String brand, double price, int vat, String color, boolean wireless) {
		super(label, brand, price, vat);
		setColor(color);
		setWireless(wireless);
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public boolean isWireless() {
		return wireless;
	}
	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
	
	@Override
	public String toString() {
		return super.getDescription()
				+ "\nColore: " + getColor()
				+ "\nWireless: " + (isWireless() ? "si" : "no");
	}

}
