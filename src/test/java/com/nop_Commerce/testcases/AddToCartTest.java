package com.nop_Commerce.testcases;

import org.testng.annotations.Test;
import com.nop_Commerce.Pageobjects.HomePage;
import com.nop_Commerce.Pageobjects.LoginPage;

public class AddToCartTest extends  DriverBase{
	
	HomePage HomeObject ;
	LoginPage loginobject ;
	
	@Test(priority=1,alwaysRun=true)
	public void AddtoCartSucessful() throws InterruptedException {
	HomeObject = new HomePage(driver);
	HomeObject.OpenLoginpage();
	loginobject = new LoginPage(driver);
	loginobject.userLogin("randhirall20@gmail.com", "automation");
	

	}
}
