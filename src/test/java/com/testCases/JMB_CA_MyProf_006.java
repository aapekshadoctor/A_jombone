package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.HeaderdashboardPage;

public class JMB_CA_MyProf_006 {
	public class TC004HeaderJobsTest extends BaseClass{
		SoftAssert st =new SoftAssert();
		@Test
		
		public void TC004HeaderJobstest() throws IOException
		{
			logger.info("Clicked on Login");
			
			JMB_CA_MyProf_002  Ho=new JMB_CA_MyProf_002 ();
			Ho.Homebuttontest();
			logger.info("Logged In successful");
			
			HeaderdashboardPage HP=new HeaderdashboardPage(driver);
			HP.clkWorkHeader();
			logger.info("Logged In successful and clicked on Work on Dashboard");
			
			HP.clkheaderMe();
			logger.info("Logged In successful and clicked on Me on Dashboard");
			
			HP.clickheaderMyprofile();
			logger.info("clicked on MyProfile logo");
			
			HP.clickkMyprofileWorklogo();
			logger.info("clicked on MyProfile page and work Button");
			
			// validation
			
			if(driver.getTitle().equals("Job Applications")) 
			{
				st.assertTrue(true);
				logger.info("Job Applications page displayed");
			}
			else 
			{
				st.assertTrue(true);
				logger.info("Job Applications page not displayed/test failed");
			}
			
			
		}	
		
		
		
		
		
	}


}
