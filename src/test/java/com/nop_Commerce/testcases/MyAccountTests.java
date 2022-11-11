package com.nop_Commerce.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.nop_Commerce.Base.BaseClass;
import com.nop_Commerce.Pageobjects.HomePage;
import com.nop_Commerce.Pageobjects.MyAccountPage;
import com.nop_Commerce.Pageobjects.UserRegistrationPage;

public class MyAccountTests extends BaseClass{
		
	HomePage homeObject ; 
	UserRegistrationPage registerObject ;
	MyAccountPage Myaccountobject ;
	String firstname = "Randhir";
	String lastname = "Karn" ; 
	String email ="randhirall21@gmail.com";
	String password =  "automation"; 
	String newpassword = "automationtest";
	String oldpassword = "automation" ;
	
	@Test(priority=1,alwaysRun=true)
	public void userCanRegisterSuccessfully() {
		homeObject = new HomePage(driver); 
		homeObject.openRegistrationPage();
		registerObject = new UserRegistrationPage(driver); 
		registerObject.userRegistration(firstname, lastname, email, password);
		Assert.assertTrue(registerObject.successMessage.getText().contains("Your registration completed"));
		registerObject.openMyAccountPage();
	}
	@Test(priority=2)
	public void registeredUserCanChangePassword ( ) throws InterruptedException {
		Myaccountobject = new MyAccountTests(driver);
		Myaccountobject.openChangePasswordPage();
		Myaccountobject.ChangePassword(oldpassword, newpassword);
		Assert.assertTrue(Myaccountobject.resultLbl.getText().contains("Password was changed"));
		Thread.sleep(3000);
	}
}
