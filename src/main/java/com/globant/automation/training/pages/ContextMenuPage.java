package com.globant.automation.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
	
	private WebDriver driver;
	private By hotSpotTrigger = By.id("hot-spot");
	
	public ContextMenuPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void triggerRightClick() {
		Actions actions = new Actions(driver);
		WebElement hotSpot = driver.findElement(hotSpotTrigger);
		actions.contextClick(hotSpot).perform();
	}

	public void alertClickToAccept() {
		driver.switchTo().alert().accept();
	}
	
	public String getAlertMessage() {
		return driver.switchTo().alert().getText();
	}
}
