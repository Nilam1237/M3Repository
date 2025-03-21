package pomPackage;

import org.checkerframework.checker.formatter.qual.ReturnsFormat;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	@FindBy(linkText = "Register")private WebElement registerLink;
	@FindBy(linkText = "Log in")private WebElement loginLink;
	@FindBy(xpath = "//span[text()='Shopping cart']")private WebElement shoppingCartLink;
    @FindBy(xpath = "//span[text()='Wishlist']")private WebElement wishListLink;
    @FindBy(partialLinkText = "BOOKS")private WebElement booksLink;
    @FindBy(partialLinkText = "COMPUTERS")private WebElement computersLink;
    @FindBy(partialLinkText = "ELECTRONICS")private WebElement electronicsLink;
    @FindBy(linkText = "Log out")private WebElement logOutLink;
    
    
    //Initialization
    public WelcomePage(Webdriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public WebElement getregisterLink()
    {
    	returns registerLink;
    }
    
    public void logout()
    {
    	logOutLink.click();
    }

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}

	public WebElement getWishListLink() {
		return wishListLink;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getComputersLink() {
		return computersLink;
	}

	public WebElement getElectronicsLink() {
		return electronicsLink;
	}
    
    
    
    
    
    
    
    
	/*
	 * //Declaration
	 * 
	 * @FindBy(linkText = "Register") private WebElement registerLink;
	 * 
	 * @FindBy(linkText = "Log in") private WebElement loginLink;
	 * 
	 * @FindBy(linkText = "Shopping cart") private WebElement shoppingCartLink;
	 * 
	 * @FindBy(linkText = "Wishlist") private WebElement wishlistLink;
	 * 
	 * @FindBy(partialLinkText = "BOOKS") private WebElement booksLink;
	 * 
	 * @FindBy(partialLinkText = "COMPUTERS") private WebElement computersLink;
	 * 
	 * @FindBy(partialLinkText = "ELECTRONICS") private WebElement electronicsLink;
	 * 
	 * @FindBy(partialLinkText = "APPAREL & SHOES") private WebElement
	 * apparelAndShoesLink;
	 * 
	 * //Initialization public WelcomePage(WebDriver driver) {
	 * PageFactory.initElements(driver, this); }
	 * 
	 * //Utilization public WebElement getRegisterLink() { return registerLink; }
	 * 
	 * public WebElement getLoginLink() { return loginLink; }
	 * 
	 * public WebElement getShoppingCartLink() { return shoppingCartLink; }
	 * 
	 * public WebElement getWishlistLink() { return wishlistLink; }
	 * 
	 * public WebElement getBooksLink() { return booksLink; }
	 * 
	 * public WebElement getComputersLink() { return computersLink; }
	 * 
	 * public WebElement getElectronicsLink() { return electronicsLink; }
	 * 
	 * public WebElement getApparelAndShoesLink() { return apparelAndShoesLink; }
	 * 
	 */}