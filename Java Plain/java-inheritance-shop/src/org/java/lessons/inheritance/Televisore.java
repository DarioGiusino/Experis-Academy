package org.java.lessons.inheritance;

public class Televisore extends Prodotto {
	
	private String inches;
	private boolean smartTv;

	public Televisore(String label, String brand, double price, int vat, String inches, boolean smartTv) {
		super(label, brand, price, vat);
		setInches(inches);
		setSmartTv(smartTv);
	}

	public String getInches() {
		return inches;
	}
	public void setInches(String inches) {
		this.inches = inches;
	}

	public boolean isSmartTv() {
		return smartTv;
	}
	public void setSmartTv(boolean smartTv) {
		this.smartTv = smartTv;
	}
	
	@Override
	public String toString() {
		return super.getDescription()
				+ "\nGrandezza: " + getInches() + "\""
				+ "\nSmart TV: " + (isSmartTv() ? "si" : "no");
	}

}
