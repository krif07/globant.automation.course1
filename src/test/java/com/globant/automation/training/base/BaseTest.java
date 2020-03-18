package com.globant.automation.training.base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.globant.automation.training.pages.HomePage;
import com.globant.automation.training.utils.EventReporter;
import com.globant.automation.training.utils.WindowManager;
import com.google.common.io.Files;

public class BaseTest {
	
	private EventFiringWebDriver driver;
	protected HomePage homePage;
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver = new EventFiringWebDriver(new ChromeDriver(getChromeOptions()));
		driver.register(new EventReporter());
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//Wait 10 seconds to load every element
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		goHome();
		setCookie();
	}
	
	@BeforeMethod
	public void goHome() {
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		homePage = new HomePage(driver);
	}
	
	@AfterClass
	public void tearDown() {
		//driver.quit();
	}
	
	@AfterMethod
	public void recordeFailure(ITestResult result) {
		
		if(ITestResult.FAILURE == result.getStatus()) {
			var camera = (TakesScreenshot)driver;
			File screenshot = camera.getScreenshotAs(OutputType.FILE);
			
			try {
				Files.move(screenshot, new File("resources/screenshots/" + result.getName() + ".png"));
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public WindowManager getWindowManager() {
		return new WindowManager(driver);
	}

	private ChromeOptions getChromeOptions() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		//options.setHeadless(true);
		return options;
	};
	
	private void setCookie() {
		Cookie cookie = new Cookie.Builder("tau", "123")
				.domain("the-internet.herokuapp.com")
				.build();
		driver.manage().addCookie(cookie);
	}
}
