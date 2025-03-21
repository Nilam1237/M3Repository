package testNGAssertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToUnderstandAssertion {
  @Test
  
  public void invalidLoginTC() 
  {
	 WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
     driver.get("https://demowebshop.tricentis.com/login");
  
     String expectedWelcomePAgeTitle = "Demo Web Shop "; //title with error
     String expectedLoginPageTitle = "Demo Web Shop. Login"; // title with error
     Assert.assertEquals(driver.getTitle(), expectedWelcomePAgeTitle, "Welcome Page Is Not Found");
     
     driver.findElement(By.linkText("Log in")).click();
     
     
  }
  
  
}
