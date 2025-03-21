package pomPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import genericLiabrary.Flib;
import genericLiabrary.SelectUtility;

public class CheckOutPage {

	@FindBy(id="")
}



@FindBy(id="billing-address-select") private WebElement billingAddressoldAddressDD;



//Operational Methods

public void buyProduct()
{
	SelectUtility su = new SelectUtility();
	
	try
	{
		
	
	if(billingAddressoldAddressDD.isDisplayed()==true)
	{
		su.selectByVisibleTextMethod(billingAddressoldAddressDD, "New Address");
	}
	}
	catch (Exception e)
	{
	   su.selectByVisibleTextMethod(countryDD, "India");
	}
	
	su.selectByVisibleTextMethod(countryDD, "India");
	
	
	Flib flib = new Flib();
	city = flib.readExcelData(EXCEL_PATH_MAIN, "buyProductDetails", 1, 0);
	
	
	
	
	
   	
}