package com.java8NewTasks.test;
import java.util.*;
public class CollectionsSortDescendingOrder {
	public static void main(String[] args) {
		 
		  List<String> countries = new ArrayList<>();
		 
		  countries.add("Singapore");
		  countries.add("India");
		  countries.add("USA");
		  countries.add("UK");
		  countries.add("Australia");
		 
		  System.out.println("List of countires before sorting : ");
		 
		  Iterator<String> it = countries.iterator();
		 
		  while (it.hasNext()) {
		   System.out.println(it.next());
		  }
		  Collections.sort(countries , Collections.reverseOrder());
		 
		  System.out.println("List of countries after sorting :");
		 
		  it = countries.iterator();
		 
		  while (it.hasNext()) {
		   System.out.println(it.next());
		  }
		 
		 }
}
