package com.java8NewTasks.test;

import java.util.ArrayList;
import java.util.Collections;

import com.java8.tasks.Shop;
import com.java8.tasks.StockComparator;

public class ComparatorSorting {
	public static void main(String[] args)
    {
        // create the ArrayList object
        ArrayList<Shop> s = new ArrayList<Shop>();
        s.add(new Shop(218, "Pen", 520));
        s.add(new Shop(223, "Pencil", 213));
        s.add(new Shop(423, "Books", 101));
        s.add(new Shop(512, "Toy", 59));
        s.add(new Shop(723, "Bottle", 10));
  
        System.out.println("before sorting");
        for (Shop shop : s) {
            System.out.println(shop.stock + " " + shop.name
                               + " " + shop.ProductNo);
        }
        System.out.println();
  
        System.out.println(
            "After sorting(sorted by Stock)");
  
        // call the sort function
        Collections.sort(s, new StockComparator());
        for (Shop shop : s) {
            System.out.println(shop.stock + " " + shop.name
                               + " " + shop.ProductNo);
        }
    }
}
