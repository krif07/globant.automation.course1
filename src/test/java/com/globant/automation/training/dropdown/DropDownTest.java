package com.globant.automation.training.dropdown;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import com.globant.automation.training.base.BaseTest;
import com.globant.automation.training.pages.DropDownPage;

public class DropDownTest extends BaseTest{
	
	//@Test
	public void testSelectOption() {
		String option = "Option 1";
		DropDownPage dropdownPage = homePage.clickDropDown();
		dropdownPage.selectFromDropDown(option);
		
		var selectedOptions = dropdownPage.getSelectedOption();
		assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
		assertTrue(selectedOptions.contains(option), "Option not selected");
	}
	
	//@Test
	public void testChangeDropDownWithJavascript() {
		String option1 = "Option 1";
		String option2 = "Option 2";
		
		var dropDown = homePage.clickDropDown();
		dropDown.changeDropDownToMultiple();
		dropDown.selectFromDropDown(option1);
		dropDown.selectFromDropDown(option2);
		
		var selectedOptions = dropDown.getSelectedOption();
		
		assertEquals(selectedOptions.size(), 2,
				"Incorrect number of selections");
		assertTrue(selectedOptions.contains(option1), option1 + " no selected");
		assertTrue(selectedOptions.contains(option2), option2 + " no selected");
	}

}
