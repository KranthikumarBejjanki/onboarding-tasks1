package com.caluculator.exercise04.test;

import java.util.Arrays;

public class Caluculator {
	public static void main(String[] args) {

		String s1 = args[0];
		String s2 = args[1];

		int a1 = Integer.parseInt(s1);
		int a2 = Integer.parseInt(s2);

		String[] values = new String[args.length];

		for (int i = 0; i < args.length; i++) {

			values[i] = args[i];
		}
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}

		String[] newArr = Arrays.copyOfRange(values, 2, values.length);
		System.out.println(Arrays.toString(newArr));
		getOperationResult(newArr, a1, a2);

	}

	public static void getOperationResult(String[] str, int number1, int number2) {

		for (int i = 0; i <= str.length - 1; i++) {

			switch (str[i].toLowerCase()) {

			case "addition":
				System.out.println(number1 + number2);
				break;
			case "subtraction":
				System.out.println(number1 - number2);
				break;
			case "multiplication":
				System.out.println(number1 * number2);
				break;
			case "division":
				System.out.println(number1 / number2);
				break;
			case "modulus":
				float remainder = number1 % number2;
				float percentage;
				System.out.println(remainder);
				percentage = (float) ((remainder / (number1 + number2)) * 100);
				System.out.println(percentage);

				break;
			default:
				System.out.println("Please enter a valid operation");
			}

		}

	}
}
