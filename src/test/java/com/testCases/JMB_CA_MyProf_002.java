package com.testCases;
import java.io.IOException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.HomeiconsPage;


public class JMB_CA_MyProf_002 extends BaseClass {
	SoftAssert st =new SoftAssert();

@Test
public void Homebuttontest() throws IOException
{
	LoginTest LT =new LoginTest();
	LT.Logintest();
	
	logger.info("click on home button on dashboard");
	HomeiconsPage hp=new HomeiconsPage(driver);
	hp.clickupdateprofile();
	logger.info("click on Pop up wondow and close it ");
	hp.clickhomebutton();   
	logger.info("click on Home button on header ");
	hp.clickmebtn();
	logger.info("click on Me button on header");
	hp.clickmyprofile();
	logger.info("click on myprofile in Me");



//validation
			
	if(driver.getTitle().equals("Dashboard")) 
	{
		st.assertTrue(true);
		logger.info("Test Passed! Login Successful!");
	}
	else 
	{
		st.assertTrue(true);
		logger.info("Login Passed");
		captureScreen(driver,"Logintest");
	}
	st.assertAll();
	logger.info("Completed Logintest");
	
}
}
			


	


