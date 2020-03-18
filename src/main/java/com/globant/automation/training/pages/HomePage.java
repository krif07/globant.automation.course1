package com.globant.automation.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public LoginPage clickFormAuthentication() {
		clickLink("Form Authentication");
		return new LoginPage(driver);
	}
	
	public DropDownPage clickDropDown() {
		clickLink("Dropdown");
		return new DropDownPage(driver);
	}
	
	public ForgotPasswordPage clickForgotPassword() {
		clickLink("Forgot Password");
		return new ForgotPasswordPage(driver);
	}
	
	public HoversPage clickHovers() {
		clickLink("Hovers");
		return new HoversPage(driver);
	}
	
	public KeyPressesPage clickKeyPresses() {
		clickLink("Key Presses");
		return new KeyPressesPage(driver);
	}
	
	public HorizontalSliderPage clickHorizontalSlider() {
		clickLink("Horizontal Slider");
		return new HorizontalSliderPage(driver);
	}
	
	public JavaScriptAlertsPage clickJavaScriptAlerts() {
		clickLink("JavaScript Alerts");
		return new JavaScriptAlertsPage(driver);
	}
	
	public FileUploadPage clickFileUpload() {
		clickLink("File Upload");
		return new FileUploadPage(driver);
	}
	
	public ContextMenuPage clickContextMenu() {
		clickLink("Context Menu");
		return new ContextMenuPage(driver);
	}

	public WysiwygEditorPage clickWysiwygEditor() {
		clickLink("WYSIWYG Editor");
		return new WysiwygEditorPage(driver);
	}
	
	public FramesPage clickFrames() {
		clickLink("Frames");
		return new FramesPage(driver);
	}
	
	public DinamicLoadingPage clickDinamicLoading() {
		clickLink("Dynamic Loading");
		return new DinamicLoadingPage(driver);
	}
	
	public LargeAndDeepDomPage clickLargeAndDeepDom() {
		clickLink("Large & Deep DOM");
		return new LargeAndDeepDomPage(driver);
	}
	
	public InfiniteScrollPage clickInfiniteScroll() {
		clickLink("Infinite Scroll");
		return new InfiniteScrollPage(driver);
	}
	
	public MultipleWindowPage clickMultipleWindow() {
		clickLink("Multiple Windows");
		return new MultipleWindowPage(driver);
	}
	
	private void clickLink(String linkText) {
		driver.findElement(By.linkText(linkText)).click();
	}
}
