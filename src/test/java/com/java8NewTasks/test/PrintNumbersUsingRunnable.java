package com.java8NewTasks.test;



public class PrintNumbersUsingRunnable implements Runnable {
	PrintNumbers obj;
	  int threadNumber;
	  static int number = 0;
	  PrintNumbersUsingRunnable(PrintNumbers obj, int result){
	    this.obj = obj;
	    this.threadNumber = result;
	  }
	  @Override
	  public void run() {
	    while (number < PrintNumbers.MAX_NUMBERS) {
	      synchronized(obj) {	
	        // check again for (number < PrintNumbers.MAX_NUMBERS) otherwise one more number my be
	        // printed by another thread
	        if(number % 3 == threadNumber && number < PrintNumbers.MAX_NUMBERS){
	          System.out.println(Thread.currentThread().getName() + " - " + ++number);
	        }
	      }
	    }                             
	  }
}
