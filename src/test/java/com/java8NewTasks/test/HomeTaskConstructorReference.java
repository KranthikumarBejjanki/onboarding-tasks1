package com.java8NewTasks.test;

import java.util.function.BiFunction;

public class HomeTaskConstructorReference {
    public static void main(String[] args) {
        /*
        Write a program get the details of Employee Object ,
         such as name,account,salary ,
         where Employee class has parameterized constructor using constructor reference
         */

        EmployeeFunctionalInterface functionalInterface = Employee::new;

        System.out.println(functionalInterface.getEmployee("A", "account", 1000));
    }
}

class Employee {
    private String name;
    private String account;
    private int salary;

    public Employee(String name, String account, int salary) {
        this.name = name;
        this.account = account;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", account='" + account + '\'' +
                ", salary=" + salary +
                '}';
    }
}

@FunctionalInterface
interface EmployeeFunctionalInterface {
    Employee getEmployee(String name, String account, int salary);
}
