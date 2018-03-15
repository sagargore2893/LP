package com.silicus.LampsPlus.Pagelibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.silicus.LampsPlus.CommonMethods.BasePage;


public class Header extends BasePage{
WebDriver driver;
	
//Header Elements
	@FindBy(id="hdrSignIn")
	private WebElement signIn;
	@FindBy(linkText="Create Account")
	private WebElement createAccountLink;
	@FindBy(className="freeShipping")
	private WebElement freeShippingHeader ;
	@FindBy(css=".portalLinks>li>span>a")
	private WebElement lpobSiteLink;
	@FindBy(id="logo")
	private WebElement sitelogo;
	@FindBy(id="search")
	private WebElement searchBox;
	@FindBy(id="searchBtn")
	private WebElement searchButton ;
	@FindBy(id="yourPortfolio")
	private WebElement wishList;
	@FindBy(id="yourCart")
	private WebElement cart;
	@FindBy(id="yourCheckoutButton")
	private WebElement checkoutButton;

	//Sale dropdown
	@FindBy(xpath="//div/ul[@id='siteShortcuts']/li[1]")
	private WebElement saleCallOut;
	@FindBy(xpath="//div/ul[@id='siteShortcuts']/li[1]/div[1]/div/ul/li[1]/a/div[1]")
	private WebElement saleLink;	
	@FindBy(xpath="//div/ul[@id='siteShortcuts']/li[1]/div[1]/div/ul/li[2]/a/div[1]")
	private WebElement dailySaleLink;
	@FindBy(xpath="//div/ul[@id='siteShortcuts']/li[1]/div[1]/div/ul/li[3]/a/div[1]")
	private WebElement clearanceLink;
	@FindBy(xpath="//div/ul[@id='siteShortcuts']/li[1]/div[1]/div/ul/li[4]/a/div[1]")
	private WebElement openBoxLink;

	//Shop by Room dropdown
	@FindBy(xpath="//div/ul[@id='siteShortcuts']/li[2]/div")
	private WebElement shopByRoomCallout;	
	@FindBy(xpath="//div/ul[@id='siteShortcuts']/li[2]/div[1]/div/ul/li[1]/a/div[1]")
	private WebElement roomInsipirationLink;
	@FindBy(xpath="//div/ul[@id='siteShortcuts']/li[2]/div[1]/div/ul/li[2]/a/div[1]")
	private WebElement shopByTrendLink;
	@FindBy(xpath="//div/ul[@id='siteShortcuts']/li[2]/div[1]/div/ul/li[3]/a/div[1]")
	private WebElement ideaAndAdviceLink;
//	@FindBy(xpath="//div/ul[@id='siteShortcuts']/li[2]/div[1]/div/ul/li[3]/a/div[1]/div")
//	private WebElement adviceAndTipsLink;

	@FindBy(xpath="//div/ul[@id='siteShortcuts']/li[3]/a")
	private WebElement storeLocationsLink;
	@FindBy(xpath="//li[@class='locateStore group']/div[1]")
	private WebElement locateStoreText;
	@FindBy(xpath="//li/input[@class='locateStoreInput']")
	private WebElement zipCodeInputBox;
	@FindBy(xpath="//li/button[@class='findStore']")
	private WebElement submitStoreButton;
	@FindBy(xpath="//li[@class='locateStore group']/div[2]/a")
	private WebElement viewAllStores;
	
	
	@FindBy(xpath="//div/ul[@id='siteShortcuts']/li[4]")
	private WebElement rateUsLink;
	@FindBy(xpath="//div/ul[@id='siteShortcuts']/li[5]")
	private WebElement chatLink;
	@FindBy(xpath="//div/ul[@id='siteShortcuts']/li[6]")
	private WebElement PhoneNumberLink;

	
	public Header(WebDriver driver) {
	 super(driver);
	}

    // SIGN IN, CREATE ACCOUNT, FREE SHIPPING, LPOB SITE
	public void clickOnCreateAccountLink(){
		createAccountLink.click();
	}
	public void clickOnSignIn(){
		signIn.click();
	}
	public void clickOnFreeShippingHeader(){
		freeShippingHeader.click();
	}
	public boolean isDisplayedFreeShippingHeader(){
		return freeShippingHeader.isDisplayed();
	}
	public void clickOnLpobSiteLink(){
		lpobSiteLink.click();
	}
	
	//SITE LOGO
	public boolean isDisplayedLpLogo(){
		return sitelogo.isDisplayed();
	}
	public void clickOnsitelogo(){
		sitelogo.click();
	}
	
    //SERACH
	public void searchFromSite(String searchTerm){
		searchBox.sendKeys(searchTerm);
		searchButton.click();
	}
	
    // WISHLIST CART CHECKOUT   
	public void clickOnWishList(){
		wishList.click();
	}
	public void clickOnCart(){
		cart.click();
	}
	public void clickOnCheckout(){
		checkoutButton.click();
	}
	
	//PHONE NUMBER,CHAT,RATE US
	public void clickOnPhoneNumber(){
		PhoneNumberLink.click();
	}
	public void clickOnChat(){
		chatLink.click();
	}
	public void clickOnRateUs(){
		rateUsLink.click();
	}
	

	//STORE
	public boolean isDisplayedLoacteStore(){
		return locateStoreText.isDisplayed();
	}
	public void locateStoreByZipCode(String zip){
		actions.mouseOverHover(storeLocationsLink);
		zipCodeInputBox.sendKeys(zip);
		submitStoreButton.click();
	}
	public void clickOnViewAllStores(){
		actions.mouseOverHover(storeLocationsLink);
		viewAllStores.click();
	}
	
	//SHOP BY ROOM/TREND, Ideas and advice
	public void clickOnRoomInspiration(){
		actions.mouseOverHover(shopByRoomCallout);
		roomInsipirationLink.click();
	}
	public void clickOnShopByTrend(){
		actions.mouseOverHover(shopByRoomCallout);
		shopByTrendLink.click();
	}
	public void clickOnIdeasAndAdvice(){
		actions.mouseOverHover(shopByRoomCallout);
		ideaAndAdviceLink.click();
	}
//	public void clickOnAdviceAndTips(){
//		actions.mouseOverHover(shopByRoomCallout);
//		adviceAndTipsLink.click();
//	}
	
	//SALE,CLEARANCE,DAILYSALE,OB
	public void clickOnSale(){
		actions.mouseOverHover(saleCallOut);
		saleLink.click();
	}
	public void clickOnDailySales(){
		actions.mouseOverHover(saleCallOut);
		dailySaleLink.click();
	}
	public void clickOnClearance(){
		actions.mouseOverHover(saleCallOut);
		clearanceLink.click();
	}
	public void clickOnOpenbox(){
		actions.mouseOverHover(saleCallOut);
		openBoxLink.click();
	}
	
}
