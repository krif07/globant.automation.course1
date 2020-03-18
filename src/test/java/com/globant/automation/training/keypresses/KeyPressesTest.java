package com.globant.automation.training.keypresses;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.globant.automation.training.base.BaseTest;
import com.globant.automation.training.pages.KeyPressesPage;

public class KeyPressesTest extends BaseTest{

	//@Test
	public void testBackSpaceKey() {
		String message = "You entered: BACK_SPACE";
		KeyPressesPage keyPressesPage = homePage.clickKeyPresses();
		keyPressesPage.enterText("S" + Keys.BACK_SPACE);
		
		Assert.assertEquals(keyPressesPage.getResultMessage(), message, "Error message");
	}
	
	//@Test
	public void testPi() {
		KeyPressesPage key = homePage.clickKeyPresses();
		key.enterPi();
		
		Assert.assertEquals(key.getResultMessage(), "You entered: 4");
	}
}
