package testPackage;

import org.testng.annotations.Test;

import pomPackage.WelcomePage;

public class TC_BuyProduct_003_Test extends BaseTest {
  @Test
  public void buyProductMethod() 
  {
	  WelcomePage wp = new WelcomePage(driver);
	  wp.getElectronicsLink().click();
	  
	  ElectronicsPage ep = new ElectronicsPage(driver);
	  ep.getCellPhoneLink().cli	  
  }
}
