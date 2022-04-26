package com.bdd.test.StepDefinitions;

import com.bddpractice.hooks.HooksSample;
import com.bddpractice.pagefactory.LoginPageFactory;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class AbstractStepDefinition {
  protected HooksSample hooksSample = new HooksSample();
  protected WebDriver driver = hooksSample.setTheBrowser("chrome");
  protected Properties properties = hooksSample.getPropertyClassObject();
  protected LoginPageFactory loginPageFactory = new LoginPageFactory(driver);
}
