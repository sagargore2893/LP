package com.silicus.LampsPlus.Pagelibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.silicus.LampsPlus.CommonMethods.BasePage;


public class HomePage extends BasePage {
	
	WebDriver driver;
	
	

	@FindBy(css=".hpSlider")
	private WebElement splashImage;
	

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	
	public boolean splashImageIsDisplayed(){
		return splashImage.isDisplayed();
	}
	
	
	
}
