package com.nop_Commerce.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.nop_Commerce.Base.BaseClass;
import com.nop_Commerce.Pageobjects.HomePage;
import com.nop_Commerce.Pageobjects.LoginPage;

public class UserRegisterationTest extends BaseClass {

	HomePage homeObject;
	UserRegisterationTest registerObject;
	private Object successMessage;

	@Test(priority = 1, alwaysRun = true)
	public void userCanRegisterSuccessfully() {
		homeObject = new HomePage(drvier);
		homeObject.openRegistrationPage();
		registerObject = new UserRegisterationTest();
		registerObject.userRegistration("Mukul", "Karn", "mukul4u@gmail.com", "123456");
		Assert.assertTrue(registerObject.successMessage.getText().contains("Your registration completed"));
	}

	@Test(dependsOnMethods = { "userCanRegisterSuccessfully" })
	public void registeredUserCanLogout() {
		registerObject.userLogout();
	}

	@Test(dependsOnMethods = { "registeredUserCanLogout" })
	public void registeredUserCanLogin() throws InterruptedException {
		homeObject.OpenLoginpage();
		LoginPage loginobject = new LoginPage(drvier);
		loginobject.userLogin("mukul4u@gmail.com.com", "123456");
		Assert.assertTrue(registerObject.logoutLink.getText().contains("Log out"));
		Thread.sleep(3000);
	}

}
