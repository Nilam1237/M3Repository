package genericLiabrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoConstant {
	
	static WebDriver driver;
	
	//To perform pre-requisites to launch and navigate into application
	public void browserSetup() throws IOException
	{
	Flib flib = new Flib();
	String browser = flib.readpropertyData(PROP_PATH_MAIN, "chrome");
	String url = flib.readpropertyData(PROP_PATH_MAIN, URL);
	
	if(browser.equalsIgnoreCase("chrome"))
	{
		driver = new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("edge"))
	{
		driver = new EdgeDriver();
	}
	else if(browser.equalsIgnoreCase("firefox"))
	{
		driver = new FirefoxDriver();
	}
	else
	{
		System.err.println("Enter the valid browser name");
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get(url);
	}
	
	@BeforeMethod
	public void validLogin()
	{
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();
		
	    LoginPage lp = new LoginPage(driver);
	    Flib flib = new Flib();
	    String email = flib.readExcelData(EXCEL_PATH_MAIN, VALIDLOGINCREDS, 1, 0);
	    String password = flib.readExcelData(EXCEL_PATH_MAIN, VALIDLOGINCREDS, 1, 1);
	    lp.validLoginMethod(email,password);
	}
	
	@AfterMethod
	public void logout()
	{
		WelcomePage wp = new WelcomePage(driver);
		wp.logout();
	}
	
	
	@AfterClass
	//To quit the browser
	public void browserTearDown()
	{
		driver.quit();
	}
}


