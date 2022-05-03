package com.java8NewTasks.test;

import java.util.Random;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;

public class HomeTaskPrimitiveInterfaces {
    public static void main(String[] args) {

        /*
        Write an IntPredicate to verify if the given number is a primenumber
         */

        IntPredicate primeNumber = n -> {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) return false;
            }
            return true;
        };

        System.out.println(primeNumber.test(7) ? "PRIME" : "NOT A PRIME");

        /*
        Write an IntConsumer to print square of the given number
         */

        IntConsumer intConsumer = n -> System.out.println(n*n);
        intConsumer.accept(10);

        /*
        Write a IntSupplier to give random int below 5000.
         */

        IntSupplier intSupplier = () -> (new Random()).nextInt(5000);
        System.out.println(intSupplier.getAsInt());
    }
}
