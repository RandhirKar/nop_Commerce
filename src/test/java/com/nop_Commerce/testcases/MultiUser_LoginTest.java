package com.nop_Commerce.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.nop_Commerce.Pageobjects.HomePage;
import com.nop_Commerce.Pageobjects.LoginPage;

public class MultiUser_LoginTest extends DriverBase {
	HomePage HomePage;
	LoginPage loginPage ; 
	
	@Test(dataProvider = "multiuser_Test")
	public void MultiUser(String email, String password){
		HomePage = new HomePage(driver);
		HomePage.OpenLoginpage();
		loginPage = new LoginPage(driver);
		loginPage.userLogin(email, password);
	}
	
	@DataProvider(name = "multiuser_Test")
	public Object [][] DataSet() {
		return new Object[][] {
			
			{"sevadev01@gmail.com","sevadev11"},
			{"sevadev02@gmail.com","sevadev11"},
			{"sevadev03@gmail.com","sevadev11"},
			{"sevadev04@gmail.com","sevadev11"},
			{"sevadev05@gmail.com","sevadev11"},
		};
	}

}
