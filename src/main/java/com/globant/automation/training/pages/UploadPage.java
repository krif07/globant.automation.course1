package com.globant.automation.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadPage {
	
	private WebDriver driver;
	private By messageTitle = By.cssSelector("#content div h3");
	private By messageBody = By.id("uploaded-files");
	
	public UploadPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getTitleMessage() {
		return driver.findElement(messageTitle).getText();
	}
	
	public String getBodyMessage() {
		return driver.findElement(messageBody).getText();
	}

}
