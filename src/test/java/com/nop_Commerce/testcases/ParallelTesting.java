package com.nop_Commerce.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.nop_Commerce.Pageobjects.HomePage;
import com.nop_Commerce.Pageobjects.UserRegistrationPage;

public class ParallelTesting extends DriverBase {

	HomePage homePage;
	UserRegistrationPage registrationPage;

	@Test()
	public void userRegistration_ParallelTesting_1() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.openRegistrationPage();
		registrationPage = new UserRegistrationPage(driver);
		registrationPage.userRegistration("Seva", "Dev", "sevadev21@gmail.com", "sevadev1");
		// Verification of Validation Message
		WebElement ValidationMsg = driver.findElement(By.xpath("//*[@class='result']"));
		// Validation the Actual and Expected text
		String expectedText = "Your registration completed";
		String actualText = ValidationMsg.getText();
		// Comparing the Text
		if (actualText.equals(expectedText)) {
			System.out.println("Your registration completed");

		} else {
			System.out.println("Registration failed");
		}
		driver.quit();
	}
	@Test()
	public void userRegistration_ParallelTesting_2()throws InterruptedException  {
		homePage = new HomePage(driver);
		homePage.openRegistrationPage();
		registrationPage = new UserRegistrationPage(driver);
		registrationPage.userRegistration("Seva", "Dev", "sevadev22@gmail.com", "sevadev11");
		// Verification of Validation Message
		WebElement ValidationMsg = driver.findElement(By.xpath("//*[@class='result']"));
		// Validation the Actual and Expected text
		String expectedText = "Your registration completed";
		String actualText = ValidationMsg.getText();
		// Comparing the Text
		if (actualText.equals(expectedText)) {
			System.out.println("Your registration completed");

		} else {
			System.out.println("Registration failed");
		}
		driver.quit();
	}
	@Test()
	public void userRegistration_ParallelTesting_3()throws InterruptedException  {
		homePage = new HomePage(driver);
		homePage.openRegistrationPage();
		registrationPage = new UserRegistrationPage(driver);
		registrationPage.userRegistration("Seva", "Dev", "sevadev23@gmail.com", "sevadev12");
		// Verification of Validation Message
		WebElement ValidationMsg = driver.findElement(By.xpath("//*[@class='result']"));
		// Validation the Actual and Expected text
		String expectedText = "Your registration completed";
		String actualText = ValidationMsg.getText();
		// Comparing the Text
		if (actualText.equals(expectedText)) {
			System.out.println("Your registration completed");

		} else {
			System.out.println("Registration failed");
		}
		driver.quit();
	}
	@Test()
	public void userRegistration_ParallelTesting_4() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.openRegistrationPage();
		registrationPage = new UserRegistrationPage(driver);
		registrationPage.userRegistration("Seva", "Dev", "sevadev24@gmail.com", "sevadev13");
		// Verification of Validation Message
		WebElement ValidationMsg = driver.findElement(By.xpath("//*[@class='result']"));
		// Validation the Actual and Expected text
		String expectedText = "Your registration completed";
		String actualText = ValidationMsg.getText();
		// Comparing the Text
		if (actualText.equals(expectedText)) {
			System.out.println("Your registration completed");

		} else {
			System.out.println("Registration failed");
		}
		driver.quit();
	}
	@Test()
	public void userRegistration_ParallelTesting_5()throws InterruptedException  {
		homePage = new HomePage(driver);
		homePage.openRegistrationPage();
		registrationPage = new UserRegistrationPage(driver);
		registrationPage.userRegistration("Seva", "Dev", "sevadev25@gmail.com", "sevadev14");
		// Verification of Validation Message
		WebElement ValidationMsg = driver.findElement(By.xpath("//*[@class='result']"));
		// Validation the Actual and Expected text
		String expectedText = "Your registration completed";
		String actualText = ValidationMsg.getText();
		// Comparing the Text
		if (actualText.equals(expectedText)) {
			System.out.println("Your registration completed");

		} else {
			System.out.println("Registration failed");
		}
		driver.quit();
	}
	@Test()
	public void userRegistration_ParallelTesting_6()throws InterruptedException  {
		homePage = new HomePage(driver);
		homePage.openRegistrationPage();
		registrationPage = new UserRegistrationPage(driver);
		registrationPage.userRegistration("Seva", "Dev", "sevadev26@gmail.com", "sevadev15");
		// Verification of Validation Message
		WebElement ValidationMsg = driver.findElement(By.xpath("//*[@class='result']"));
		// Validation the Actual and Expected text
		String expectedText = "Your registration completed";
		String actualText = ValidationMsg.getText();
		// Comparing the Text
		if (actualText.equals(expectedText)) {
			System.out.println("Your registration completed");

		} else {
			System.out.println("Registration failed");
		}
		driver.quit();
	}
	@Test()
	public void userRegistration_ParallelTesting_7() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.openRegistrationPage();
		registrationPage = new UserRegistrationPage(driver);
		registrationPage.userRegistration("Seva", "Dev", "sevadev27@gmail.com", "sevadev16");
		// Verification of Validation Message
		WebElement ValidationMsg = driver.findElement(By.xpath("//*[@class='result']"));
		// Validation the Actual and Expected text
		String expectedText = "Your registration completed";
		String actualText = ValidationMsg.getText();
		// Comparing the Text
		if (actualText.equals(expectedText)) {
			System.out.println("Your registration completed");

		} else {
			System.out.println("Registration failed");
		}
		driver.quit();
	}
	@Test()
	public void userRegistration_ParallelTesting_8()throws InterruptedException  {
		homePage = new HomePage(driver);
		homePage.openRegistrationPage();
		registrationPage = new UserRegistrationPage(driver);
		registrationPage.userRegistration("Seva", "Dev", "sevadev28@gmail.com", "sevadev17");
		// Verification of Validation Message
		WebElement ValidationMsg = driver.findElement(By.xpath("//*[@class='result']"));
		// Validation the Actual and Expected text
		String expectedText = "Your registration completed";
		String actualText = ValidationMsg.getText();
		// Comparing the Text
		if (actualText.equals(expectedText)) {
			System.out.println("Your registration completed");

		} else {
			System.out.println("Registration failed");
		}
		driver.quit();
	}
	@Test()
	public void userRegistration_ParallelTesting_9()throws InterruptedException  {
		homePage = new HomePage(driver);
		homePage.openRegistrationPage();
		registrationPage = new UserRegistrationPage(driver);
		registrationPage.userRegistration("Seva", "Dev", "sevadev29@gmail.com", "sevadev18");
		// Verification of Validation Message
		WebElement ValidationMsg = driver.findElement(By.xpath("//*[@class='result']"));
		// Validation the Actual and Expected text
		String expectedText = "Your registration completed";
		String actualText = ValidationMsg.getText();
		// Comparing the Text
		if (actualText.equals(expectedText)) {
			System.out.println("Your registration completed");

		} else {
			System.out.println("Registration failed");
		}
		driver.quit();
	}
	@Test()
	public void userRegistration_ParallelTesting_10()throws InterruptedException  {
		homePage = new HomePage(driver);
		homePage.openRegistrationPage();
		registrationPage = new UserRegistrationPage(driver);
		registrationPage.userRegistration("Seva", "Dev", "sevadev30@gmail.com", "sevadev19");
		// Verification of Validation Message
		WebElement ValidationMsg = driver.findElement(By.xpath("//*[@class='result']"));
		// Validation the Actual and Expected text
		String expectedText = "Your registration completed";
		String actualText = ValidationMsg.getText();
		// Comparing the Text
		if (actualText.equals(expectedText)) {
			System.out.println("Your registration completed");

		} else {
			System.out.println("Registration failed");
		}
		driver.quit();
	}
}
