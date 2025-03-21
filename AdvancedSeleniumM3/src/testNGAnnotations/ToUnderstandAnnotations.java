package testNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToUnderstandAnnotations {
  @BeforeTest
  public void beforeTestMethod() 
  {
	  Reporter.log("This is BeforeTest Method , true");
  }
  
  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("This is After Method" , true);
  }
  
  @BeforeSuite
  public void beforeSuiteMethod() 
  {
	  Reporter.log("This is Before Suite Method" , true);
  }
  
  @AfterClass
  public void afterClassMethod() 
  {
	  Reporter.log("This is After Class Method" , true);
  }
  
  @BeforeClass
  public void beforeClassMethod() 
  {
	  Reporter.log("This is Before Class Method" , true);
  }
  
  @BeforeMethod
  public void beforeMethodTest() 
  {
	  Reporter.log("This is Before Method" , true);
  }
  
  @AfterSuite
  public void afterSuiteMethod() 
  {
	  Reporter.log("This is After Suite  Method" , true);
  }
  
  @AfterTest
  public void afterTestMethod() 
  {
	  Reporter.log("This is After Test Method" , true);
  }
  
  @Test
  public void test1() 
  {
	  Reporter.log("This is TestCAse 1" , true);
  }
 
  @Test
  public void test2() 
  {
	  Reporter.log("This is TestCAse 2" , true);
  }
}
