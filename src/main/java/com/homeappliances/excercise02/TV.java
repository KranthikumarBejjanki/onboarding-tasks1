package com.homeappliances.excercise02;

public class TV implements Appliances{
	 private int unitsPerHour = 3;

	  public double getConsumptionInUnitsPerHour() {
	    return unitsPerHour;
	  }

	  public void setConsumptionInUnitsPerHour(int unitsPerHour) {
	    this.unitsPerHour = unitsPerHour;
	  }
}
