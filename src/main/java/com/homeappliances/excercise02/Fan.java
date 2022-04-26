package com.homeappliances.excercise02;

public class Fan implements Appliances {
	private int unitsPerHour = 1;

	  public double getConsumptionInUnitsPerHour() {
	    return unitsPerHour;
	  }

	  public void setConsumptionInUnitsPerHour(int unitsPerHour) {
	    this.unitsPerHour = unitsPerHour;
	  }
}
