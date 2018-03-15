package com.silicus.LampsPlus.Pagelibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.silicus.LampsPlus.CommonMethods.BasePage;

public class MainNavigationCategoryPage extends BasePage{

	//Main Navigation Category
	@FindBy(css="#nav>#chandeliers>a")
	private WebElement chandeliers;
	@FindBy(css="#nav>#ceilingLighting>a")
	private WebElement ceilingLighting;
	@FindBy(css="#nav>#lamps>a")
	private WebElement lamps;
	@FindBy(css="#nav>#wallLights>a")
	private WebElement wallLights;
	@FindBy(css="#nav>#outdoor>a")
	private WebElement outdoor;
	@FindBy(css="#nav>#fans>a")
	private WebElement fans;
	@FindBy(css="#nav>#furniture>a")
	private WebElement furniture;
	@FindBy(css="#nav>#homeDecor>a")
	private WebElement homeDecor;

	
	public MainNavigationCategoryPage(WebDriver driver) {
		super(driver);
	}
	
	
	//Mouse Over hover on main category methods
	public void overHoverOnChandeliers(){
		actions.mouseOverHover(chandeliers);
	}
	public void overHoverOnceilingLighting(){
		actions.mouseOverHover(ceilingLighting);
	}
	public void overHoverOnlamps(){
		actions.mouseOverHover(lamps);
	}
	public void overHoverOnwallLights(){
		actions.mouseOverHover(wallLights);
	}
	public void overHoverOnoutdoor(){
		actions.mouseOverHover(outdoor);
	}
	public void overHoverfans(){
		actions.mouseOverHover(fans);
	}
	public void overHoverfurniture(){
		actions.mouseOverHover(furniture);
	}
	public void overHoverhomeDecor(){
		actions.mouseOverHover(homeDecor);
	}
	
	//Click on main category methods
	public void clickOnchandeliers(){
		chandeliers.click();
	}
    public void clickOnceilingLighting(){
    	ceilingLighting.click();
	}
    public void clickOnlamps(){
    	lamps.click();
	}
    public void clickOnwallLights(){
    	wallLights.click();
	}
    public void clickOnoutdoor(){
    	outdoor.click();
	}
    public void clickOnfans(){
    	fans.click();
	}
    public void clickOnfurniture(){
    	furniture.click();
	}
    public void clickOnhomeDecor(){
    	homeDecor.click();
	}


}
