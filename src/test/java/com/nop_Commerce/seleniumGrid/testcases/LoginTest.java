package com.nop_Commerce.seleniumGrid.testcases;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class LoginTest {

	@Test
	public void test1() {
		try {
			DesiredCapabilities desiredCapabilites = new DesiredCapabilities();
			desiredCapabilites.setBrowserName("chrome");
			desiredCapabilites.setPlatform(Platform.WINDOWS);

			WebDriver driver = new RemoteWebDriver(new URL(" http://192.168.1.79:4444/wd/hub"), desiredCapabilites);
			driver.manage().window().maximize();
			driver.get("https://demo.nopcommerce.com/");
			System.out.println("Title of the Page is - " + driver.getTitle());
			driver.quit();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
