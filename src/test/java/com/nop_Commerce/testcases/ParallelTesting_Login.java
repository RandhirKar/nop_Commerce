package com.nop_Commerce.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.nop_Commerce.Pageobjects.LoginPage;

public class ParallelTesting_Login {
	LoginPage loginPage;

	@Test
	public void LoginTest_1() throws Throwable {
		System.out.println("Test - 1 Completed | Thread id is " + Thread.currentThread().getId());	
		System.setProperty("webdriver.chrome.driver", "C:\\Browserdriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.xpath("//a[contains(@class,'ico-login')]")).click();
		loginPage = new LoginPage(driver);
		loginPage.userLogin("sevadev01@gmail.com", "sevadev11");
		Assert.assertTrue(loginPage.successloginAssertion.getText().contains("Welcome to our store"));
		driver.quit();
	}
	@Test
	public void LoginTest_2() throws Throwable {
		System.out.println("Test - 2 Completed | Thread id is " + Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "C:\\Browserdriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.xpath("//a[contains(@class,'ico-login')]")).click();
		loginPage = new LoginPage(driver);
		loginPage.userLogin("sevadev02@gmail.com", "sevadev11");
		Assert.assertTrue(loginPage.successloginAssertion.getText().contains("Welcome to our store"));
		driver.quit();
	}
	@Test
	public void LoginTest_3() throws Throwable {
		System.out.println("Test - 3 Completed | Thread id is " + Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "C:\\Browserdriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.xpath("//a[contains(@class,'ico-login')]")).click();
		loginPage = new LoginPage(driver);
		loginPage.userLogin("sevadev03@gmail.com", "sevadev11");
		Assert.assertTrue(loginPage.successloginAssertion.getText().contains("Welcome to our store"));
		driver.quit();
	}
	@Test
	public void LoginTest_4() throws Throwable {
		System.out.println("Test - 4 Completed | Thread id is " + Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "C:\\Browserdriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.xpath("//a[contains(@class,'ico-login')]")).click();
		loginPage = new LoginPage(driver);
		loginPage.userLogin("sevadev04@gmail.com", "sevadev11");
		Assert.assertTrue(loginPage.successloginAssertion.getText().contains("Welcome to our store"));
		driver.quit();
	}
	@Test
	public void LoginTest_5() throws Throwable {
		System.out.println("Test - 5 Completed | Thread id is " + Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "C:\\Browserdriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.xpath("//a[contains(@class,'ico-login')]")).click();
		loginPage = new LoginPage(driver);
		loginPage.userLogin("sevadev05@gmail.com", "sevadev11");
		Assert.assertTrue(loginPage.successloginAssertion.getText().contains("Welcome to our store"));
		driver.quit();
	}

}
