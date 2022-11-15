package com.nop_Commerce.testcases;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchFunctionTest {

	@Test(priority = 1)
	public void SearchButton_Verification() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Browserdriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Search button verification
		boolean isEnable = driver.findElement(By.xpath("//button[contains(@class,'button-1 search-box-button')]"))
				.isEnabled();
		boolean isDisplayed = driver.findElement(By.xpath("//button[contains(@class,'button-1 search-box-button')]"))
				.isDisplayed();

		if (isEnable) {
			System.out.println("Search button is Enabled");
		} else {
			System.out.println("Search button is not Enabled");
		}
		if (isDisplayed) {
			System.out.println("Search button is Displayed");
		} else {
			System.out.println("Search button is not Displayed");
		}
	}
	@Test(priority = 2)
	public void SearchField_Verification() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Browserdriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Search button verification
		boolean isEnable = driver.findElement(By.xpath("//input[contains(@id,'small-searchterms')]")).isEnabled();
		boolean isDisplayed = driver.findElement(By.xpath("//input[contains(@id,'small-searchterms')]")).isDisplayed();

		if (isEnable) {
			System.out.println("Search Field is Enabled");
		} else {
			System.out.println("Search Field is not Enabled");
		}
		if (isDisplayed) {
			System.out.println("Search Field is Displayed");
		} else {
			System.out.println("Search Field is not Displayed");
		}
	}
	@Test(priority = 3)
	public void SearchFunctionality_Verification() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Browserdriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Search Functionality Verification
		driver.findElement(By.xpath("//input[contains(@id,'small-searchterms')]")).sendKeys("HTC");
		Thread.sleep(3000);
		List<WebElement> list = driver
				.findElements(By.xpath("//*[@id='ui-id-1']//descendant::li//descendant::a//descendant::span"));
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().contains("HTC One Mini Blue")) {
				list.get(i).click();
				break;
			}
		}
	}
}
