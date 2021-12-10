package com.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pageObjects.MyprofilePenciliconPage;

public class JMB_CA_MyProf_017 extends BaseClass {
	@Test 
	
	public void HighestExperience () throws IOException
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
		
		WebElement edu =driver.findElement(By.className("selectpicker"));
		Select st=new Select(edu);
		
		st.selectByVisibleText("University/Graduate");
		logger.info("Entering the value of highest education");
		
		MP.btnsave();
		logger.info("Saving the values");
		
		
		
	}
}
