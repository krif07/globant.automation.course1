package com.globant.automation.training.wysiwygEditor;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.globant.automation.training.base.BaseTest;
import com.globant.automation.training.pages.WysiwygEditorPage;

public class WysiwygEditorTest extends BaseTest{

	//@Test
	public void testAddTextAndStyleIt() {
		WysiwygEditorPage wysiwygEditor = homePage.clickWysiwygEditor();
		wysiwygEditor.clearTextArea();
		
		String text1 = "Hello";
		String text2 = "Cristian!";
		
		wysiwygEditor.setTextArea(text1);
		wysiwygEditor.applyDecreaseIndentToText();
		wysiwygEditor.setTextArea(text2);
		
		Assert.assertEquals(wysiwygEditor.getTextFromEditor(), 
				text1 + text2,
				"Text from editor is incorrect");
		
	}
}
