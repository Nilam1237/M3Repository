package testNGpackage1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToUnderstandDependsOnMethods {
  @Test(dependsOnMethods = "register")
  public void login() 
  {
	 Reporter.log("This is login method" , true); 
  }
  
  @Test(dependsOnMethods = "login")
  public void checkAccountBalance() 
  {
	 Reporter.log("This is login method" , true); 
  }
  
  @Test
  public void logout() 
  {
	 Reporter.log("This is " , true); 
  }
  
  @Test(dependsOnMethods = {"moneyTransfer" , "logout" })
  public void moneyTransfer() 
  {
	 Reporter.log("This is a money Transfer Methods" , true); 
  }
 
  
 
}

