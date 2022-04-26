package com.java8.tasks.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.java8.tasks.Product;

public class StreamExample {
public static void main(String[] args) {  
    
    List<Product> productsList = new ArrayList<Product>();  
      
    //Adding Products  
    productsList.add(new Product(1,"HP Laptop",25000f));  
    productsList.add(new Product(2,"Dell Laptop",30000f));  
    productsList.add(new Product(3,"Lenevo Laptop",28000f));  
    productsList.add(new Product(4,"Sony Laptop",28000f));  
    productsList.add(new Product(5,"Apple Laptop",90000f));  
      
    List<Object> productPriceList =   
            productsList.stream()  
                        .filter(new Predicate<Product>() {
							@Override
							public boolean test(Product p) {
								return p.price > 30000;
							}
						}) // filtering data  
                        .map(Product::getPrice)         // fetching price by referring getPrice method  
                        .collect(Collectors.toList());  // collecting as list  
    System.out.println(productPriceList);  
} 
}
