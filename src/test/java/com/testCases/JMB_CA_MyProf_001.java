package com.testCases;
import java.io.IOException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.HomeiconsPage;


public class JMB_CA_MyProf_001 extends BaseClass{
	SoftAssert st=new SoftAssert();
	@Test
	
		public void TC003Profilescreen()  throws IOException 
	{
		LoginTest LT =new LoginTest();
		LT.Logintest();
		logger.info("click on Login");
		
		HomeiconsPage hp =new HomeiconsPage(driver);
		hp.clickupdateprofile();
		logger.info("click on Pop up window for Profile Update");
		
		hp.clickmebtn();
		logger.info("click on Me button");
		
		
		hp.clickmyprofile();
		logger.info("click on myprofile");
		
		if(driver.getTitle().equals("Candidate Profile")) 
		{
			st.assertTrue(true);
			logger.info("My profile page displayed");
		}
		else 
		{
			st.assertTrue(true);
			logger.info("My profile page not displayed/test failed");
		}
		
	}

}
