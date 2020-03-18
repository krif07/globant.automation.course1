package com.globant.automation.training.javascript;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.globant.automation.training.base.BaseTest;

public class JavascriptTest extends BaseTest{

	//@Test
	public void testScrollDown() {
		
		homePage.clickLargeAndDeepDom().scrollToTable();
		//Assert.assertEquals(,,);
	}
	
	//@Test
	public void testInfiniteScroll() {
		homePage.clickInfiniteScroll().scrollToParagraph(4);
	}
}
