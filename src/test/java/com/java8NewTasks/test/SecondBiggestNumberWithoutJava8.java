package com.java8NewTasks.test;

public class SecondBiggestNumberWithoutJava8 {
	public static void main(String[] args) { 
		int[] numbers = {34, 76, 888, 21, 97, 432, 16}; 
		int largest = Integer.MIN_VALUE; 
		int secondLargest = Integer.MIN_VALUE; 
	 
		for (int current : numbers) { 
			if (current > largest) { 
				secondLargest = largest; 
				largest = current; 
			} else if (current > secondLargest) { 
				secondLargest = current; 
			} 
		} 
	 
		System.out.println("Second largest number is: " + secondLargest); 
	} 
}
