package org.PomPageObjectModuleFrmwork;

public class DWSInvalidLogin extends BaseTest{
	
	public static void main(String[] args) throws IOException {

		BaseTest bt = new BaseTest(); //Creating object of BaseTest class- to perform pre-requisites
		bt.browserSetup();
		
		WelcomePage welcomePage = new WelcomePage(driver); //Creating object of WelcomePage class-to access the elements and methods within it
		welcomePage.getLoginLink().click();
		
		Flib flib = new Flib();
		int rowCount = flib.lastRowCount(EXCEL_PATH, DWSINVALID);  //Accessing Flib class method to calculate rows present in excel sheet
		
		LoginPage loginPage = new LoginPage(driver);  //Creating object of LoginPage class-to access the elements and methods within it
		
		for(int i=0; i<=rowCount; i++)
		{
			String email = flib.readExcelData(EXCEL_PATH, DWSINVALID, i, 0); //To fetch email from excel sheet
			String password = flib.readExcelData(EXCEL_PATH, DWSINVALID, i, 1); //To fetch password from excel sheet
			loginPage.invalidLoginMethod(email, password);
		}
	}
}

}
