package com.nop_Commerce.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OptionsListTest {

	@Test(priority = 1)
	public void ComputerOption_Verification() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Browserdriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Computer Option Verification
		boolean isEnable = driver.findElement(By.xpath("//a[contains(text(),'Computers')]")).isEnabled();
		boolean isDisplayed = driver.findElement(By.xpath("//a[contains(text(),'Computers')]")).isDisplayed();

		if (isEnable) {
			System.out.println("Computer option is Enabled");
		} else {
			System.out.println("Computer option is not Enabled");
		}
		if (isDisplayed) {
			System.out.println("Computer option is Displayed");
		} else {
			System.out.println("Computer option is not Displayed");
		}

		// Hovering into Computer Option
		WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'Computers')]"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();

		// Verifying Desktop Option inside computer
		boolean isEnable1 = driver
				.findElement(
						By.xpath("//ul[contains(@class,'sublist first-level')]//li//a[contains(text(),'Desktops')]"))
				.isEnabled();
		boolean isDisplayed1 = driver
				.findElement(
						By.xpath("//ul[contains(@class,'sublist first-level')]//li//a[contains(text(),'Desktops')]"))
				.isDisplayed();

		if (isEnable1) {
			System.out.println("Desktops option is Enabled");
		} else {
			System.out.println("Desktops option is not Enabled");
		}
		if (isDisplayed1) {
			System.out.println("Desktops option is Displayed");
		} else {
			System.out.println("Desktops option is not Displayed");
		}

		// Verifying Notebooks Option inside computer
		boolean isEnable2 = driver
				.findElement(
						By.xpath("//ul[contains(@class,'sublist first-level')]//li//a[contains(text(),'Notebooks')]"))
				.isEnabled();
		boolean isDisplayed2 = driver
				.findElement(
						By.xpath("//ul[contains(@class,'sublist first-level')]//li//a[contains(text(),'Notebooks')]"))
				.isDisplayed();

		if (isEnable2) {
			System.out.println("Notebooks option is Enabled");
		} else {
			System.out.println("Notebooks option is not Enabled");
		}
		if (isDisplayed2) {
			System.out.println("Notebooks option is Displayed");
		} else {
			System.out.println("Notebooks option is not Displayed");
		}

		// Verifying SoftWare Option inside computer
		boolean isEnable3 = driver
				.findElement(
						By.xpath("//ul[contains(@class,'sublist first-level')]//li//a[contains(text(),'Software')]"))
				.isEnabled();
		boolean isDisplayed3 = driver
				.findElement(
						By.xpath("//ul[contains(@class,'sublist first-level')]//li//a[contains(text(),'Software')]"))
				.isDisplayed();

		if (isEnable3) {
			System.out.println("Software option is Enabled");
		} else {
			System.out.println("Software option is not Enabled");
		}
		if (isDisplayed3) {
			System.out.println("Software option is Displayed");
		} else {
			System.out.println("Software option is not Displayed");
		}
	}
	@Test(priority = 2)
	public void ElectronicsOption_Verification() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Browserdriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Electronics Option Verification
		boolean isEnable = driver.findElement(By.xpath("//a[contains(text(),'Electronics')]")).isEnabled();
		boolean isDisplayed = driver.findElement(By.xpath("//a[contains(text(),'Electronics')]")).isDisplayed();

		if (isEnable) {
			System.out.println("Electronics option is Enabled");
		} else {
			System.out.println("Electronics option is not Enabled");
		}
		if (isDisplayed) {
			System.out.println("Electronics option is Displayed");
		} else {
			System.out.println("Electronics option is not Displayed");
		}

		// Hovering into Electronics Option
		WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'Electronics')]"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();

		// Verifying Camera & photo Option inside Electronics
		boolean isEnable1 = driver
				.findElement(
						By.xpath("//ul[contains(@class,'sublist first-level')]//li//a[contains(text(),'Camera & photo ')]"))
				.isEnabled();
		boolean isDisplayed1 = driver
				.findElement(
						By.xpath("//ul[contains(@class,'sublist first-level')]//li//a[contains(text(),'Camera & photo')]"))
				.isDisplayed();

		if (isEnable1) {
			System.out.println("Camera & photo option is Enabled");
		} else {
			System.out.println("Camera & photo option is not Enabled");
		}
		if (isDisplayed1) {
			System.out.println("Camera & photo option is Displayed");
		} else {
			System.out.println("Camera & photo option is not Displayed");
		}

		// Verifying Cell Phones Option inside Electronics
		boolean isEnable2 = driver
				.findElement(
						By.xpath("//ul[contains(@class,'sublist first-level')]//li//a[contains(text(),'Cell phones')]"))
				.isEnabled();
		boolean isDisplayed2 = driver
				.findElement(
						By.xpath("//ul[contains(@class,'sublist first-level')]//li//a[contains(text(),'Cell phones')]"))
				.isDisplayed();

		if (isEnable2) {
			System.out.println("Cell Phones option is Enabled");
		} else {
			System.out.println("Cell Phones option is not Enabled");
		}
		if (isDisplayed2) {
			System.out.println("Cell Phones option is Displayed");
		} else {
			System.out.println("Cell Phones option is not Displayed");
		}

		// Verifying Others Option inside Electronics
		boolean isEnable3 = driver
				.findElement(
						By.xpath("//ul[contains(@class,'sublist first-level')]//li//a[contains(text(),'Others')]"))
				.isEnabled();
		boolean isDisplayed3 = driver
				.findElement(
						By.xpath("//ul[contains(@class,'sublist first-level')]//li//a[contains(text(),'Others')]"))
				.isDisplayed();

		if (isEnable3) {
			System.out.println("Others option is Enabled");
		} else {
			System.out.println("Others option is not Enabled");
		}
		if (isDisplayed3) {
			System.out.println("Others option is Displayed");
		} else {
			System.out.println("Others option is not Displayed");
		}
	}
	@Test(priority = 3)
	public void ApparelOption_Verification() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Browserdriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Apparel Option Verification
		boolean isEnable = driver.findElement(By.xpath("//a[contains(text(),'Apparel')]")).isEnabled();
		boolean isDisplayed = driver.findElement(By.xpath("//a[contains(text(),'Apparel')]")).isDisplayed();

		if (isEnable) {
			System.out.println("Apparel option is Enabled");
		} else {
			System.out.println("Apparel option is not Enabled");
		}
		if (isDisplayed) {
			System.out.println("Apparel option is Displayed");
		} else {
			System.out.println("Apparel option is not Displayed");
		}

		// Hovering into Apparel Option
		WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'Apparel')]"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();

		// Verifying Shoes Option inside Electronics
		boolean isEnable1 = driver
				.findElement(
						By.xpath("//ul[contains(@class,'sublist first-level')]//li//a[contains(text(),'Shoes')]"))
				.isEnabled();
		boolean isDisplayed1 = driver
				.findElement(
						By.xpath("//ul[contains(@class,'sublist first-level')]//li//a[contains(text(),'Shoes')]"))
				.isDisplayed();

		if (isEnable1) {
			System.out.println("Shoes option is Enabled");
		} else {
			System.out.println("Shoes option is not Enabled");
		}
		if (isDisplayed1) {
			System.out.println("Shoes option is Displayed");
		} else {
			System.out.println("Shoes option is not Displayed");
		}

		// Verifying Clothing Option inside Electronics
		boolean isEnable2 = driver
				.findElement(
						By.xpath("//ul[contains(@class,'sublist first-level')]//li//a[contains(text(),'Clothing')]"))
				.isEnabled();
		boolean isDisplayed2 = driver
				.findElement(
						By.xpath("//ul[contains(@class,'sublist first-level')]//li//a[contains(text(),'Clothing')]"))
				.isDisplayed();

		if (isEnable2) {
			System.out.println("Clothing option is Enabled");
		} else {
			System.out.println("Clothing option is not Enabled");
		}
		if (isDisplayed2) {
			System.out.println("Clothing option is Displayed");
		} else {
			System.out.println("Clothing option is not Displayed");
		}

		// Verifying Accessories Option inside Electronics
		boolean isEnable3 = driver
				.findElement(
						By.xpath("//ul[contains(@class,'sublist first-level')]//li//a[contains(text(),'Accessories')]"))
				.isEnabled();
		boolean isDisplayed3 = driver
				.findElement(
						By.xpath("//ul[contains(@class,'sublist first-level')]//li//a[contains(text(),'Accessories')]"))
				.isDisplayed();

		if (isEnable3) {
			System.out.println("Accessories option is Enabled");
		} else {
			System.out.println("Accessories option is not Enabled");
		}
		if (isDisplayed3) {
			System.out.println("Accessories option is Displayed");
		} else {
			System.out.println("Accessories option is not Displayed");
		}
	}
	@Test(priority = 4)
	public void DigitalDownloadOption_Verification() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Browserdriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Digital Downloads Option Verification
		boolean isEnable = driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).isEnabled();
		boolean isDisplayed = driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).isDisplayed();

		if (isEnable) {
			System.out.println("Digital Downloads option is Enabled");
		} else {
			System.out.println("Digital Downloads option is not Enabled");
		}
		if (isDisplayed) {
			System.out.println("Digital Downloads option is Displayed");
		} else {
			System.out.println("Digital Downloads option is not Displayed");
		}
	}
	@Test(priority = 5)
	public void BooksOption_Verification() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Browserdriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Books Option Verification
		boolean isEnable = driver.findElement(By.xpath("//a[contains(text(),'Books')]")).isEnabled();
		boolean isDisplayed = driver.findElement(By.xpath("//a[contains(text(),'Books')]")).isDisplayed();

		if (isEnable) {
			System.out.println("Books option is Enabled");
		} else {
			System.out.println("Books option is not Enabled");
		}
		if (isDisplayed) {
			System.out.println("Books option is Displayed");
		} else {
			System.out.println("Books option is not Displayed");
		}
	}
	@Test(priority = 6)
	public void JewelryOption_Verification() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Browserdriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Jewelry Option Verification
		boolean isEnable = driver.findElement(By.xpath("//a[contains(text(),'Jewelry')]")).isEnabled();
		boolean isDisplayed = driver.findElement(By.xpath("//a[contains(text(),'Jewelry')]")).isDisplayed();

		if (isEnable) {
			System.out.println("Jewelry option is Enabled");
		} else {
			System.out.println("Jewelry option is not Enabled");
		}
		if (isDisplayed) {
			System.out.println("Jewelry option is Displayed");
		} else {
			System.out.println("Jewelry option is not Displayed");
		}
	}
	
	@Test(priority = 7)
	public void GiftCardsOption_Verification() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Browserdriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Jewelry Option Verification
		boolean isEnable = driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).isEnabled();
		boolean isDisplayed = driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).isDisplayed();

		if (isEnable) {
			System.out.println("Gift Cards option is Enabled");
		} else {
			System.out.println("Gift Cards option is not Enabled");
		}
		if (isDisplayed) {
			System.out.println("Gift Cards option is Displayed");
		} else {
			System.out.println("Gift Cards option is not Displayed");
		}
	}
}
