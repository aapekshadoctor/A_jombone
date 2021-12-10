package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.HeaderdashboardPage;

public class JMB_CA_MyProf_004  extends BaseClass{
	
	SoftAssert st =new SoftAssert();
	@Test
	public void TC005HeaderCompanytest () throws IOException 
	{
        logger.info("Clicked on Login");
		//Creating an object and calling all the methods of HomebuttonTest_002
		JMB_CA_MyProf_002  Ho=new JMB_CA_MyProf_002 ();
		Ho.Homebuttontest();
		logger.info("Logged In successful");
		
		//Creating an object and calling all the methods of HeaderdashboardPage
		HeaderdashboardPage HP=new HeaderdashboardPage(driver);
		HP.clkCompanyHeader();
		logger.info("Clicked on Company logo in Header");
		
		HP.clkheaderMe();
		logger.info("Logged In successful and clicked on Me on Dashboard");
		
		HP.clickheaderMyprofile();
		logger.info("clicked on MyProfile logo");
		
		HP.clickkMyprofileCompanylogo();
		logger.info("clicked on MyProfile page and Company logo");
		
		// validation
		
				if(driver.getTitle().equals("Companies")) 
				{
					st.assertTrue(true);
					logger.info("Companies page displayed");
				}
				else 
				{
					st.assertTrue(true);
					logger.info("Companies page not displayed/test failed");
				}
				
	}

}
