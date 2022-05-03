package com.java8NewTasks.test;

import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class HomeTaskDateTime {
    public static void main(String[] args) {
        /*
        Write a predicate to check if the given date is yesterday date.
         */

        Predicate<LocalDate>  datePredicate = d -> d.isEqual(d.minusDays(1));
        System.out.println(datePredicate.test(LocalDate.now()));
        System.out.println(datePredicate.test(LocalDate.now().minusDays(1)));

        /*
        Write a Supplier to get Date for next Thursday.
         */
        Supplier<LocalDate> dateSupplier = () -> LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
        System.out.println(dateSupplier.get());

        /*
         Write a Supplier to get CurrentTime in EST timezone
         */
        Supplier<LocalDate> estDateSupplier = () -> LocalDate.now(ZoneId.of("America/New_York"));
        System.out.println(estDateSupplier.get());

        /*
        Write a Function to calculate the age of a person given date of birth.
         */
        Function<LocalDate, Integer> ageCalculator = d -> Period.between(d, LocalDate.now()).getYears();

    }
}
