package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeiconsPage {

	public WebDriver ldriver;
	
	public HomeiconsPage(WebDriver rdriver) //Creating a constructor
	{ 
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	//the pop up window click
	@FindBy(css="span.close-icon.svg-big-size.d-block")
	WebElement updateprofile;
	
	//Capturing the Home button
	@FindBy(css="a.nav-link.home-tab")
	WebElement homebtn;
	
	//clicking on Me 
	@FindBy(css="a.nav-link.dropdown-toggle.meMenu-Tab")
	WebElement drpMe;
	
	//clicking on myprofile
		@FindBy(css="span.icon-account-user.navbar-svg-size-dropdown")
		WebElement clkMyprofile;
	
	
	//Methods to click homebutton
	
	public void clickupdateprofile()  // method for update profile
	{
		updateprofile.click();
	}
	
	public void clickhomebutton()     // method for click home button
	{
		homebtn.click();
	}
	
	public void clickmebtn() 
	{
		drpMe.click();
	}
	
	public void clickmyprofile() 
	{
		clkMyprofile.click();
	}
	
	
}

