package com.globant.automation.training.login;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.globant.automation.training.base.BaseTest;
import com.globant.automation.training.pages.LoginPage;
import com.globant.automation.training.pages.SecureAreaPage;

public class LoginTest extends BaseTest{

	//@Test
	public void testSuccessfullLogin() {
		LoginPage loginPage = homePage.clickFormAuthentication();
		loginPage.setUserName("tomsmith");
		loginPage.setPassword("SuperSecretPassword!");
		SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
		
		assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"), 
				"Alert test incorrect");
	}
}
