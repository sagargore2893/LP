package com.silicus.LampsPlus.Pagelibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(css=".hpSlider")
	private WebElement splashImage;
	
	
	
	/**
	 * @param driver
	 */
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	
	public boolean splashImageIsDisplayed(){
		return splashImage.isDisplayed();
	}
	
}
