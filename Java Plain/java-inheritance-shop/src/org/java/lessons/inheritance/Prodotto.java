package org.java.lessons.inheritance;

import java.util.Random;

public class Prodotto {
	
	private int code;
	private String label;
	private String brand;
	private double price;
	private int vat;
	
	public Prodotto(String label, String brand, double price, int vat) {
		Random rnd = new Random();
		
		code = rnd.nextInt(999999);
		setLabel(label);
		setBrand(brand);
		setPrice(price);
		setVat(vat);
	}

	public int getCode() {
		return code;
	}

	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getVat() {
		return vat;
	}
	public void setVat(int vat) {
		this.vat = vat;
	}
	
	public double getCommercialPrice() {
		return price+=(price*vat)/100;
	}
	
	public String getFormattedPrice() {
		return String.format("%,.2f", getCommercialPrice()); 
	}
	
	public String getDescription() {
		return "*" + getCode() + " " + getBrand() + "*" + getLabel()
		+ "\nPrezzo iva esclusa(iva): " + getPrice() + "(" + getVat() + ")"
		+ "\nPrezzo comprensivo di iva: " + getFormattedPrice();
	}
	
	@Override
	public String toString() {
		return getDescription();
	}
	
}
