package com.nop_Commerce.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.nop_Commerce.Base.BaseClass;
import com.nop_Commerce.Pageobjects.HomePage;
import com.nop_Commerce.Pageobjects.LoginPage;
import com.nop_Commerce.Pageobjects.UserRegistrationPage;


public class UserRegistration extends DriverBase {

	private HomePage homePage;
	private UserRegistrationPage registrationPage;
	private String successMessage;

	@Test(priority = 1, alwaysRun = true)
	public void userCanRegisterSuccessfully() {
		homePage = new HomePage(driver);
		homePage.openRegistrationPage();
		registrationPage = new UserRegistrationPage(driver);
		registrationPage.userRegistration("Mukul", "Karn", "mukul42u@gmail.com", "123456");
		Assert.assertTrue(registrationPage.successMessage.getText().contains("Your registration completed"));
	}

	@Test(dependsOnMethods = { "userCanRegisterSuccessfully" })
	public void registeredUserCanLogout() {
		registrationPage.userLogout();
	}

	@Test(dependsOnMethods = { "registeredUserCanLogout" })
	public void registeredUserCanLogin() throws InterruptedException {
		homePage.OpenLoginpage();
		LoginPage loginobject = new LoginPage(driver);
		loginobject.userLogin("mukul4u@gmail.com.com", "123456");
		Assert.assertTrue(registrationPage.logoutLink.getText().contains("Log out"));
		Thread.sleep(3000);
	}

}
