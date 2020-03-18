package com.globant.automation.training.frame;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.globant.automation.training.base.BaseTest;
import com.globant.automation.training.pages.FramesPage;
import com.globant.automation.training.pages.NestedFramesPage;

public class NestedFrameTest extends BaseTest{

	//@Test
	public void testLeftAndBottonFrames() {
		FramesPage framePage = homePage.clickFrames();
		NestedFramesPage nfp = framePage.clickNestedFrames();
		
		Assert.assertEquals(nfp.getTextFromLeftFrame(), 
				"LEFT",
				"Wrong framewor");
		
		Assert.assertEquals(nfp.getTextFromBottomFrame(), 
				"BOTTOM",
				"Wrong framewor");
		
	}
}
