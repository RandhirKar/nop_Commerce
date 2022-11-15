package com.nop_Commerce.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.nop_Commerce.Base.BaseClass;
import com.nop_Commerce.Pageobjects.HomePage;
import com.nop_Commerce.Pageobjects.MyAccountPage;
import com.nop_Commerce.Pageobjects.UserRegistrationPage;

public class MyAccountTests extends DriverBase{
		
	HomePage homepage ; 
	UserRegistrationPage registrationpage ;
	MyAccountPage Myaccountpage ;
	String firstname = "Randhir";
	String lastname = "Karn" ; 
	String email ="randhirall21@gmail.com";
	String password =  "automation"; 
	String newpassword = "automationtest";
	String oldpassword = "automation" ;
	
	@Test(priority=1,alwaysRun=true)
	public void userCanRegisterSuccessfully() {
		homepage = new HomePage(driver); 
		homepage.openRegistrationPage();
		registrationpage = new UserRegistrationPage(driver); 
		registrationpage.userRegistration(firstname, lastname, email, password);
		Assert.assertTrue(registrationpage.successMessage.getText().contains("Your registration completed"));
		registrationpage.openMyAccountPage();
	}
	@Test(priority=2)
	public void registeredUserCanChangePassword ( ) throws InterruptedException {
		Myaccountpage = new MyAccountTests(driver);
		Myaccountpage.openChangePasswordPage();
		Myaccountpage.ChangePassword(oldpassword, newpassword);
		Assert.assertTrue(Myaccountpage.resultLbl.getText().contains("Password was changed"));
		Thread.sleep(3000);
	}
}
