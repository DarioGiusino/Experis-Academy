package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	
	private int id;
	private String name;
	private String description;
	private double price;
	private int vat;

	Random rnd = new Random();
	
	public Prodotto(String name, String description, double price, int vat) {
		id = rnd.nextInt(99999999);
		setName(name);
		setDescription(description);
		setPrice(price);
		setVat(vat);
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price <= 0) return;
		
		this.price = price;
	}
	
	public int getVat() {
		return vat;
	}
	public void setVat(int vat) {
		if(vat <= 0) return;
		
		this.vat = vat;
	}
	
	public double getCommercialPrice() {
		return price += (price * vat) / 100;
	}
	
	public String getFormattedId() {
		String code = "" + getId();
		if (code.length() < 8) code = "0" + code;
		return code;
	}
	
	public String getCommercialName() {
		return "[codice prodotto: " + getFormattedId() + "]" + " " + name;
	}
	
	@Override
	public String toString() {
		return getCommercialName() 
				+ ", Descrizione: " + getDescription() 
				+ ", Prezzo senza inva: " + getPrice()
				+ ", iva prodotto: " + getVat()
				+ ", Prezzo con iva: " + getCommercialPrice();
	}
}
