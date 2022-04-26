package com.appliances.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import com.homeappliances.excercise02.*;

public class AppliancesEnergyConsumptionCaluculator {
	protected List<Appliances> list = new ArrayList<>();
	  protected Map<Appliances, Double> map = new HashMap<>();
	  protected HashMap<String, Double> map1 = new HashMap<>();
	  double price = 0;
	  private static Appliances1 appliancesAPT = new Appliances1();

	  public void switchOnAppliances(List<Appliances> list) {
	    this.list = list;
	  }

	  public void getTheRunningTimeOfEachAppliances(Appliances appliances, double hours) {
	    map.put(appliances, hours);
	  }

	  public double powerBillCalculation(double updatedPricePerUnit) {
	    for (Appliances appliances : map.keySet()) {
	      if (list.contains(appliances)) {
	        price =
	            price
	                + (appliances.getConsumptionInUnitsPerHour() * map.get(appliances))
	                    * updatedPricePerUnit;
	      }
	    }
	    return price;
	  }

	  public void sortAppliancesByTypes(Fan fan, TV tv, Light light) {
	    map1.put("Fan", map.get(fan));
	    map1.put("Light", map.get(tv));
	    map1.put("TV", map.get(light));
	    TreeMap<String, Double> sortedTreeMap = new TreeMap<>();
	    sortedTreeMap.putAll(map1);
	    for (Map.Entry<String, Double> entry : sortedTreeMap.entrySet()) {
	      System.out.println(
	          "Devices Type= " + entry.getKey() + ", Running Hours = " + entry.getValue());
	    }
	  }

	  public static void main(String[] args) {
		  AppliancesEnergyConsumptionCaluculator apartmentEngryConsumptionCalculator =
	        new AppliancesEnergyConsumptionCaluculator();
	    List<Appliances> listAppliances = new ArrayList<>();
	    appliancesAPT.setPricePerUnit(20.0);
	    double pricePerUnit = appliancesAPT.getPricePerUnit();
	    Fan fan = new Fan();
	    Light light = new Light();
	    TV tv = new TV();
	    listAppliances.add(fan);
	    listAppliances.add(light);
	    listAppliances.add(tv);
	    apartmentEngryConsumptionCalculator.switchOnAppliances(listAppliances);
	    apartmentEngryConsumptionCalculator.getTheRunningTimeOfEachAppliances(fan, 8);
	    apartmentEngryConsumptionCalculator.getTheRunningTimeOfEachAppliances(light, 4);
	    apartmentEngryConsumptionCalculator.getTheRunningTimeOfEachAppliances(tv, 3);
	    System.out.println(
	        "Electricity Bill Amount: "
	            + apartmentEngryConsumptionCalculator.powerBillCalculation(pricePerUnit));
	    apartmentEngryConsumptionCalculator.sortAppliancesByTypes(fan, tv, light);
	    ApplianceComparator.sortUsingComparator(apartmentEngryConsumptionCalculator.map1);
	  }
}
