package genericLiabrary;
import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//We can use directly classname.class if class present in same package -if present in different package then use packagename.classname.class
//Once we used @Listeners annotation --it will keep watch on this class and intimate the MyListeners class according to condition --
//-- as Mylisteners class is implementing to ITestListener interface
//We can create the .xml file and from their also can provide Listerners Annotation to class and run it, instead giving to here in script directly

@Listeners(testNG5_Listeners.MyListeners.class) 
public class DWSValidLogin extends BaseTest{
	
	@Test
	public void validLogin() throws IOException, InterruptedException {
		
		WelcomePage welcomePage = new WelcomePage(driver); //Creating object of WelcomePage class-to access the elements located within it and click on login link
		welcomePage.getLoginLink().click();
		
		Flib flib = new Flib();
		String email = flib.readExcelData(EXCEL_PATH, DWSVALID, 1, 0); //To fetch email from excel sheet
		String password = flib.readExcelData(EXCEL_PATH, DWSVALID, 1, 4); //To fetch password from excel sheet  //intentionally failing the script-to capture failed screenshot
		
		LoginPage loginPage = new LoginPage(driver);  //Creating object of LoginPage class-to access the elements located within it and perform login
		loginPage.validLoginMethod(email, password);  //using method
	}
}