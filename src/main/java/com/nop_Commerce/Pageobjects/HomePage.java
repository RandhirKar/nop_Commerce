package com.nop_Commerce.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.nop_Commerce.Base.BaseClass;

public class HomePage extends BaseClass {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "Register")
	WebElement registerLink;

	@FindBy(className = "ico-login")
	WebElement loginlink;

	public void openRegistrationPage() {
		clickButton(registerLink);
	}

	public void OpenLoginpage() {
		clickButton(loginlink);
	}
}
