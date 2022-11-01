package com.functionalprogramming;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Bat", "Cat", "Dog");
		List<Integer> numList = List.of(1, 2, 3, 4, 5, 6);

		printBasic(list); // <- "Apple", "Bat", "Cat", "Dog"
		printBasicWithFiltering(list); // <- "Bat", "Cat"
		printWihtFunctionalProgramming(list); // <- "Apple", "Bat", "Cat", "Dog"
		printWihtFunctionalProgramminAndFilter(list);// <- "Bat", "Cat"

		printEvenNumbersWithFP(numList);
		printOddNumbersWithFP(numList);

	}

	// Basic, loop through list and sysout each element
	private static void printBasic(List<String> list) {
		for (String string : list) {
			System.out.println(string);
		}
	}

	// Basic, loop through list and sysout each element which ends with "at"
	private static void printBasicWithFiltering(List<String> list) {
		for (String string : list) {
			if(string.endsWith("at")){
				System.out.println("Ends with (at): " + string);
			}
		}
	}

	// Functional, convert into a stream and tell what to do with each element
	// (action/function)
	private static void printWihtFunctionalProgramming(List<String> list) {
		list.stream().forEach(element -> System.out.println(element));
	}

	// Functional, convert into a stream and tell what to do with each element
	// (action/function) in this case filter those elements out which end with "at"
	private static void printWihtFunctionalProgramminAndFilter(List<String> list) {
		list.stream().filter(element -> element.endsWith("at"))
				.forEach(element -> System.out.println("ends withs (at): " + element));
	}

	// even nums w fp
	private static void printEvenNumbersWithFP(List<Integer> numList) {
		numList.stream().filter(element -> element % 2 == 0)
				.forEach(element -> System.out.println("is even: " + element));
	}

	// odd nums w fp
	private static void printOddNumbersWithFP(List<Integer> numList) {
		numList.stream().filter(element -> element % 2 == 1)
				.forEach(element -> System.out.println("is odd: " + element));
	}

}

