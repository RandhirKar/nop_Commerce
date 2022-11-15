package com.nop_Commerce.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.nop_Commerce.Base.BaseClass;
import com.nop_Commerce.Pageobjects.HomePage;
import com.nop_Commerce.Pageobjects.LoginPage;

public class UserRegisterationTest extends BaseClass {

	public UserRegisterationTest(WebDriver driver) {
		super(driver);
	}

	HomePage homePage;
	UserRegisterationTest registerPage;
	private Object successMessage;

	@Test(priority = 1, alwaysRun = true)
	public void userCanRegisterSuccessfully() {
		homePage = new HomePage(drvier);
		homePage.openRegistrationPage();
		registerPage = new UserRegisterationTest();
		registerPage.userRegistration("Mukul", "Karn", "mukul4u@gmail.com", "123456");
		Assert.assertTrue(registerPage.successMessage.getText().contains("Your registration completed"));
	}

	@Test(dependsOnMethods = { "userCanRegisterSuccessfully" })
	public void registeredUserCanLogout() {
		registerPage.userLogout();
	}

	@Test(dependsOnMethods = { "registeredUserCanLogout" })
	public void registeredUserCanLogin() throws InterruptedException {
		homePage.OpenLoginpage();
		LoginPage loginobject = new LoginPage(drvier);
		loginobject.userLogin("mukul4u@gmail.com.com", "123456");
		Assert.assertTrue(registerPage.logoutLink.getText().contains("Log out"));
		Thread.sleep(3000);
	}

}
