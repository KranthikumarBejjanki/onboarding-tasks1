package com.java8NewTasks.test;

public class SecondBiggestNumberWithJava8 {
	private static double[] array = {545, 23, 92, 1, 200, 532, 43, 643, 8444}; 
    public static void main(String[] args) { 
        double a,b; 
        a = b = Double.NEGATIVE_INFINITY; 
        for (double c : array) 
            if (c>b) 
                if (c>a) { 
                    b=a; 
                    a=c; 
                } 
                else b = c; 
        System.out.print("Second biggest number in array :" 
             + (b > Double.NEGATIVE_INFINITY && a != b 
                ? b : "doesn't exist")); 
    } 
}
