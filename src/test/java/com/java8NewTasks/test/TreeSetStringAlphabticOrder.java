package com.java8NewTasks.test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetStringAlphabticOrder {
	 public static void main(String[] args) {
		 
	        // create TreeSet
	        Set<String> names = new TreeSet<>();
	 
	 
	        // add names to TS
	        names.add("Saranya");
	        names.add("Karthika");
	        names.add("Amudha");
	        names.add("Pushpa");
	        names.add("Bhagyalakshmi");
	        names.add("Meena");
	 
	 
	        // original TreeSet in insertion order
	        System.out.println("1. Original TreeSet<String> "
	                + "in alphabetical order :- \n");
	        names.forEach(System.out::println);
	 
	 
	        //  Sorting Reverse Alphabetical order
	        System.out.println("\n2. TreeSet<String> "
	                + "in reverse alphabetical order :- \n");
	 
	 
	        // sort using Stream - reverse alphabetical order
	        names
	        .stream() // get sequential stream
	        .sorted(Comparator.reverseOrder()) // reverse alphabetical sorting
	        .forEach(System.out::println); // print
	    }
}
