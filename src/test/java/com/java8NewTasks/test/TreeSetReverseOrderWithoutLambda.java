package com.java8NewTasks.test;

import java.util.TreeSet;

public class TreeSetReverseOrderWithoutLambda {
	public static void main(String[] args) {
	      TreeSet<Object> treeSet = new TreeSet<Object>();
	      treeSet.add(45);
	      treeSet.add(15);
	      treeSet.add(99);
	      treeSet.add(70);
	      treeSet.add(65);
	      treeSet.add(30);
	      treeSet.add(10);
	      treeSet.add(60);
	      treeSet.add(80);
	      System.out.println("TreeSet\n" + treeSet);
	      TreeSet<Object> res = (TreeSet<Object>)treeSet.descendingSet();
	      System.out.println("TreeSet after sorting in descending order\n" + res);
	   }
}
