package com.bddpractice.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Properties;

public class DriverSetUp {

  public static WebDriver browser(String h) {

    try {
      Properties obj = PropertyInitiator.objectReturn();
      if (h.equalsIgnoreCase("chrome")) {
        System.setProperty("webdriver.chrome.driver", obj.getProperty("chromeDriverPath"));
        WebDriver d = new ChromeDriver();
        d.manage().window().maximize();
        Thread.sleep(5000);
        return d;
      } else {

        System.setProperty("webdriver.gecko.driver", obj.getProperty("geckoDriverPath"));
        System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
        System.setProperty(
            FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "src/main/resources/fireFox.txt");

        WebDriver d = new FirefoxDriver();
        d.manage().window().maximize();
        // d.wait(10000);
        return d;
      }
    } catch (Exception j) {
      return null;
    }
  }
}
