package com.listdemobook.demo;

import java.util.HashSet;
import java.util.List;

import com.collections.demo.SetDemoBook;

public class SetExample {
	public static void main(String[] args) {
		// Creating list of Books
		HashSet<SetDemoBook> set = new HashSet<SetDemoBook>();
		// Creating Books
		SetDemoBook b1 = new SetDemoBook(101, "Java", "James Gosling", "BPB", 8);
		SetDemoBook b2 = new SetDemoBook(102, "Data Communications and Networking", "Forouzan", "Mc Graw Hill", 4);
		SetDemoBook b3 = new SetDemoBook(103, "Operating System", "Galvin", "Wiley", 6);
		// Adding Books to list
		set.add(b1);
		set.add(b2);
		set.add(b3);
		// Traversing list
		for (SetDemoBook b : set) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
	}
}
