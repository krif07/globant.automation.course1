package com.globant.automation.training.wait;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.globant.automation.training.base.BaseTest;

public class DinamicLoadingTest extends BaseTest{

	//@Test
	public void testDinamicLoadingExample1() {
		var dinamicLoading = homePage.clickDinamicLoading();
		var example1 = dinamicLoading.clickExample1();
		
		example1.clickStartButton();
		Assert.assertEquals(example1.getFinishMessage(), 
				"Hello World!",
				"Time finish before");
		
	}
	
	//@Test
	public void testDinamicLoadExample2() {
		var example2 = homePage.clickDinamicLoading().clickExample2();
		
		example2.clickStartButton();
		Assert.assertEquals(example2.getFinishMessage(), 
				"Hello World!",
				"Time finish before");
	}
}
