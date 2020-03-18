package com.globant.automation.training.pages;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DinamicLoadingExample1Page {
	
	private WebDriver driver;
	private By startButton = By.cssSelector("#start button");
	private By loadingIndicator = By.id("loading");
	private By finishMessage = By.cssSelector("#finish h4");
	
	public DinamicLoadingExample1Page(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickStartButton() {
		driver.findElement(startButton).click();
		waitWhileElementIsReady(10);
	}
	
	public String getFinishMessage() {
		return driver.findElement(finishMessage).getText();
	}
	
	public void waitWhileElementIsReady(int time) {
		//WebDriverWait wait = new WebDriverWait(driver, time);
		//wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));
		FluentWait<WebDriver> wait = new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(time))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.invisibilityOf(
				driver.findElement(loadingIndicator)));
	}
	
	public WebElement getStartButton() {
		return driver.findElement(startButton);
	}
	
}
