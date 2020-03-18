package com.globant.automation.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
	
	private WebDriver driver;
	private By targetInput = By.id("target");
	private By resultMessage = By.id("result");
	
	public KeyPressesPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterText(String text) {
		driver.findElement(targetInput).sendKeys(text);
	}
	
	public void enterPi() {
		enterText(Keys.chord(Keys.ALT, "p") + "=3.14");
	}

	public String getResultMessage() {
		return driver.findElement(resultMessage).getText();
	}
}
