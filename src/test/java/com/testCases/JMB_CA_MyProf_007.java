package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.HeaderdashboardPage;

public class JMB_CA_MyProf_007 extends BaseClass {
	SoftAssert st =new SoftAssert();
	@Test  
	public void TC008Headermyprofile() throws IOException 
	{
		logger.info("Clicked on Login");
		JMB_CA_MyProf_002  Ho=new JMB_CA_MyProf_002 ();
		Ho.Homebuttontest();
		logger.info("Logged In successful");
		
		HeaderdashboardPage HP=new HeaderdashboardPage(driver);
		HP.clkheaderMe();
		logger.info("Logged In successful and clicked on Me on Dashboard");
		
		HP.clickheaderMyprofile();
		logger.info("clicked on MyProfile logo");
		
		// validation
		
		if(driver.getTitle().equals("Candidate Profile")) 
			{
				st.assertTrue(true);
				logger.info("Candidate Profile page displayed");
			}
			else 
			{
				st.assertTrue(true);
				logger.info("Candidate Profile page not displayed/test failed");
			}
					
		
	
	}
	
	
}
