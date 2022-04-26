package com.java8.tasks;

import java.util.Comparator;

public class StockComparator  implements Comparator<Shop>{
	// override the compare() method
	 public int compare(Shop s1, Shop s2)
	    {
	        if (s1.stock == s2.stock)
	            return 0;
	        else if (s1.stock > s2.stock)
	            return 1;
	        else
	            return -1;
	    }
}
