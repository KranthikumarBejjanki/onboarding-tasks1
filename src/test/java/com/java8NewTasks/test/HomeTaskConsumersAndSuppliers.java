package com.java8NewTasks.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class HomeTaskConsumersAndSuppliers {

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("A", 100, "Non-Electronic", "Grade-A"));
        productList.add(new Product("B", 1200, "Electronic", "Grade-B"));
        productList.add(new Product("C", 300, "Electronic", "Grade-C"));
        productList.add(new Product("D", 1400, "Electronic", "Grade-D"));
        productList.add(new Product("E", 500, "Non-Electronic", "Grade-E"));

        /*
           *********************************** CONSUMER TASKS *******************************************
         */

        /* consumer to print the product to appropriate medium depending on the print parameter. If the print parameter is set to file,
         consumer shall log the product to file, if not print on the console. */
        String printParameter = "CONSOLE";
        Consumer<Product> printFileOrConsole = product -> {
            if(printParameter.equals("FILE")){
                try(BufferedWriter writer = new BufferedWriter(new FileWriter(new File("product-file"))))
                {
                    writer.write(product.toString());
                }catch (IOException ex){
                    ex.printStackTrace();
                }
            }else if(printParameter.equals("CONSOLE")){
                System.out.println(printParameter);
            }
        };
        productList.forEach(printFileOrConsole);


        /*Consumer to update the grade of the product as 'Premium' if the price is > 1000/-. Given the product list,
        update the grade for each product and print all of the products. */
        Consumer<Product> updateGradeAsPremiumForPriceGreaterThan1000 = product -> {
            if(product.getPrice() > 1000){
                product.setGrade("Premium");
            }
        };
        productList.forEach(updateGradeAsPremiumForPriceGreaterThan1000);
        productList.forEach(System.out::println);


        /* Consumer to update the name of the product to be suffixed with '*' if the price of product is > 3000/-.
         Given the product list, update the name for each product and print all of the products. */

        Consumer<Product> suffixNameWithAsteriskForPriceGreaterThan3000 = product -> {
            if(product.getPrice() > 3000){
                product.setName(product.getName() + "*");
            }
        };

        productList.forEach(suffixNameWithAsteriskForPriceGreaterThan3000);
        productList.forEach(System.out::println);

        /*
            Print all the Premium grade products with name suffixed with '*'.
         */
        productList.stream()
                .filter(product -> product.getName().endsWith("*"))
                .forEach(System.out::println);



        /*
         *********************************** SUPPLIER TASKS *******************************************
         */


        /*
            Write a supplier to produce a random product.
         */

        Supplier<Product> randomProductSupplier = () -> new Product("Random Product", 0, "Random", "Random");
        System.out.println(randomProductSupplier.get());


        /*
        Write a supplier to produce a random OTP.
         */
        Supplier<Integer> otpSupplier = () -> 1000 * Integer.parseInt(String.valueOf(Math.random()));

        System.out.println(otpSupplier.get());


    }
}

