package org.PomPageObjectModuleFrmwork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicPage {
	
	//Declaration
	@FindBy(partialLinkText = "Cell phones") private WebElement cellPhonesLink;
	@FindBy(xpath = "//a[text() = 'Smartphone']/../..//input[@value='Add to cart']") private WebElement smartphoneAddToCartButton;
	
	//Initialization
	public void ElectronicsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getCellPhonesLink() {
		return cellPhonesLink;
	}

	public WebElement getSmartphoneAddToCartButton() {
		return smartphoneAddToCartButton;
	}
	
	

}


