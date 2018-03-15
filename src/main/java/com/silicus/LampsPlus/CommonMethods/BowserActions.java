package com.silicus.LampsPlus.CommonMethods;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BowserActions {
	WebDriver driver;
	
	public BowserActions(WebDriver driver) {
		this.driver = driver;
	}

	public void applyDefaultImplicitWait(){
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void applyImplicitWait(long timeOutInSeconds){
		driver.manage().timeouts().implicitlyWait(timeOutInSeconds, TimeUnit.SECONDS);
	}
	
	public void waitElementToBeClickable(WebElement element, long timeOutInSeconds){
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public String randomEmailId()
	{
		Random randomemail =new Random();
		int randomInt = randomemail.nextInt(1000);
		String RandomEail = "user"+randomInt+"@mailinator.com";
		return RandomEail;
	}
	
  
	public void mouseOverHover(WebElement webElement){
		Actions action = new Actions(driver);
		action.moveToElement(webElement).build().perform();
	}
	
}
