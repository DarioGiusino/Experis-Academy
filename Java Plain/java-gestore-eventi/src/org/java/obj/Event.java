package org.java.obj;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Event {

	// variables
	private String title;
	private LocalDate date;
	private int totalSeats;
	private int reservedSeats = 0;

	// constructor
	public Event(String title, LocalDate date, int totalSeats) throws Exception {
		setTitle(title);
		setDate(date);
		setTotalSeats(totalSeats);
		setReservedSeats(reservedSeats);
	}

	// title
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	// date
	public LocalDate getDate() {
		return date;
	}

	public String getFormattedDate() {
		return date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
	}

	public void setDate(LocalDate date) throws Exception {
		// check if date is in the past
		if (date.isBefore(LocalDate.now()))
			throw new Exception("The date cannot be in the past!");

		this.date = date;
	}

	// total seats
	public int getTotalSeats() {
		return totalSeats;
	}

	private void setTotalSeats(int totalSeats) throws Exception {
		// check if total seats is negative
		if (totalSeats < 0)
			throw new Exception("Operation denied, criteria not fullfilled!");

		this.totalSeats = totalSeats;
	}

	// reserved seats
	public int getReservedSeats() {
		return reservedSeats;
	}

	private void setReservedSeats(int reservedSeats) {
		this.reservedSeats = reservedSeats;
	}

	// add seats
	public void AddSeats(int number) throws Exception {
		// check if totalSeats are full or date is passed
		if (getDate().isBefore(LocalDate.now()) || number <= 0 || getReservedSeats() + number > getTotalSeats())
			throw new Exception("No more seats available, event passed or invalid number");

		setReservedSeats(reservedSeats + number);
	}

	// remove seats
	public void RemoveSeats(int number) throws Exception {
		// check if totalSeats are full or date is passed
		if (getDate().isBefore(LocalDate.now()) || number <= 0 || getReservedSeats() - number <= 0)
			throw new Exception("This event contains no seats, event passed or invalid number");

		setReservedSeats(reservedSeats - number);
	}
	
	//print total seats reserved/total
	public String getSeats() {
		return "Totale posti prenotati: " + getReservedSeats() 
				+ "\nTotale posti disponibili: " + (getTotalSeats() - getReservedSeats());
	}

	@Override
	public String toString() {
		return getFormattedDate() + " - " + getTitle();
	}
}
