package com.collections.demo;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordsInStringUsingMap {
	public static void main(String[] args) {
		String str = "This is a program to find duplicate words in a string, again! a program";
		String[] words = str.toLowerCase().trim().split(" ");
		Map<String, Integer> duplicateString = new HashMap<>();
		int count = 1;
		for (String x : words) {
			if (duplicateString.containsKey(x)) {
				duplicateString.put(x, duplicateString.get(x) + 1);
			} else {
				duplicateString.put(x, count);
			}
		}
		System.out.println("Duplicate Words in a String : ");
		for (Map.Entry a : duplicateString.entrySet()) {
			int val = (Integer) a.getValue();
			if (val > 1) {
				System.out.println(a);
			}
		}
	}
}