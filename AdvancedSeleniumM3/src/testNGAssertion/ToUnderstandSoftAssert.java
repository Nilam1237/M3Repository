package testNGAssertion;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToUnderstandSoftAssert {
  @Test
  public void validLoginTC() 
  {
	  WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	     driver.get("https://demowebshop.tricentis.com/login");
	  
	     String expectedWelcomePAgeTitle = "Demo Web Shop "; //title with error
	     String expectedLoginPageTitle = "Demo Web Shop. Login"; // title with error
	     
	     SoftAssert sa = new SoftAssert();
	     sa.assertequ
	     Assert.assertEquals(driver.getTitle(), expectedWelcomePAgeTitle, "Welcome Page Is Not Found");
  }
}
