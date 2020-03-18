package com.globant.automation.training.navigation;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.globant.automation.training.base.BaseTest;

public class NavigationTest extends BaseTest{
	
	//@Test
	public void testNavigator() {
		homePage.clickDinamicLoading().clickExample1();
		getWindowManager().goBack();
		getWindowManager().refreshPage();
		getWindowManager().goForward();
		getWindowManager().goTo("https://www.google.com");
	}
	
	//@Test
	public void testSwitchTab() {
		homePage.clickMultipleWindow().clickHere();
		getWindowManager().switchToTab("New Window");
		
	}
	
	@Test
	public void testValidateStartButtonInNewTab() {
		var dinamicLoading = homePage.clickDinamicLoading();
		var dinamicPage = dinamicLoading.triggerCtrlAndRigthClick();
		getWindowManager().switchToNewOpenTab();
		var button = dinamicPage.getStartButton();
		
		Assert.assertTrue(button.isDisplayed(), "Button is not displayed");
	}
}
