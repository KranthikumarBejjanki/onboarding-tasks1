package com.java8NewTasks.test;

public class StringPalindromeWithoutJava8 {
	public static void main(String[] args) {

        //Check if 'radar' is Palindrome
        System.out.println("Is radar a Palindrome? - " + isPalindrome("radar")); //true

        //Check if 'apple' is Palindrome
        System.out.println("Is apple a Palindrome? - " + isPalindrome("apple")); //false
    }

    public static boolean isPalindrome(String originalString) {

        String reversedString = new StringBuilder(originalString).reverse().toString();

        return originalString.equals(reversedString);

    }
}
