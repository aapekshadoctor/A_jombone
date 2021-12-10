package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderdashboardPage {
	
	public WebDriver ldriver;
	
	public HeaderdashboardPage(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	// Header Jobs Btn locator
	@FindBy(css= "span.icon-briefcase.navbar-svg-size")
	@CacheLookup
	WebElement btnJobs;
	
	//// Header Company logo locator
	@FindBy(css= "span.icon-companies.navbar-svg-size")
	@CacheLookup
	WebElement btnCompany;
	
	// Header Notification logo click
	@FindBy(css= "span.icon-notification.navbar-svg-size")
	@CacheLookup
	WebElement btnNotification;
	
	// Header Work logo click
	@FindBy(css= "span.icon-employment.navbar-svg-size")
	@CacheLookup
	WebElement btnWork;
	
	//clicking on Me 
		@FindBy(css="a.nav-link.dropdown-toggle.meMenu-Tab")
		WebElement clkMe;
		
	//clicking on myprofile
		@FindBy(css="span.icon-account-user.navbar-svg-size-dropdown")
		WebElement clickMyprofile;
		
	// clicking on Myprofile page on jobs icon
		@FindBy(css="a.nav-link.job-tab")
		WebElement myprofilejobs;
	
	// clicking on Myprofile page on Company icon
		@FindBy(css="span.icon-companies.navbar-svg-size")
		WebElement myprofilecompany;
		
	//clicking on Myprofile page on Notofication icon
		@FindBy(css="span.icon-notification.navbar-svg-size")
		WebElement myprofilenotification;
	
	//clicking on Myprofile page on Work icon
		@FindBy(css="span.icon-employment.navbar-svg-size")
		WebElement myprofilework;		
	
		
	// 
	// Methods for Header Jobs btn
	public void clkJobsheader() 
	{
		btnJobs.click();
	}

	// Methods for Header Me logo
	public void clkheaderMe() 
	{
		clkMe.click();
	}
	
	// Methods for Header Myprofile logo
	public void clickheaderMyprofile() 
	{
		clickMyprofile.click();
	}
	
	
	// Methods for Header Myprofile page jobs logo
	public void clickMyprofilejobslogo() 
	{
		myprofilejobs.click();
	}
	
	
	//Method for Header COmpay icon
	public void clkCompanyHeader() 
	{
		btnCompany.click();
	}
	
	//Method for Notification Logo
	public void clkNotificationHeader() 
	{
		btnNotification.click();
	}
	
	//Method for Header Work  Logo
	public void clkWorkHeader() 
	{
		btnWork.click();
	}
	
	//Method for MyProfile Company Logo
		public void clickkMyprofileCompanylogo() 
		{
			myprofilecompany.click();
		}
		
	//Method for MyProfile Company Logo
				
		public void clickkMyprofileNotificationlogo() 	
		{
			myprofilenotification.click();
		}
		
	//Method for MyProfile Company Logo
		
		public void clickkMyprofileWorklogo() 	
		{
			myprofilework.click();
		}
}
