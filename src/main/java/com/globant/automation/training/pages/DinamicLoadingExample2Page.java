package com.globant.automation.training.pages;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class DinamicLoadingExample2Page {

	private WebDriver driver;
	private By startButton = By.cssSelector("#start button");
	private By finishMessage = By.id("finish");
	
	public DinamicLoadingExample2Page(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickStartButton() {
		driver.findElement(startButton).click();
		
		FluentWait<WebDriver> wait = new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring(NoSuchElementException.class);
		
		wait.until(
				ExpectedConditions.presenceOfElementLocated(
						finishMessage));
	}
	
	public String getFinishMessage() {
		return driver.findElement(finishMessage).getText();
	}
}
