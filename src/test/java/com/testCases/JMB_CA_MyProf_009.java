package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pageObjects.MyprofilePenciliconPage;

public class JMB_CA_MyProf_009 extends BaseClass{
	@Test

	public void TC0010PencilIconVideo () throws IOException 
	{
		logger.info("Clicked on Login");
		JMB_CA_MyProf_002  Ho=new JMB_CA_MyProf_002 ();
		Ho.Homebuttontest();
		logger.info("Logged In successful");
		
		MyprofilePenciliconPage MP =new MyprofilePenciliconPage(driver);
		MP.clickpencilme();
		logger.info("Click on Me buton on header");
		
		MP.clickpencilmyprofile();
		logger.info("Click on My profile on Me");
		
		MP.editpencilmyprofile();
		logger.info("Click on edit button in candidate profile");
		
		MP.uploadvideo();
		logger.info("Click to upload the video");
		
		MP.btnsave();
		logger.info("Click button to save");
		
	
	}
}
