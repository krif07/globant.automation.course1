package com.globant.automation.training.slider;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.globant.automation.training.base.BaseTest;
import com.globant.automation.training.pages.HorizontalSliderPage;

public class HorizontalSliderTest extends BaseTest{

	//@Test
	public void testSliderPosition() {
		HorizontalSliderPage slider = homePage.clickHorizontalSlider();
		slider.moveSlider(8);
		
		Assert.assertTrue(slider.getNumber().equals("4"));
	}
}
