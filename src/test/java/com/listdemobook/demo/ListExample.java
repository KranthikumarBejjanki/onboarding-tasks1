package com.listdemobook.demo;

import java.util.ArrayList;
import java.util.List;

import com.collections.demo.ListDemoBook;

public class ListExample {
	public static void main(String[] args) {
		// Creating list of Books
		List<ListDemoBook> list = new ArrayList<ListDemoBook>();
		// Creating Books
		ListDemoBook b1 = new ListDemoBook(101, "Java", "James Gosling", "BPB", 8);
		ListDemoBook b2 = new ListDemoBook(102, "Data Communications and Networking", "Forouzan", "Mc Graw Hill", 4);
		ListDemoBook b3 = new ListDemoBook(103, "Operating System", "Galvin", "Wiley", 6);
		// Adding Books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		// Traversing list
		for (ListDemoBook b : list) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
	}
}
