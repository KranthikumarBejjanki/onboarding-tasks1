package com.java8.tasks;

import java.util.ArrayList;
import java.util.List;

public class LambdaSample {

  /*Enables Functional Programming
   * Readable and concise code
   * Easier to use APIs and libraries
   * Enables support for parallel processing*/

  public static void main(String[] args) {
    LambdaInterfaceSample lambdaInterfaceSample = () -> System.out.println("Drawing ");
    lambdaInterfaceSample.greeting();

    LambdaInterfaceSample lambdaInterfaceSample1 =
        new LambdaInterfaceSample() {
          @Override
          public void greeting() {
            System.out.println("Hello drawing");
          }
        };

    lambdaInterfaceSample1.greeting();

    List<String> list = new ArrayList<String>();
    list.add("Kranthi");
    list.add("Bejjanki");
    list.add("Devendra");
    list.add("Wagh");

    list.forEach((n) -> System.out.println(n));
  }
}
