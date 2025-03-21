package testPackage;

import java.io.IOException;

import org.testng.annotations.Listeners;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLiabrary.BaseTest;
import pomPackage.ShoppingCartPage;
import pomPackage.WelcomePage;

@Listeners(genericLiabrary.MyListener.class)

public class TC_AddToCart_001_Test extends BaseTest
{

	@Test
	public void addToCartMethod() throws IOException  {
	
	WelcomePage wp = new WelcomePage(driver);
	wp.getElectronicsLink().click();

	ElectronicsPage ep = new ElectronicsPage(driver);
	ep.getCellPhoneLink().click();
	
	ep.getSmartPhoneAddToCartButton().click();
	
	wp.getShoppingCartLink().click();
	
	ShoppingCartPage sp = new ShoppingCartPage(driver);
    // ShoppingCartPage sp = new ShoppingCartPage(driver);
     
    SoftAssert sa = new SoftAssert();
    sa.assertEquals(sp.getSmartPhonelCArtProduct().isDisplayed, true, "Product is not Added To Cart");
	
    sa.assertAll();
     
	
	
	}

	
}
