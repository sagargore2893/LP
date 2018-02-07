package com.silicus.LampsPlus.CommonMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	protected BowserActions actions;
	
	protected BasePage(WebDriver driver){
		PageFactory.initElements(driver, this);
		actions = new BowserActions(driver);
	}
	
	

}
