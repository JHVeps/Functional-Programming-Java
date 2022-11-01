package com.functionalprogramming;

import java.util.List;

public class FBNumberRunnner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);

		int sumFB = sumFB(numbers);

		int sum = sumBasic(numbers);

		int sumOddFB = sumOddNumbersFB(numbers);

		int sumEvenFB = sumEvenNumbersFB(numbers);

		System.out.println(sum);// <- 4, 6, 8, 13, 3, 15

		System.out.println(sumFB);// <- 4, 6, 8, 13, 3, 15

		System.out.println("Odds sum: " + sumOddFB);// <- 31

		System.out.println("Evens sum: " + sumEvenFB);// <- 18


	}


	private static int sumFB(List<Integer> numbers) {
		return numbers.stream().reduce(0, (num1, num2) -> num1 + num2);
	}

	private static int sumOddNumbersFB(List<Integer> numbers) {
		return numbers.stream().filter(element -> element % 2 == 1).reduce(0, (num1, num2) -> num1 + num2);

	}

	private static int sumEvenNumbersFB(List<Integer> numbers) {
		int sumEvens = numbers.stream().filter(element -> element % 2 == 0).reduce(0, (num1, num2) -> num1 + num2);
		return sumEvens;
	}

	private static int sumBasic(List<Integer> numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}


}
