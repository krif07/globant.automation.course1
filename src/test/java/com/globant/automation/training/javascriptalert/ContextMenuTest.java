package com.globant.automation.training.javascriptalert;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.globant.automation.training.base.BaseTest;
import com.globant.automation.training.pages.ContextMenuPage;

public class ContextMenuTest extends BaseTest{
	
	//@Test
	public void testContextMenu() {
		ContextMenuPage contextMenuPage = homePage.clickContextMenu();
		contextMenuPage.triggerRightClick();
		String message = contextMenuPage.getAlertMessage();
		contextMenuPage.alertClickToAccept();
		
		Assert.assertEquals(message, 
				"You selected a context menu",
				"Message Alert Wrong");
	}
}
