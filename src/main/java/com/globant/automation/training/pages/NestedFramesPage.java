package com.globant.automation.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
	
	private WebDriver driver;
	private String topFrameId = "frame-top";
	private String leftFrameId = "frame-left";
	private String bottomFrameId = "frame-bottom";
	private By bodyElement = By.tagName("body");
	
	public NestedFramesPage(WebDriver driver){
		this.driver = driver;
	}
	
	public String getTextFromLeftFrame() {
		driver.switchTo().frame(topFrameId);
		driver.switchTo().frame(leftFrameId);
		String text = driver.findElement(bodyElement).getText();
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		return text;
	}
	
	public String getTextFromBottomFrame() {
		driver.switchTo().frame(bottomFrameId);
		String text = driver.findElement(bodyElement).getText();
		driver.switchTo().parentFrame();
		return text;
	}
}
