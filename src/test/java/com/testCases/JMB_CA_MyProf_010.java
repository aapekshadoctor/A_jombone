package com.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pageObjects.MyprofilePenciliconPage;

public class JMB_CA_MyProf_010 extends BaseClass {
	
	@Test
	public void Pencilicon_firstnameTest() throws IOException 
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
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		MP.firstname();
		logger.info("Add/Edit first name");
		
		MP.lastname();
		logger.info("Add/Edit Last name");
		
		MP.btnsave();
		logger.info("Save the changes");
	}

}
