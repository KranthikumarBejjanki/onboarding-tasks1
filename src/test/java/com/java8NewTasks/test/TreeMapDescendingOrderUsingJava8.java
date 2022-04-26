package com.java8NewTasks.test;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDescendingOrderUsingJava8 {
	 public static void main(String[] args) {
		 
	        // create TreeMap object of type <String, Integer>
	        Map<String, Integer> countryPopulation = new TreeMap<>(); 
	 
	 
	        //  adding key-value pairs to LinkedHashMap object
	        countryPopulation.put("Indian", 382357386);
	        countryPopulation.put("Chinese", 409900000);
	        countryPopulation.put("America", 332429717);
	        countryPopulation.put("Russia", 146748590);
	        countryPopulation.put("Brazil", 213728559);
	        countryPopulation.put("Mexico", 127792286);
	        countryPopulation.put("Pakistan", 220892331);
	 
	 
	        //print - before sorting - random order
	        System.out.println("Original TreeMap in Ascending-order of Keys :- \n");
	 
	 
	        // print Map entries to console
	        countryPopulation.forEach((key, value) -> System.out.println(
	                "Key : " + key  + "\t\t"  + "Value : "  + value
	                ));
	 
	 
	        // convert Map EntrySet into LinkedList
	        List<Map.Entry<String, Integer>> list = new LinkedList<>(
	                countryPopulation.entrySet());
	 
	 
	 
	        //Sorting according to reverse alphabetical order of Keys
	        System.out.println("\n\nSorted TreeMap in "
	                + "descending-order of Keys :- \n");
	 
	 
	        // Map keys - Descending order sorting
	        Collections.sort(list, 
	                (map1, map2) -> map2.getKey().compareTo(map1.getKey())
	                );
	 
	 
	 
	        // iterate and store in newly created LinkedHashMap
	        Map<String, Integer> tempMapDesc = new LinkedHashMap<>();
	        for (Map.Entry<String, Integer> map : list) {
	            tempMapDesc.put(map.getKey(), map.getValue());
	        }
	 
	 
	        // print Map using forEach() method
	        tempMapDesc.forEach((key, value) -> System.out.println(
	                "Key : " + key  + "\t\t"  + "Value : "  + value
	                ));
	    }
}
