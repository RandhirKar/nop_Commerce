package com.nop_Commerce.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.nop_Commerce.Base.BaseClass;

public class MyAccountPage extends BaseClass {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "Change password")
	WebElement changePasswordLink;

	@FindBy(id = "OldPassword")
	WebElement oldPasswordTxt;

	@FindBy(id = "NewPassword2")
	WebElement newPasswordTxt;

	@FindBy(id = "ConfirmNewPassword")
	WebElement confirmPasswordTxt;

	@FindBy(css = "input.button-1.change-password-button")
	WebElement ChangePasswordBtn;

	@FindBy(xpath = "//*[contains(@class,',result,')]")
	public WebElement resultLbl;

	public void openChangePasswordPage() {
		clickButton(changePasswordLink);
	}
	public void ChangePassword(String oldpassword, String newpassword) {
		setTextElementText(oldPasswordTxt, oldpassword);
		setTextElementText(newPasswordTxt, newpassword);
		setTextElementText(confirmPasswordTxt, newpassword);
		clickButton(ChangePasswordBtn);
	}
}
