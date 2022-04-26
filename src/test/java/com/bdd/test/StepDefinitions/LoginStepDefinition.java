package com.bdd.test.StepDefinitions;

import com.bddpractice.utils.WebUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class LoginStepDefinition extends AbstractStepDefinition {

	@Given("user navigates to Testing demo website")
	public void openBrowser() {
		driver.get(properties.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}

	/*
	 * @Then("^User enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	 * public void enterNumber(String username, String password) {
	 * 
	 * driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
	 * driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	 * WebUtils.sleep(3000); driver.close(); }
	 */
	
	@Then("^User enter Username as \"([^\"]*)\"$")
	public void enterNumber(String username) {

		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		WebUtils.sleep(3000);
		driver.close();
	}

	/*
	 * @Then("login should be successful") public void userIsOnLoginPage() {
	 * driver.findElement(By.xpath("//input[@id='login-button']")).click();
	 * WebUtils.sleep(3000); String pageTitle = driver.getTitle();
	 * Assert.assertEquals(pageTitle, "Swag Labs"); driver.close(); }
	 */

}
