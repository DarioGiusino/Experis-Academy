package org.java.calculator;

public class Calculator {
	public static float add(float num1, float num2) {
		return num1 + num2;
	}

	public static float subtract(float num1, float num2) {
		return num1 - num2;
	}

	public static float divide(float num1, float num2) throws Exception {
		if (num2 == 0) {
			throw new ArithmeticException("Non puoi dividere per zero...");
		}
		return num1 / num2;
	}

	public static float multiply(float num1, float num2) {
		return num1 * num2;
	}
}
