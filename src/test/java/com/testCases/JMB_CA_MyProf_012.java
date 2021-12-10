package com.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pageObjects.MyprofilePenciliconPage;

public class JMB_CA_MyProf_012 extends BaseClass {
	@Test
	public void jMB_CA_MyProf_012() throws IOException 
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
		
		
		WebElement phonedrp=driver.findElement(By.cssSelector("div.selected-dial-code"));
		phonedrp.getCssValue("+1");
		logger.info("Click on country Canada");
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
		MP.enterphone();
		logger.info("enter the value of phone no");
	}

}
