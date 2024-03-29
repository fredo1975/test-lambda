package fr.lambda;

import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String args[]) {
		// This function returns a random value.
		Supplier<Double> randomValue = () -> Math.random();

		// Print the random value using get()
		System.out.println(randomValue.get());
		
		Supplier<String> printSomething = () -> "print something";
		System.out.println(printSomething.get());
	}
}
