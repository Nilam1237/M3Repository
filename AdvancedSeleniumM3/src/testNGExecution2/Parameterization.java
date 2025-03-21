package testNGExecution2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class Parameterization {
 @paramerters("bname")
	@Test
  public void ParameterMethod((@Optional)("firefox")String browserValue)
{
	WebDriver driver = null;
	 if(browserValue.equalsIgnoreCase("chrome"))
	 {
		 driver = new ChromeDriver();
	 }
	 else if(browserValue.equalsIgnoreCase("Firefox"))
			 {
		 driver = new FirefoxDriver();
	 }
	 else if(browserValue.equalsIgnoreCase("edge"))
	 {
		 driver = new EdgeDriver();
	 }
	 else
	 {
		 System.out.println("Invalid browser Name");
	 }
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 driver.get("https://demowebshop.tricentis.com/");
	 
  }

