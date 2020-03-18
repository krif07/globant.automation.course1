package com.globant.automation.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DinamicLoadingPage {
	
	private WebDriver driver;
	private String linkXpahtFormat = ".//a[contains(text(), '%s')]";
	private By linkExample1 = By.xpath(String.format(linkXpahtFormat, "Example 1"));
	private By linkExample2 = By.xpath(String.format(linkXpahtFormat, "Example 2"));
	
	public DinamicLoadingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public DinamicLoadingExample1Page clickExample1() {
		clickLink(linkExample1);
		return new DinamicLoadingExample1Page(driver);
	}
	
	public DinamicLoadingExample2Page clickExample2() {
		clickLink(linkExample2);
		return new DinamicLoadingExample2Page(driver);
	}
	
	private void clickLink(By by) {
		driver.findElement(by).click();
	}
	
	public DinamicLoadingExample1Page triggerCtrlAndRigthClick() {
		//Actions actions = new Actions(driver);
		WebElement link1 = driver.findElement(linkExample1);
		//actions.keyDown(link1, Keys.chord(Keys.CONTROL, Keys.RETURN)).perform(); //.click(link1).perform();
		//actions.click(link1).perform();
		link1.sendKeys(Keys.CONTROL, Keys.RETURN);
		return new DinamicLoadingExample1Page(driver);
	}

}
