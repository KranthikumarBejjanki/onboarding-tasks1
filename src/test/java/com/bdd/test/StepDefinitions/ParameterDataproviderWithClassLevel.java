package com.bdd.test.StepDefinitions;

import com.bddpractice.utils.DataProviderSampleClass;
import com.bddpractice.utils.DriverSetUp;
import com.bddpractice.utils.PropertyInitiator;
import com.bddpractice.utils.WebUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class ParameterDataproviderWithClassLevel {

  Properties properties = PropertyInitiator.objectReturn();
  WebDriver driver;

  @BeforeTest
  public void setup() {
    driver = DriverSetUp.browser("chrome");
    driver.get(properties.getProperty("url"));
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
  }

  @Test(dataProvider = "SearchProvider", dataProviderClass = DataProviderSampleClass.class)
  public void testMethod(String searchKey) throws InterruptedException {
    WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

    searchBox.click();
    // Search text in google text box
    searchBox.sendKeys(searchKey);
    searchBox.sendKeys(Keys.ENTER);
    WebUtils.sleep(8000);
    WebElement searchResult =
        driver.findElement(By.xpath("//*[@data-component-type='s-search-result']"));
    // verify if search box has correct value
    Assert.assertTrue(searchResult.isDisplayed(), "Given value is not matching to the input");
    driver.close();
  }
}
