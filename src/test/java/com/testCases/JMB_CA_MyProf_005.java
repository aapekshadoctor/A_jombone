package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.HeaderdashboardPage;

public class JMB_CA_MyProf_005 extends BaseClass {
	SoftAssert st= new SoftAssert();
	@Test
	
	public void TC006HeaderNotificationtest() throws IOException
	{
		logger.info("Clicked on Login");
		//Creating an object and calling all the methods of HomebuttonTest_002
		JMB_CA_MyProf_002  Ho=new JMB_CA_MyProf_002 ();
		Ho.Homebuttontest();
		logger.info("Logged In successful");
		
		//Creating an object and calling all the methods of HeaderdashboardPage
		HeaderdashboardPage HP=new HeaderdashboardPage(driver);
		
		HP.clkNotificationHeader();
		logger.info("Clicked on Notification logo from  Header");
		
		HP.clkheaderMe();
		logger.info("Logged In successful and clicked on Me on Dashboard");
		
		HP.clickheaderMyprofile();
		logger.info("clicked on MyProfile logo");
		
		HP.clickkMyprofileNotificationlogo();
		logger.info("clicked on MyProfile Notification logo");
		
		// validation
		
		if(driver.getTitle().equals("Notifications")) 
		{
			st.assertTrue(true);
			logger.info("Notifications page displayed");
		}
		else 
		{
			st.assertTrue(true);
			logger.info("Notifications page not displayed/test failed");
		}
		
		
	}
		
	}

