package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyprofilePenciliconPage {
	
	public WebDriver driver;
	
	public MyprofilePenciliconPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//clicking on Me (pencil icon page)
	@FindBy(css="a.nav-link.dropdown-toggle.meMenu-Tab")
	WebElement PencilMe;
		
	//clicking on myprofile (pencil icon page)
	@FindBy(css="span.icon-account-user.navbar-svg-size-dropdown")
	WebElement pencilMyprofile;
	
	//clicking on pencil button in candidate profile page
	@FindBy(xpath="/html[1]/body[1]/section[1]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[3]/a[1]/span[1]/img[1]")
	WebElement editMyprofile;
	
	//click to upload the video
	@FindBy(id="fileName")
	WebElement upvideo;
	
	//click to add the first name
	@FindBy(css="input#firstNameID")
	WebElement Firstname;
	
	//click to add the last name
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[2]/div[1]/input[1]")
	WebElement Lastname;
	
	//click to add the phone no
	@FindBy(id="country-listbox")
	WebElement dialcoad;
	
	//Add phone values
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/div[1]/div[2]/input[1]")
	WebElement phoneNo;
	
	// select data from dropdown area code
	@FindBy(linkText="1")
	WebElement drpdownselect;
	
	//select the availability
	@FindBy(css="span.on-off-toggle.round")
	WebElement availablebtn;
	
	//Select the availability from
	@FindBy(xpath="//*[@id=\"candidatePersonalDetailsForm\"]/div[1]/div[6]/input")
	WebElement selectDate;
	
	
	// Add experience 
	
	@FindBy(xpath="/html/body/div[2]/div/div[1]/div/div/div/div/div[2]/form/div[1]/div[7]/input")
	WebElement experience;
	
	//click on save button
	@FindBy(css="button.jb-save-button-popup")
	WebElement save;
	
	//Methods for the webelements
	
	public void clickpencilme() 
	{
		PencilMe.click();
	}
	
	public void clickpencilmyprofile() 
	{
		pencilMyprofile.click();
	}
	
	public void editpencilmyprofile() 
	{
		editMyprofile.click();
	}
	public void uploadvideo() 
	{
		upvideo.click();
	}
	
	public void btnsave() 
	{
		save.click();
	}
	
	public void firstname()
	{
		Firstname.sendKeys("Aaisha");
	}
	
	public void lastname() 
	{
		Lastname.sendKeys("Doctor");
	}
	
	public void btnareacode() 
	{
		
	dialcoad.click();
	}
	
	public void enterphone() 
	{
		phoneNo.sendKeys("4166697744");
	}
	
	public void availablity() 
	{
		availablebtn.click();
		
	}
	
	public void availablityDate()
	{
		selectDate.sendKeys("12-12-2021");
	}
	
	public void addExperience() 
	{
		experience.sendKeys("20");
	}
	
	public void addExperience1() 
	{
		
		experience.sendKeys("50");
	}
	

}
