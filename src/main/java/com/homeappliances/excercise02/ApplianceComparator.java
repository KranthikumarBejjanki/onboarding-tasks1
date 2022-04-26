package com.homeappliances.excercise02;

import java.util.*;
import java.util.Map;
import java.util.Map.Entry;

public class ApplianceComparator {

    private ApplianceComparator(){}

  public static void sortUsingComparator(Map<String, Double> appliancesHashMap) {

    Set<Entry<String, Double>> entrySet = appliancesHashMap.entrySet();

    List<Entry<String, Double>> list = new ArrayList<>(entrySet);

    Collections.sort(
        list,
        new Comparator<Entry<String, Double>>() {
          @Override
          public int compare(Entry<String, Double> o1, Entry<String, Double> o2) {
            return o1.getValue().compareTo(o2.getValue());
          }
        });

    System.out.println("Sorted using Comparator...");
    for (Map.Entry<String, Double> entry : list) {
      System.out.println(entry.getKey() + " " +"Running Hours: "+ entry.getValue());
    }
  }
}

