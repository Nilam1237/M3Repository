package org.PomPageObjectModuleFrmwork;

public class DWSValidLogin extends BaseTest{

	public static void main(String[] args) throws IOException {

		BaseTest bt = new BaseTest(); //Creating object of BaseTest class- to perform pre-requisites
		bt.browserSetup();
		
		WelcomePage welcomePage = new WelcomePage(driver); //Creating object of WelcomePage class-to access the elements located within it and click on login link
		welcomePage.getLoginLink().click();
		
		Flib flib = new Flib();
		String email = flib.readExcelData(EXCEL_PATH, DWSVALID, 1, 0); //To fetch email from excel sheet
		String password = flib.readExcelData(EXCEL_PATH, DWSVALID, 1, 1); //To fetch password from excel sheet
		
		LoginPage loginPage = new LoginPage(driver);  //Creating object of LoginPage class-to access the elements located within it and perform login
		loginPage.validLoginMethod(email, password);  //using method
		
//		loginPage.getEmailTextBox().sendKeys(email);
//		loginPage.getPasswordTextBox().sendKeys(password);
//		loginPage.getLoginButton().click();
	}
}
}
