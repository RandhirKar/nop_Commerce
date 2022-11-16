package com.nop_Commerce.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ElementStatusTest {

	@Test()
	public void ElementStatus_Verification() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Browserdriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Register button verification
		boolean isEnable = driver.findElement(By.xpath("//a[contains(@class,'ico-register')]")).isEnabled();
		boolean isDisplayed = driver.findElement(By.xpath("//a[contains(@class,'ico-register')]")).isDisplayed();

		if (isEnable) {
			System.out.println("Register button is Enabled");
		} else {
			System.out.println("Register button is not Enabled");
		}
		if (isDisplayed) {
			System.out.println("Register button is Displayed");
		} else {
			System.out.println("Register button is not Displayed");
		}
		// Login button Verification
		boolean isEnable1 = driver.findElement(By.xpath("//a[contains(@class,'ico-login')]")).isEnabled();
		boolean isDisplayed1 = driver.findElement(By.xpath("//a[contains(@class,'ico-login')]")).isDisplayed();

		if (isEnable1) {
			System.out.println("Login button is Enabled");
		} else {
			System.out.println("Login button is not Enabled");
		}
		if (isDisplayed1) {
			System.out.println("Login button is Displayed");
		} else {
			System.out.println("Login button is not Displayed");
		}
		// Wishlist button Verification
		boolean isEnable2 = driver.findElement(By.xpath("//span[contains(@class,'wishlist-label')]")).isEnabled();
		boolean isDisplayed2 = driver.findElement(By.xpath("//span[contains(@class,'wishlist-label')]")).isDisplayed();

		if (isEnable2) {
			System.out.println("WishList button is Enabled");
		} else {
			System.out.println("WishList button is not Enabled");
		}
		if (isDisplayed2) {
			System.out.println("WishList button is Displayed");
		} else {
			System.out.println("WishList button is not Displayed");
		}
		// Shopping Cart button Verification
		boolean isEnable3 = driver.findElement(By.xpath("//span[contains(@class,'cart-label')]")).isEnabled();
		boolean isDisplayed3 = driver.findElement(By.xpath("//span[contains(@class,'cart-label')]")).isDisplayed();

		if (isEnable3) {
			System.out.println("Shopping cart button is Enabled");
		} else {
			System.out.println("Shopping cart is not Enabled");
		}
		if (isDisplayed3) {
			System.out.println("Shopping cart is Displayed");
		} else {
			System.out.println("Shopping cart is not Displayed");
		}
		Thread.sleep(5000);
		driver.quit();
	}

}
