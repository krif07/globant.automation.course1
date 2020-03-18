package com.globant.automation.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {

	private WebDriver driver;
	private By fileUpload = By.id("file-upload");
	private By uploadButton = By.id("file-submit");
	
	public FileUploadPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public UploadPage clickUploadButton() {
		driver.findElement(uploadButton).click();
		return new UploadPage(driver);
	}
	
	/**
	 * Provide path of file to the form then clicks Upload button
	 * @param absolutePathOfFile The complete path of the file to upload
	 */
	public UploadPage uploadFile(String absolutePathOfFile) {
		driver.findElement(fileUpload).sendKeys(absolutePathOfFile);
		return clickUploadButton();
	}
}
