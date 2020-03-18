package com.globant.automation.training.forgotpassword;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.globant.automation.training.base.BaseTest;
import com.globant.automation.training.pages.EmailSentPage;
import com.globant.automation.training.pages.ForgotPasswordPage;

public class ForgotPasswordTest extends BaseTest{
	
	
	
	//@Test
	public void testSentEmail() {
		String message = "Your e-mail's been sent!";
		ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
		forgotPasswordPage.setEmail("krif07@gmail.com");
		EmailSentPage emailSentPage = forgotPasswordPage.clickRetrievePassword();
		
		Assert.assertTrue(emailSentPage.getMessageText().contains(message), "The email wasn't sent");
	}
}
