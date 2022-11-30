package com.nop_Commerce.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.nop_Commerce.Pageobjects.HomePage;
import com.nop_Commerce.Pageobjects.LoginPage;

public class LoginPageTest  extends DriverBase{

	HomePage HomePage;
	LoginPage loginPage ; 
	
	@Test(priority=1,alwaysRun=true)
	public void userCanLoginSuccessfully(){
		HomePage = new HomePage(driver);
		HomePage.OpenLoginpage();
		loginPage = new LoginPage(driver);
		loginPage.userLogin("randhirall20@gmail.com", "automation");
		Assert.assertTrue(loginPage.successloginAssertion.getText().contains("Welcome to our store"));
		
	}
}

