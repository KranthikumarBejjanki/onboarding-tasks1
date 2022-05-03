package com.java8NewTasks.test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class HomeTaskBiFunctionalInterfaces {

    public static void main(String[] args) {

        /*
        Given the name and price of the product, write a Bifunction to create a product.
         */
        BiFunction<String, Integer, Product> createProduct = (name, price) -> new Product(name, price, "", "");
        System.out.println(createProduct.apply("Product A", 1000));

        /*
        Given the Product and quantity of the products,
        write a BiFunction to calculate the cost of products.
         A cart is a map of product and quantity.
         Given the cart, calculate the cost of the cart.
         */

        BiFunction<Product, Integer, Integer> calculateCost = (product, qty) -> product.getPrice() * qty;
        System.out.println(calculateCost.apply(new Product("A", 1000, "", ""), 10));

        Map<Product, Integer> productQuantityMap = new HashMap<>();

        productQuantityMap.put(createProduct.apply("Product A", 1000), 10);
        productQuantityMap.put(createProduct.apply("Product B", 2000), 20);
        productQuantityMap.put(createProduct.apply("Product C", 3000), 30);
        productQuantityMap.put(createProduct.apply("Product D", 4000), 40);

        int totalCost = 0;
        for (Map.Entry<Product, Integer> productIntegerEntry : productQuantityMap.entrySet()) {
            totalCost+=calculateCost.apply(productIntegerEntry.getKey(), productIntegerEntry.getValue());
        }
        System.out.println("totalCost -> " + totalCost);

    }


}

