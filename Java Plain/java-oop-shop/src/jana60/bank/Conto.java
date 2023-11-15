package jana60.bank;

import java.util.Random;

public class Conto {
	
	private int id;
	private String name;
	private double balance;
	
	Random rnd = new Random();
	public Conto(String name) {
		id = rnd.nextInt(1001);
		balance = 0;
		setName(name);
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
	
	public String getBalance() {
		return String.format("%,.2f", balance);
	}
	
	public void addMoney(int amount) {
		if (amount < 0) return;
		balance += amount;
	}
	
	public void withdrawMoney(int amount) {
		if(amount > balance) return;
		balance -= amount;
	}
	
	@Override
	public String toString() {
		return "Conto numero: " + getId() + ", del signor: " + getName() + ", contiene: " + getBalance() + "€";
	}
}
