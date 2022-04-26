package com.homeappliances.excercise02;

public class Light implements Appliances{
	private int unitsPerHour = 2;

	  public double getConsumptionInUnitsPerHour() {
	    return unitsPerHour;
	  }

	  public void setConsumptionInUnitsPerHour(int unitsPerHour) {
	    this.unitsPerHour = unitsPerHour;
	  }
}
