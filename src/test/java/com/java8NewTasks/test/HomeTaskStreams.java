package com.java8NewTasks.test;

import java.util.ArrayList;
import java.util.List;

public class HomeTaskStreams {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("A", 100, "Non-Electronic", "Grade-A"));
        productList.add(new Product("B", 1200, "Electronic", "Grade-B"));
        productList.add(new Product("C", 300, "Electronic", "Grade-C"));
        productList.add(new Product("D", 1400, "Electronic", "Grade-D"));
        productList.add(new Product("E", 500, "Non-Electronic", "Grade-E"));

        /*
        From the given list of the products get all the products with price > 1000/-
         */

        productList.stream().filter(p -> p.getPrice() > 1000).forEach(System.out::println);

        /*
        From the given list of the products get all the products from electronics category.
         */
        productList.stream().filter(p -> p.getCategory().equalsIgnoreCase("Electronic")).forEach(System.out::println);

        /*
        From the given list of the products get all the products with price> 1000/- and from electronics category.
        Change the name of the result list into CAP letters before printing.
         */
        productList.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Electronic") && p.getPrice() > 1000)
                .peek(p -> p.setName(p.getName().toUpperCase()))
                .forEach(System.out::println);

        /*
        Calculate the count of all electronic products in the given list of products.
         */
        System.out.println(productList.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Electronic"))
                .count());

    }
}
