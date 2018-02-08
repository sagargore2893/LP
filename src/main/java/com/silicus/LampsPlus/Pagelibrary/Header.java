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
	private WebElement blogLink;
	@FindBy(xpath="//div/ul[@id='siteShortcuts']/li[2]/div[1]/div/ul/li[3]/a/div[1]/div")
	private WebElement adviceAndTipsLink;

	@FindBy(xpath="//div/ul[@id='siteShortcuts']/li[3]/a")
	private WebElement storeLocationsLink;
	@FindBy(xpath="//div/ul[@id='siteShortcuts']/li[4]")
	private WebElement rateUsLink;
	@FindBy(xpath="//div/ul[@id='siteShortcuts']/li[5]")
	private WebElement chatLink;
	@FindBy(xpath="//div/ul[@id='siteShortcuts']/li[6]")
	private WebElement PhoneNumberLink;
	public Header(WebDriver driver) {
	 super(driver);
	}

	
	public void clickOnCreateAccountLink(){
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
