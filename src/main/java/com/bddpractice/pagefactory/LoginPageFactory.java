package com.bddpractice.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {

	@FindBy(id = "nav-link-accountList-nav-line-1")
	WebElement amazonLogin;

	@FindBy(xpath = "//input[@name='email']")
	WebElement emailField;

	@FindBy(xpath = "//*[@type='submit']")
	WebElement continueButton;

	@FindBy(css = "div[id='auth-email-missing-alert']")
	WebElement errorMessage;

	public LoginPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickLogin() {
		amazonLogin.click();
	}

	public void enterNumber() {
		emailField.click();
	}

	public void clickContinue() {
		continueButton.click();
	}

	public boolean getErrorMessage() {
		return errorMessage.isDisplayed();
	}

	public void EnterUsername() {

	}

}
