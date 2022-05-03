package com.java8NewTasks.test;

import java.util.ArrayList;
import java.util.List;

public class HomeTaskFunctionalInterfaces {

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("A", 100, "Non-Electronic", "Grade-A"));
        productList.add(new Product("B", 1200, "Electronic", "Grade-B"));
        productList.add(new Product("C", 300, "Electronic", "Grade-C"));
        productList.add(new Product("D", 1400, "Electronic", "Grade-D"));
        productList.add(new Product("E", 500, "Non-Electronic", "Grade-E"));

        //calculate the cost of all products in a given list of products.
        int sumOfAllPrices = productList.stream()
                .map(Product::getPrice)
                .reduce(0,(sum, price) -> sum+=price);
        System.out.println(" sumOfAllPrices  -> " + sumOfAllPrices);

        //calculate the cost of all products whose prices is > 1000/- in the given list of products.
        int sumOfAllPricesGreaterThan1000 = productList.stream()
                .filter(product -> product.getPrice() > 1000)
                .map(Product::getPrice)
                .reduce(0,(sum, price) -> sum+=price);
        System.out.println(" sumOfAllPricesGreaterThan1000  -> " + sumOfAllPricesGreaterThan1000);

        //calculate the cost of all electronic products in the given list of products.
        int sumOfElectronicProducts = productList.stream()
                .filter(product -> product.getCategory().equalsIgnoreCase("Electronics"))
                .map(Product::getPrice)
                .reduce(0,(sum, price) -> sum+=price);
        System.out.println(" sumOfElectronicProducts  -> " + sumOfElectronicProducts);

       // all the products whose price is is > 1000/- and belongs to electronic category.
        int sumOfElectronicProductsGreaterThan1000 = productList.stream()
                .filter(product -> product.getCategory().equalsIgnoreCase("Electronics") && product.getPrice() > 1000)
                .map(Product::getPrice)
                .reduce(0,(sum, price) -> sum+=price);
        System.out.println(" sumOfElectronicProductsGreaterThan1000  -> " + sumOfElectronicProductsGreaterThan1000);

    }
}


