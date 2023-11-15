package org.java.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.util.Random;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class CalculatorTest {
	Random rnd = new Random();

	@RepeatedTest(10)
	@DisplayName("Add Testing...")
	public void addTest() {
		final float num1 = rnd.nextFloat();
		final float num2 = rnd.nextFloat();
		final float attRes = num1 + num2;

		final float finalRes = Calculator.add(num1, num2);
		assertEquals(attRes, finalRes);
	}

	@RepeatedTest(10)
	@DisplayName("Subtract Testing...")
	public void subtractTest() {
		final float num1 = rnd.nextFloat();
		final float num2 = rnd.nextFloat();
		final float attRes = num1 - num2;

		final float finalRes = Calculator.subtract(num1, num2);
		assertEquals(attRes, finalRes);
	}

	@RepeatedTest(10)
	@DisplayName("Divide Testing...")
	public void divideTest() throws Exception {
		final float num1 = rnd.nextFloat();
		final float num2 = rnd.nextFloat();
		assumeTrue(num2 != 0);
		final float attRes = num1 / num2;

		final float finalRes = Calculator.divide(num1, num2);
		assertEquals(attRes, finalRes);
	}

	@RepeatedTest(10)
	@DisplayName("Divide Exception Testing...")
	public void divideExceptionTest() throws Exception {
		final float num1 = rnd.nextFloat();
		final float num2 = rnd.nextFloat();
		assumeTrue(num2 == 0);

		assertThrows(ArithmeticException.class, () -> Calculator.divide(num1, num2));
	}

	@RepeatedTest(10)
	@DisplayName("Multiply Testing...")
	public void multiplyTest() {
		final float num1 = rnd.nextFloat();
		final float num2 = rnd.nextFloat();
		final float attRes = num1 * num2;

		final float finalRes = Calculator.multiply(num1, num2);
		assertEquals(attRes, finalRes);
	}
}
