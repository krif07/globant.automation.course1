package com.globant.automation.training.javascriptalert;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.globant.automation.training.base.BaseTest;
import com.globant.automation.training.pages.JavaScriptAlertsPage;

public class JavaScriptAlertTest extends BaseTest{

	//@Test
	public void testAceptJavaScrptAlert() {
		JavaScriptAlertsPage alertPage = homePage.clickJavaScriptAlerts();
		alertPage.triggerAlert();
		alertPage.alertClickToAccept();
		
		Assert.assertEquals(alertPage.getResult(), 
				"You successfuly clicked an alert", 
				"Alert text wrong");
	}
	
	//@Test
	public void testGetTextFromAlert() {
		JavaScriptAlertsPage alertPage = homePage.clickJavaScriptAlerts();
		alertPage.triggerConfirm();
		
		Assert.assertEquals(
				alertPage.getAlertText(), 
				"I am a JS Confirm",
				"Confirm text wrong");
		
		alertPage.alertClickToCancel();
		Assert.assertEquals(alertPage.getResult(), 
				"You clicked: Cancel",
				"Confirm text wrong");
	}
	
	//@Test
	public void testSetInputInAlert() {
		JavaScriptAlertsPage alertPage = homePage.clickJavaScriptAlerts();
		alertPage.triggerPrompt();
		alertPage.setAlertText("Cristian");
		alertPage.alertClickToAccept();
		Assert.assertEquals(alertPage.getResult(),
				"You entered: Cristian",
				"Prompt text wrong");
		
	}
}
