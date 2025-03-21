package testPackage;

import static genericLiabrary.BaseTest.driver;

import java.lang.classfile.CodeBuilder.CatchBuilder;

import org.apache.commons.collections4.functors.CatchAndRethrowClosure;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pomPackage.ShoppingCartPage;
import pomPackage.WelcomePage;

public class TC_RemoveProductFromCart_002_Test {
  @Test
  public void removeProductFromCart() 
  {
	  WelcomePage wp = new WelcomePage(driver);
		wp.getElectronicsLink().click();

		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellPhoneLink().click();
		
		ep.getSmartPhoneAddToCartButton().click();
		
		wp.getShoppingCartLink().click();
		
		ShoppingCartPage sp = new ShoppingCartPage(driver);
		sp.getSmartPhoneCheckbox().click();
		
		sp.getUpdateShoppingCartButton().click();
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(sp.getSmartPhoneCartProduct(), isDiplayed(), false, "Product is not removed from cart");
  }
      Catch(Exception e )
      {
    	  Reporter.log("Product is removed from cart", true);
      }
		sa.assertAll();
  }

