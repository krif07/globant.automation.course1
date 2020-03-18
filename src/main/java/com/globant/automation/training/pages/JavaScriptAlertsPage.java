package com.globant.automation.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {

	private WebDriver driver;
	private By triggerAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
	private By triggerConfirmButton = By.xpath(".//button[text()='Click for JS Confirm']");
	private By triggerPromptButton = By.xpath(".//button[text()='Click for JS Prompt']"); 
	private By resultText = By.id("result");
	
	public JavaScriptAlertsPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void triggerAlert() {
		driver.findElement(triggerAlertButton).click();
	}
	
	public void triggerConfirm() {
		driver.findElement(triggerConfirmButton).click();
	}
	
	public void triggerPrompt() {
		driver.findElement(triggerPromptButton).click();
	}
	
	public void alertClickToAccept() {
		driver.switchTo().alert().accept();
	}
	
	public void alertClickToCancel() {
		driver.switchTo().alert().dismiss();
	}
	
	public String getAlertText() {
		return driver.switchTo().alert().getText();
	}
	
	public void setAlertText(String text) {
		driver.switchTo().alert().sendKeys(text);
	}
	
	public String getResult() {
		return driver.findElement(resultText).getText();
	}
}
