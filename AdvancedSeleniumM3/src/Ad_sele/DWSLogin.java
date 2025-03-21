package Ad_sele;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.http.WebSocket;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class DWSLogin {
	public static void main(String[] args) throws IOException {
		  WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
          driver.get("https://demowebshop.tricentis.com/");
          
          driver.findElement(By.linkText("Log in")).click();
          
        FileInputStream fis = new FileInputStream("./testData/config.Properties");
        
        Properties prop = new Properties();
        prop.load(fis);
        
       String email = prop.getProperty("email");
       String pass = prop.getProperty("password");
       
       driver.findElement(By.id("Email:")).sendKeys(email);
       driver.findElement(By.id("Password:")).sendKeys(pass);
       driver.findElement(By.xpath("//input[@value='Log in']")).click();
       
       
        
	     
	
	
	}
	

}
