package com.nop_Commerce.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.nop_Commerce.Pageobjects.HomePage;
import com.nop_Commerce.Pageobjects.UserRegistrationPage;

public class ParallelTesting_Registration  {
	UserRegistrationPage registrationPage;

	@Test()
	public void userRegistration_ParallelTesting_1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Browserdriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.xpath("//a[contains(@class,'ico-register')]")).click();
		registrationPage = new UserRegistrationPage(driver);
		registrationPage.userRegistration("Seva", "Dev", "sevadev01@gmail.com", "sevadev11");
		// Verification of Validation Message
		WebElement ValidationMsg = driver.findElement(By.xpath("//div[contains(text(), 'Your registration completed')]"));
		// Validation the Actual and Expected text
		String expectedText = "Your registration completed";
		String actualText = ValidationMsg.getText();
		// Comparing the Text
		if (actualText.equals(expectedText)) {
			System.out.println("Your registration completed| Thread Id is -"+ Thread.currentThread().getId());

		} else {
			System.out.println("Registration failed");
		}
		driver.quit();
	}
	@Test()
	public void userRegistration_ParallelTesting_2()throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Browserdriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.xpath("//a[contains(@class,'ico-register')]")).click();
		registrationPage = new UserRegistrationPage(driver);
		registrationPage.userRegistration("Seva", "Dev", "sevadev02@gmail.com", "sevadev11");
		// Verification of Validation Message
		WebElement ValidationMsg = driver.findElement(By.xpath("//div[contains(text(), 'Your registration completed')]"));
		// Validation the Actual and Expected text
		String expectedText = "Your registration completed";
		String actualText = ValidationMsg.getText();
		// Comparing the Text
		if (actualText.equals(expectedText)) {
			System.out.println("Your registration completed | Thread Id is -"+ Thread.currentThread().getId());
		} else {
			System.out.println("Registration failed");
		}
		driver.quit();
	}
	@Test()
	public void userRegistration_ParallelTesting_3()throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Browserdriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.xpath("//a[contains(@class,'ico-register')]")).click();
		registrationPage = new UserRegistrationPage(driver);
		registrationPage.userRegistration("Seva", "Dev", "sevadev03@gmail.com", "sevadev12");
		// Verification of Validation Message
		WebElement ValidationMsg = driver.findElement(By.xpath("//div[contains(text(), 'Your registration completed')]"));
		// Validation the Actual and Expected text
		String expectedText = "Your registration completed";
		String actualText = ValidationMsg.getText();
		// Comparing the Text
		if (actualText.equals(expectedText)) {
			System.out.println("Your registration completed | Thread Id is -"+ Thread.currentThread().getId());

		} else {
			System.out.println("Registration failed");
		}
		driver.quit();
	}
	@Test()
	public void userRegistration_ParallelTesting_4() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Browserdriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.xpath("//a[contains(@class,'ico-register')]")).click();
		registrationPage = new UserRegistrationPage(driver);
		registrationPage.userRegistration("Seva", "Dev", "sevadev04@gmail.com", "sevadev13");
		// Verification of Validation Message
		WebElement ValidationMsg = driver.findElement(By.xpath("//div[contains(text(), 'Your registration completed')]"));
		// Validation the Actual and Expected text
		String expectedText = "Your registration completed";
		String actualText = ValidationMsg.getText();
		// Comparing the Text
		if (actualText.equals(expectedText)) {
			System.out.println("Your registration completed | Thread Id is -"+ Thread.currentThread().getId());
		} else {
			System.out.println("Registration failed");
		}
		driver.quit();
	}
	@Test()
	public void userRegistration_ParallelTesting_5() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Browserdriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.xpath("//a[contains(@class,'ico-register')]")).click();
		registrationPage = new UserRegistrationPage(driver);
		registrationPage.userRegistration("Seva", "Dev", "sevadev05@gmail.com", "sevadev13");
		// Verification of Validation Message
		WebElement ValidationMsg = driver.findElement(By.xpath("//div[contains(text(), 'Your registration completed')]"));
		// Validation the Actual and Expected text
		String expectedText = "Your registration completed";
		String actualText = ValidationMsg.getText();
		// Comparing the Text
		if (actualText.equals(expectedText)) {
			System.out.println("Your registration completed | Thread Id is -"+ Thread.currentThread().getId());
		} else {
			System.out.println("Registration failed");
		}
		driver.quit();
	}
}	
