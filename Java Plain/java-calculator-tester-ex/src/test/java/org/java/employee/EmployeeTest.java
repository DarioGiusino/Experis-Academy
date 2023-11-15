package org.java.employee;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class EmployeeTest {

	@Test
	public void getEmployeeWithEmptyNameTest() throws Exception {
		String nome = "";
		String cognome = "Marx";
		LocalDate dataDiNascita = LocalDate.of(1818, 5, 5);
		String ruolo = "employee";

		final Employee e = new Employee(nome, cognome, dataDiNascita, ruolo);
		assumeTrue(e.getFirstname() == "");

		assertThrows(Exception.class, () -> e.getFirstname(), "Deve sollevare exception perchè il nome è vuoto");
	}

	@Test
	public void getEmployeeWithEmptySurnameTest() throws Exception {
		String nome = "Karl";
		String cognome = "";
		LocalDate dataDiNascita = LocalDate.of(1818, 5, 5);
		String ruolo = "employee";

		final Employee e = new Employee(nome, cognome, dataDiNascita, ruolo);
		assumeTrue(e.getLastname() == "");

		assertThrows(Exception.class, () -> e.getLastname(), "Deve sollevare eccezione perchè il cognome è vuoto");
	}

	@Test
	public void getEmployeeWithFutureDateTest() throws Exception {
		String nome = "Karl";
		String cognome = "Marx";
		LocalDate dataDiNascita = LocalDate.of(2025, 5, 5);
		String ruolo = "employee";

		final Employee e = new Employee(nome, cognome, dataDiNascita, ruolo);

		assertThrows(Exception.class, () -> e.getDateOfBirth(),
				"Deve sollevare eccezione perchè la data di nascita non può essere nel futuro");
	}

	@Test
	public void getEmployeeWithInvalidRuleTest() throws Exception {
		String nome = "Karl";
		String cognome = "Marx";
		LocalDate dataDiNascita = LocalDate.of(1818, 5, 5);
		String ruolo = "chef";

		final Employee e = new Employee(nome, cognome, dataDiNascita, ruolo);

		assertThrows(Exception.class, () -> e.getRole(),
				"Deve sollevare eccezione perchè il ruolo non è quello previsto");
	}

}