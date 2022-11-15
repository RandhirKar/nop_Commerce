package com.nop_Commerce.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest {

	@Test(priority = 1)
	public void VerifyAddToCart_Functionality() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Browserdriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Click on Sign in
		driver.findElement(By.xpath("//a[contains (@class,'ico-login')]")).click();
		// Login
		driver.findElement(By.id("Email")).sendKeys("randhirall20@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("automation");
		driver.findElement(By.xpath("//button[contains(@class,'button-1 login-button')]")).click();
		// Add to Cart
		driver.findElement(By.xpath("//a[contains (text (),'Build')]")).click();
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[contains(@id,'product_attribute_1')]")).click();
		driver.findElement(By.xpath("//option[contains(@data-attr-value,'1')]")).click();
		driver.findElement(By.xpath("//select[contains(@id,'product_attribute_2')]")).click();
		driver.findElement(By.xpath("//option[contains(@data-attr-value,'5')]")).click();
		driver.findElement(By.xpath("//input[contains (@id,'product_attribute_3_7')]")).click();
		driver.findElement(By.xpath("//input[contains (@id,'product_attribute_4_9')]")).click();
		driver.findElement(By.id("add-to-cart-button-1")).click();
		// Get Text
		// This will capture error message
		String actual_msg = driver.findElement(By.className("content")).getText();
		// Store message in variable
		String expect = "The product has been added to your shopping cart";
		// Verify message
		Assert.assertEquals(actual_msg, expect);
		driver.quit();
	}

	@Test(priority = 2)
	public void VerifyAddToCart() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Browserdriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Click on Sign in
		driver.findElement(By.xpath("//a[contains (@class,'ico-login')]")).click();
		// Login
		driver.findElement(By.id("Email")).sendKeys("randhirall20@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("automation");
		driver.findElement(By.xpath("//button[contains(@class,'button-1 login-button')]")).click();
		// Add to Cart
		driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Fahrenheit 451 by Ray Bradbury')]")).click();
		driver.findElement(By.id("product_enteredQuantity_37")).sendKeys(String.valueOf(0));
		driver.findElement(By.id("add-to-cart-button-37")).click();
		// Get Text
		String actual_msg = driver.findElement(By.className("content")).getText();
		// Store message in variable
		String expect = "The product has been added to your shopping cart";
		// Verify message
		Assert.assertEquals(actual_msg, expect);
	}

	@Test(priority = 3)
	public void VerifyshoppingCart() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Browserdriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Click on Sign in
		driver.findElement(By.xpath("//a[contains (@class,'ico-login')]")).click();
		// Login
		driver.findElement(By.id("Email")).sendKeys("randhirall20@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("automation");
		driver.findElement(By.xpath("//button[contains(@class,'button-1 login-button')]")).click();
		// shopping Cart
		driver.findElement(By.xpath("//span[contains(@class,'cart-label')]")).click();
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();
		// Billing Details
		driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(@class,'button-1 shipping-method-next-step-button')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(@class,'button-1 payment-method-next-step-button')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(@class,'button-1 payment-info-next-step-button')]")).click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//button[contains(@class,'button-1 confirm-order-next-step-button')]")).click();
		// Get Text
		String actual_msg = driver.findElement(By.xpath("//div[contains(@class,'title')]/strong")).getText();
		// Store message in variable
		String expect = "Your order has been successfully processed!";
		// Verify message
		Assert.assertEquals(actual_msg, expect);
	}
}
