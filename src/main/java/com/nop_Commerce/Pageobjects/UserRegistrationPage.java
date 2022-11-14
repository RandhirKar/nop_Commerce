package com.nop_Commerce.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.nop_Commerce.Base.BaseClass;

public class UserRegistrationPage extends BaseClass {

	public UserRegistrationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "gender-male")
	WebElement genderRdoBtn;

	@FindBy(id = "FirstName")
	WebElement fnTxtBox;

	@FindBy(id = "LastName")
	WebElement lnTxtBox;

	@FindBy(id = "Email")
	WebElement emailTxtBox;

	@FindBy(id = "Password")
	WebElement passwordTxtBox;

	@FindBy(id = "ConfirmPassword")
	WebElement confirmPasswordTxtBox;

	@FindBy(id = "register-button")
	WebElement registerBtn;

	@FindBy(xpath = "//*[contains(@class,',result,')]"
	public WebElement successMessage;

	@FindBy(linkText = "Log out")
	public WebElement logoutLink;

	@FindBy(linkText = "My account")
	public WebElement myAccountLink;

	public void userRegistration(String firstName, String lastName, String email, String password) {
		clickButton(genderRdoBtn);
		setTextElementText(fnTxtBox, firstName);
		setTextElementText(lnTxtBox, lastName);
		setTextElementText(emailTxtBox, email);
		setTextElementText(passwordTxtBox, password);
		setTextElementText(confirmPasswordTxtBox, password);
		clickButton(registerBtn);
	}

	public void userLogout() {
		clickButton(logoutLink);
	}

	public void openMyAccountPage() {
		clickButton(myAccountLink);
	}
}
