package com.globant.automation.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {

	private WebDriver driver;
	private By slider = By.cssSelector(".sliderContainer input");
	private By span = By.cssSelector(".sliderContainer span");
	
	public HorizontalSliderPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void moveSlider(int number) {
		for(int i=0; i<number; i++) {
			driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
		}
	}
	
	public String getNumber() {
		return driver.findElement(span).getText();
	}
}
