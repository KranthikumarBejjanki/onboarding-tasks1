package com.java8NewTasks.test;
import java.util.*;

import com.java8.tasks.Employee;
public class CollectionsSortUSingJava8 {
	public static void main(String[] args) {

        List < Employee > employees = new ArrayList < Employee > ();
        employees.add(new Employee(10, "Ramesh", 30, 400000));
        employees.add(new Employee(20, "Santosh", 29, 350000));
        employees.add(new Employee(30, "Sanjay", 30, 450000));
        employees.add(new Employee(40, "Pramod", 29, 500000));

        Collections.sort(employees, new Comparator < Employee > () {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int)(o1.getName().compareTo(o2.getName()));
            }
        });

        // using lambda expression
        // ascending order
        Collections.sort(employees, (o1, o2) -> (o1.getName().compareTo(o2.getName())));
        System.out.println("Ascending order => " + employees);
        // descending order
        Collections.sort(employees, (o1, o2) -> (o2.getName().compareTo(o1.getName())));
        System.out.println("Descending order => " + employees);
        // using Comparator.comparing() method
        Collections.sort(employees, Comparator.comparing(Employee::getName));
    }

}

class MySort implements Comparator < Employee > {

    @Override
    public int compare(Employee o1, Employee o2) {
        return (int)(o1.getSalary() - o2.getSalary());
    }
}
