package com.bddpractice.hooks;

import com.bddpractice.utils.DriverSetUp;
import com.bddpractice.utils.PropertyInitiator;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class HooksSample {
  protected Properties obj;
  protected WebDriver driver;

  @Before
  public WebDriver setTheBrowser(String browser) {
    getPropertyClassObject();
    try {
      driver = DriverSetUp.browser(browser);
      return driver;
    } catch (NullPointerException exception) {
      exception.printStackTrace();
    }
    return driver;
  }

  public Properties getPropertyClassObject() {
    return obj = PropertyInitiator.objectReturn();
  }
}

