package com.java8NewTasks.test;
import java.time.LocalDate;  
import java.time.Period;  
import java.util.Scanner;

public class AgeCaluculator {
	public static void main(String args[])   
	{  
	System.out.print("Enter date of birth in YYYY-MM-DD format: ");  
	Scanner scanner = new Scanner(System.in);  
	//reads the date of birth from the user  
	String input = scanner.nextLine();  
	scanner.close();    
	LocalDate dob = LocalDate.parse(input);  
	//prints the age  
	System.out.println("You are " + calculateAge(dob)+" years old.");  
	}  
	//the method calculates the age  
	public static int calculateAge(LocalDate dob)   
	{  
	//creating an instance of the LocalDate class and invoking the now() method      
	LocalDate curDate = LocalDate.now();  
	//calculates the amount of time between two dates and returns the years  
	if ((dob != null) && (curDate != null))   
	{  
	return Period.between(dob, curDate).getYears();  
	}  
	else  
	{  
	return 0;  
	}  
	}  
}
