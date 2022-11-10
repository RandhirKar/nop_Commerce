package com.nop_Commerce.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.nop_Commerce.Pageobjects.HomePage;
import com.nop_Commerce.Pageobjects.LoginPage;


public class LoginPageTest  extends TestBase{

	HomePage HomeObject ;
	LoginPage loginobject ; 
	
	@Test(priority=1,alwaysRun=true)
	public void userCanLoginSuccessfully() throws InterruptedException {
		HomeObject = new HomePage(driver);
		HomeObject.OpenLoginpage();
		loginobject = new LoginPage(driver);
		loginobject.userLogin("randhirall20@gmail.com", "automation");
		Assert.assertTrue(loginobject.successloginAssertion.getText().contains("Welcome to our store"));
		Thread.sleep(3000);
	}
}

