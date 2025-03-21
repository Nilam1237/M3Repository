package org.PomPageObjectModuleFrmwork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
       /////Declaration
	@FindBy(id="Email") private WebElement emailTB;
	@FindBy(id="Password")private WebElement passwordTB;
	@FindBy(xpath = "//input[@value='Log in']")private WebElement loginbutton;
	@FindBy(id="Remember me")private WebElement remembermecheckbox;
	@FindBy(linkText ="Forgot password?")private WebElement forgetpasswordLink;
	
	///Initialization
	
	public LoginPage(WebDriver  )
		
	}

