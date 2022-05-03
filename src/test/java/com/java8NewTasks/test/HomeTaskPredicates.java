package com.java8NewTasks.test;

import com.java8.tasks.ProductAPI;
import com.java8.tasks.Response;

import java.util.ArrayList;
import java.util.List;

public class HomeTaskPredicates {
    public static void printProductsWithPriceGreaterThan1000(List<ProductAPI> productAPIList){
        productAPIList.stream().filter(productAPI -> productAPI.getPrice()>1000).forEach(System.out::println);
    }

    public static void printProductsWithElectronicsCategory(List<ProductAPI> productAPIList){
        productAPIList.stream().filter(productAPI -> productAPI.getCategory().equalsIgnoreCase("electronics")).forEach(System.out::println);
    }

    public static void printProductsWithElectronicsCategoryAndPriceGreaterThan100(List<ProductAPI> productAPIList){
        productAPIList.stream().filter(productAPI -> productAPI.getCategory().equalsIgnoreCase("electronics") && productAPI.getPrice()>100).forEach(System.out::println);
    }

    public static void printProductsWithElectronicsCategoryORPriceGreaterThan100(List<ProductAPI> productAPIList){
        productAPIList.stream().filter(productAPI -> productAPI.getCategory().equalsIgnoreCase("electronics") || productAPI.getPrice()>100).forEach(System.out::println);
    }

    public static void printProductsWithElectronicsCategoryAndLessThan100(List<ProductAPI> productAPIList){
        productAPIList.stream().filter(productAPI -> productAPI.getCategory().equalsIgnoreCase("electronics") && productAPI.getPrice()<100).forEach(System.out::println);
    }

    public static void printResponsesWithStatusCode400(List<Response> responseList){
        responseList.stream().filter(response -> response.getCode().equals("400")).forEach(System.out::println);
    }

    public static void printResponsesWithResponseTypeJSON(List<Response> responseList){
        responseList.stream().filter(response -> response.getType().equals("JSON")).forEach(System.out::println);
    }

    public static void printResponsesWithStatusCode400AndResponseTypeJSON(List<Response> responseList){
        responseList.stream().filter(response -> response.getCode().equals("400") && response.getType().equals("JSON")).forEach(System.out::println);
    }

    public static void printResponsesWithStatusCode400ORResponseTypeJSON(List<Response> responseList){
        responseList.stream().filter(response -> response.getCode().equals("400") || response.getType().equals("JSON")).forEach(System.out::println);
    }

    public static void printResponsesWithStatusCodeNot400AndResponseTypeJSON(List<Response> responseList){
        responseList.stream().filter(response -> !response.getCode().equals("400") && response.getType().equals("JSON")).forEach(System.out::println);
    }


    public static void main(String[] args) {
        List<ProductAPI> productAPIList = new ArrayList<>();
        productAPIList.add(new ProductAPI("A",2000,"electronics",""));
        productAPIList.add(new ProductAPI("B",3000,"",""));
        productAPIList.add(new ProductAPI("C",200,"",""));
        productAPIList.add(new ProductAPI("D",300,"electronics",""));
        productAPIList.add(new ProductAPI("E",50,"electronics",""));
        productAPIList.add(new ProductAPI("F",90,"",""));

        printProductsWithPriceGreaterThan1000(productAPIList);
        printProductsWithElectronicsCategory(productAPIList);
        printProductsWithElectronicsCategoryAndPriceGreaterThan100(productAPIList);
        printProductsWithElectronicsCategoryORPriceGreaterThan100(productAPIList);
        printProductsWithElectronicsCategoryAndLessThan100(productAPIList);


        List<Response> responseList = new ArrayList<>();
        responseList.add(new Response("A", "400", "XML"));
        responseList.add(new Response("B", "400", "JSON"));
        responseList.add(new Response("C", "400", "HTML"));
        responseList.add(new Response("D", "200", "JSON"));
        responseList.add(new Response("F", "404", "JSON"));

        printResponsesWithStatusCode400(responseList);
        printResponsesWithResponseTypeJSON(responseList);
        printResponsesWithStatusCode400AndResponseTypeJSON(responseList);
        printResponsesWithStatusCode400ORResponseTypeJSON(responseList);
        printResponsesWithStatusCodeNot400AndResponseTypeJSON(responseList);

    }

}
