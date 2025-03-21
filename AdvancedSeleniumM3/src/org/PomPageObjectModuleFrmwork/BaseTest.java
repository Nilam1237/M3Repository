package org.PomPageObjectModuleFrmwork;

public class BaseTest implements IAutoConstant {
	
	static WebDriver driver;
	
	//To perform pre-requisites to launch and navigate into application
	public void browserSetup() throws IOException
	{
	Flib flib = new Flib();
	String browser = flib.readPropertyData(PROP_PATH, "chrome");
	String url = flib.readPropertyData(PROP_PATH, URL);
	
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
	
	//To quit the browser
	public void browserTearDown()
	{
		driver.quit();
	}
}

}
