package com.globant.automation.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowPage {

	private WebDriver driver;
	private By link = By.cssSelector("#content div a");
	
	public MultipleWindowPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickHere() {
		driver.findElement(link).click();
	}
}
