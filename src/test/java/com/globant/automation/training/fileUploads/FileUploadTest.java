package com.globant.automation.training.fileUploads;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.globant.automation.training.base.BaseTest;
import com.globant.automation.training.pages.FileUploadPage;
import com.globant.automation.training.pages.UploadPage;

public class FileUploadTest extends BaseTest{

	private String path = "C:\\Users\\cristian.davila\\eclipse-workspace\\globant.automation\\resources\\";
	private String file = "chromedriver.exe";
	
	//@Test
	public void testUploadFile() {
		FileUploadPage uploadFilePage = homePage.clickFileUpload();
		UploadPage uploadPage = uploadFilePage.uploadFile(path + file);
		
		Assert.assertEquals(uploadPage.getTitleMessage(), 
				"File Uploaded!",
				"Wrong title message");
		Assert.assertEquals(uploadPage.getBodyMessage(), 
				file,
				"Wrong file message");
	}
}
