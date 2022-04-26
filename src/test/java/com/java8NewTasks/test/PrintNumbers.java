package com.java8NewTasks.test;

import com.java8NewTasks.test.PrintNumbersUsingRunnable;

public class PrintNumbers {
	final static int MAX_NUMBERS = 10;
	  public static void main(String[] args) {
	    // shared object
	    PrintNumbers obj = new PrintNumbers();
	    // Creating 3 threads
	    Thread t1 = new Thread(new PrintNumbersUsingRunnable(obj, 0), "T1");
	    Thread t2 = new Thread(new PrintNumbersUsingRunnable(obj, 1), "T2");
	    Thread t3 = new Thread(new PrintNumbersUsingRunnable(obj, 2), "T3");
	    t1.start();
	    t2.start();
	    t3.start();
	  }
}
