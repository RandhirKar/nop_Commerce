package com.nop_Commerce.testcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import com.nop_Commerce.utilities.Helper;

public class DriverBase {
	WebDriver driver;

	protected static ThreadLocal<ChromeDriver> driver1=new ThreadLocal<>();
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Browserdriver\\chromedriver.exe");
		driver1.set(new ChromeDriver());
	}
	
	public WebDriver getDriver() {
		return driver1.get();
	}
	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}


	@BeforeSuite
	@Parameters({ "browser" })
	public void startDriver(@Optional("chrome") String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Browserdriver\\chromedriver.exe");
			driver = new ChromeDriver();
			// DesiredCapabilities cap = DesiredCapabilities.chrome();
			// cap.setCapability("applicationCacheEnabled", false);
			// driver = new ChromeDriver(cap);
		}

		else if (browserName.equalsIgnoreCase("headless")) {
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setJavascriptEnabled(true);
			caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
					System.getProperty("user.dir") + "/drivers/phantomjs.exe");
			String[] phantomjsArg = { "--web-security=no", "--ignore-ssl-error=yes" };
			caps.setCapability(PhantomJSDriverService.PHANTOMJS_GHOSTDRIVER_CLI_ARGS, phantomjsArg);
			driver = new PhantomJSDriver(caps);
		} else if (browserName.equalsIgnoreCase("chrome-headless")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Browserdriver\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			options.addArguments("--windows-size=1920,1080");
			driver = new ChromeDriver(options);
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "/drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		// driver.manage().deleteAllCookies();
	}

	@AfterMethod
	public void screenShotOnFailure(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			System.out.println("failed!");
			System.out.println("TakeScreenshot");
			Helper.captureScreenShot(driver, result.getName());
		}
	}

	@AfterSuite
	public void stopDriver() {
		if (driver != null) {
			driver.quit();
		}

	}


