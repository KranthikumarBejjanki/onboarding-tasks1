package com.bddpractice.utils;

import org.testng.annotations.DataProvider;

public class DataProviderSampleClass {

  @DataProvider(name = "SearchProvider")
  public static Object[][] getDataFromDataprovider() {
    return new Object[][] {{"Kindle"}};
  }
}
