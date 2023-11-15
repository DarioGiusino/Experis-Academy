package org.java.employee;

import java.time.LocalDate;

public class Employee {
	private String firstname;
	private String lastname;
	private LocalDate dateOfBirth;
	private String role;

	public Employee(String firstname, String lastname, LocalDate dateOfBirth, String role) throws Exception {
		setFirstname(firstname);
		setLastname(lastname);
		setDateOfBirth(dateOfBirth);
		setRole(role);
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) throws Exception {
		if(firstname.isBlank() || firstname.length() < 3) throw new Exception("Il nome deve contenere almeno 3 caratteri");
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) throws Exception {
		if(lastname.isBlank() || lastname.length() < 3) throw new Exception("Il cognome deve contenere almeno 3 caratteri");
		this.lastname = lastname;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) throws Exception {
		if(dateOfBirth.isAfter(LocalDate.now())) throw new Exception("La data deve essere nel passato");
		this.dateOfBirth = dateOfBirth;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) throws Exception {
		if(!role.equals("employee") || !role.equals("boss")) throw new Exception("Il ruolo deve essere employee o boss");
		this.role = role;
	}
	
	
}
