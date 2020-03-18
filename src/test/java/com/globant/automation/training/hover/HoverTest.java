package com.globant.automation.training.hover;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.globant.automation.training.base.BaseTest;
import com.globant.automation.training.pages.HoversPage;
import com.globant.automation.training.pages.HoversPage.FigureCaption;

public class HoverTest extends BaseTest{

	//@Test
	public void testHoverUser1() {
		HoversPage hoversPage = homePage.clickHovers();
		FigureCaption caption = hoversPage.hoverOverFigure(1);
		
		Assert.assertTrue(caption.isCaptionDisplayed(), "Caption is not displayed!");
		Assert.assertEquals(caption.getTitle(), "name: user1", "Caption title incorrect!");
		Assert.assertEquals(caption.getLinkText(), "View profile", "Link Text incorrect!");
		Assert.assertTrue(caption.getLink().endsWith("/users/1"), "Link incorrect!");
	}
}
