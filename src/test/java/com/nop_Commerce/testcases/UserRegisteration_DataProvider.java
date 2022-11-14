package com.nop_Commerce.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.nop_Commerce.Base.BaseClass;
import com.nop_Commerce.Pageobjects.HomePage;
import com.nop_Commerce.Pageobjects.LoginPage;
import com.nop_Commerce.Pageobjects.UserRegistrationPage;

public class UserRegisteration_DataProvider extends BaseClass {

	public UserRegisteration_DataProvider(WebDriver driver) {
		super(driver);
		
	}
	private void userLogout() {
			
	}

	private HomePage homePage ; 
	private UserRegisteration_DataProvider registrationPage ;
	private LoginPage loginPage ;
	private String successMessage;

	@DataProvider(name="testdata")
	public static Object[][] userData(){
		return new Object[][] {
			{"Randhir1","Karn","rk@gmail.com","12345678"},
			{"Randhir2","Karn","rk1@gmail.com","123456789"}
		};
	}
	@Test(priority=1,alwaysRun=true,dataProvider="testdata")
	public void userRegistration(String firstName ,String lastName , String email ,String password, WebDriver driver) {
		homePage = new HomePage(driver); 
		homePage.openRegistrationPage();
		registrationPage = new UserRegisteration_DataProvider(driver); 
		registrationPage.userRegistration(firstName, lastName, email, password, driver);;
		Assert.assertTrue(registrationPage.successMessage.contains("Your registration completed"));
		registrationPage.userLogout();
		homePage.OpenLoginpage();
		LoginPage loginobject = new LoginPage(driver);
		loginobject.userLogin(email,password);
		registrationPage.userLogout();
try {
	Thread.sleep(1000);
} catch (Exception e) {
	e.printStackTrace();
}
	}

	
}
