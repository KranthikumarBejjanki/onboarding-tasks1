package com.java8NewTasks.test;

import java.util.Iterator;
import java.util.Map;
import java.util.*;

public class TreeMapDescendingOrder {
	 public static void main(String args[])
	    {
	        // Map to store the elements
	        Map<String, String> treemap = 
	               new TreeMap<String, String>(Collections.reverseOrder());
	  
	        // Put elements to the map
	        treemap.put("1", "Welcome");
	        treemap.put("2", "to");
	        treemap.put("3", "the");
	        treemap.put("4", "Epam");
	        treemap.put("5", "Community");
	  
	        Set set = treemap.entrySet();
	        Iterator i = set.iterator();
	  
	        // Traverse map and print elements
	        while (i.hasNext()) {
	            Map.Entry me = (Map.Entry)i.next();
	            System.out.print(me.getKey() + ": ");
	            System.out.println(me.getValue());
	        }
	    }
}
