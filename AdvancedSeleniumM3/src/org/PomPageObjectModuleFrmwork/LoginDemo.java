package org.PomPageObjectModuleFrmwork;

   import java.io.IOException;

	public class AddToCart extends BaseTest{

		public static void main(String[] args) throws IOException {
			//To perform pre-requisites to launch browser and navigate to application
			BaseTest bt = new BaseTest();
			bt.browserSetup();
			
			//To click on login link element--located in welcome page
			WelcomePage welcomePage = new WelcomePage(driver);
			welcomePage.getLoginLink().click();
			
			//To fetch email and password from excel for valid login
			Flib flib = new Flib();
			String email = flib.readExcelData(EXCEL_PATH, DWSVALID, 1, 0);
			String password = flib.readExcelData(EXCEL_PATH, DWSVALID, 1, 1);
			
			//Accessing loginMethod from loginPage class
			LoginPage loginPage = new LoginPage(driver);
			loginPage.validLoginMethod(email, password);
			
			//To click on Electronics element--located in welcome page
			welcomePage.getElectronicsLink().click();
			
			//To add cellphone to cart
			ElectronicsPage electronicsPage = new ElectronicsPage(driver);
			electronicsPage.getCellPhonesLink().click();
			electronicsPage.getSmartphoneAddToCartButton().click();
			
			//To click on shopping cart--located in welcomepage
			welcomePage.getShoppingCartLink().click();
			
			//To check the product has been added to cart or not
			ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
			if(shoppingCartPage.getSmartphoneProduct().isDisplayed())
			{
				System.out.println("Product is added to cart.");
			}
			else
			{
				System.err.println("Product is not added to cart.");
			}
			
		}

	}

