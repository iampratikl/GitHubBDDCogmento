package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class AddContact extends BaseClass {
	
	@FindBy(xpath="//div[@id='main-nav']/child::div[3]/descendant::i[1]")
	WebElement create;
	
	
	@FindBy(name="first_name")
	WebElement fname;
	
	@FindBy(name="last_name")
	WebElement lname;
	
	////div[@name='channel_type']

	@FindBy(xpath="//span[@class='user-display']")
	WebElement homev;
	
	public AddContact()
	{
		PageFactory.initElements(getDriver(), this);
	}

	public void AddContactFunctionality()
	{
		create.click();
		fname.sendKeys("Ujama");
		lname.sendKeys("Attar");
	}
	
	public void validatehomev()
	{
		String user1=homev.getText();
		if(user1.contains("Pratik Lenekar"))
		{
			System.out.println("User matches");
		}
		else
		{
			System.out.println("unauthorsed user");
		}
	}
}
