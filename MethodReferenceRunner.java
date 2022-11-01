package com.functionalprogramming;

import java.util.List;

public class MethodReferenceRunner {

	public static void print(Integer number) {
		System.out.println(number);
	}

	public static boolean isEven(Integer number) {
		return number % 2 == 0;

	}

	public static void main(String[] args) {
		// This is same as...
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(s -> s.length())
				.forEach(s -> System.out.println(s));
		// This
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(s -> s.length())
				.forEach(s -> MethodReferenceRunner.print(s));
		// This is same as...
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(s -> s.length()).forEach(System.out::println);
		// This
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(s -> s.length())
				.forEach(MethodReferenceRunner::print);

		// This is the same as...
		Integer max = List.of(23, 45, 67, 34).stream().filter(n -> n % 2 == 0).max((n1, n2) -> Integer.compare(n1, n2))
				.orElse(0);
		System.out.println(max);

		// This
		Integer max2 = List.of(23, 45, 67, 34).stream().filter(MethodReferenceRunner::isEven)
				.max(Integer::compare).orElse(0);
		System.out.println(max2);

	}

}
