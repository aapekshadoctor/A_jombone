package com.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pageObjects.MyprofilePenciliconPage;

public class JMB_CA_MyProf_016 extends BaseClass{
	@Test
	
	public void Negative_experience () throws IOException 
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
		
		
		MP.addExperience1();
		logger.info("Negative value of the experience, But still user able to save the changes");
		
		
		MP.btnsave();
		logger.info("save the changes in candidate profile");
		
	}

}
