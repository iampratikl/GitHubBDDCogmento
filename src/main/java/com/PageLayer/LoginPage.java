package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class LoginPage extends BaseClass {

	@FindBy(name = "email")
	WebElement email;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//div[text()='Login']")
	WebElement LoginBtn;

	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public void ValidateLoginFunctionality() {
		email.sendKeys("pratiklenekar007@gmail.com");
		password.sendKeys("Testing2024");

	}

	public void ValidateLoginBtn() {
		LoginBtn.click();

	}

}
