package com.silicus.LampsPlus.Pagelibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.silicus.LampsPlus.CommonMethods.BasePage;

public class Chandeliers_SubCategoryPage extends BasePage{
	
	//Sub-Category links from Chandeliers
		@FindBy(xpath="//div[@id='chandeliers']/div/ul[1]/li[1]/dl/dt")
		private WebElement nav_Chandeliers;
		@FindBy(xpath="//div[@id='chandeliers']/div/ul[1]/li[1]/dl/dd[1]")
		private WebElement allChandeliers;
		@FindBy(xpath="//div[@id='chandeliers']/div/ul[1]/li[1]/dl/dd[2]")
		private WebElement crystalChandeliers ;
		@FindBy(xpath="//div[@id='chandeliers']/div/ul[1]/li[1]/dl/dd[3]")
		private WebElement diningAndLivingRoom;
		@FindBy(xpath="//div[@id='chandeliers']/div/ul[1]/li[1]/dl/dd[4]")
		private WebElement entryway;
		@FindBy(xpath="//div[@id='chandeliers']/div/ul[1]/li[1]/dl/dd[5]")
		private WebElement miniChandeliers;
		@FindBy(xpath="//div[@id='chandeliers']/div/ul[1]/li[1]/dl/dd[6]")
		private WebElement islandLights;
		@FindBy(xpath="//div[@id='chandeliers']/div/ul[1]/li[1]/dl/dd[7]")
		private WebElement pendantChandeliers;
		@FindBy(xpath="//div[@id='chandeliers']/div/ul[1]/li[2]/dl/dt[1]")
		private WebElement nav_pendantLighting;
		@FindBy(xpath="//div[@id='chandeliers']/div/ul[1]/li[2]/dl/dd[1]")
		private WebElement allPendants;
		@FindBy(xpath="//div[@id='chandeliers']/div/ul[1]/li[2]/dl/dd[2]")
		private WebElement miniPendants;
		@FindBy(xpath="//div[@id='chandeliers']/div/ul[1]/li[2]/dl/dd[3]")
		private WebElement swagLights;
		@FindBy(xpath="//div[@id='chandeliers']/div/ul[1]/li[2]/dl/dd[4]")
		private WebElement designYourOwnPendantLight;
		@FindBy(xpath="//div[@id='chandeliers']/div/ul[1]/li[2]/dl/dt[2]")
		private WebElement lightingFixtures;
		@FindBy(xpath="//div[@id='chandeliers']/div/ul[1]/li[2]/dl/dd[5]")
		private WebElement allLightingFixtures;
		@FindBy(xpath="//div[@id='chandeliers']/div/ul[2]/li/dl/dt")
		private WebElement moreToConsiderText;
		@FindBy(xpath="//div[@id='chandeliers']/div/ul[2]/li/dl/dd[1]")
		private WebElement chandelierShades;
		@FindBy(xpath="//div[@id='chandeliers']/div/ul[2]/li/dl/dd[2]")
		private WebElement poolTableLights;
		@FindBy(xpath="//div[@id='chandeliers']/div/ul[2]/li/dl/dd[3]")
		private WebElement ceilingMedallions;
		@FindBy(xpath="//div[@id='chandeliers']/div/ul[2]/li/dl/dd[4]")
		private WebElement dimmersAndControls;
		@FindBy(xpath="//div[@id='chandeliers']/div/ul[2]/li/dl/dd[5]")
		private WebElement lightBulbs;
		@FindBy(xpath="//div[@id='chandeliers']/div/ul[2]/li/dl/dd[6]")
		private WebElement lightingCollections;

	public Chandeliers_SubCategoryPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickOnNav_Chandeliers(){
		nav_Chandeliers.click();
	}
	public void clickOnAllChandeliers(){
		allChandeliers.click();
	}
	public void clickOnCrystalChandeliers(){
		crystalChandeliers.click();
	}
	public void clickOnDiningAndLivingRoom(){
		diningAndLivingRoom.click();
	}
	public void clickOnEntryway(){
		entryway.click();
	}
	public void clickOnMiniChandeliers(){
		miniChandeliers.click();
	}
	public void clickOnIslandLights(){
		islandLights.click();
	}
	public void clickOnPendantChandeliers(){
		pendantChandeliers.click();
	}
	public void clickOnNav_pendantLighting(){
		nav_pendantLighting.click();
	}
	public void clickOnAllPendants(){
		allPendants.click();
	}
	public void clickOnMiniPendants(){
		miniPendants.click();
	}
	public void clickOnSwagLights(){
		swagLights.click();
	}
	public void clickOnDesignYourOwnPendantLight(){
		designYourOwnPendantLight.click();
	}
	public void clickOnLightingFixtures(){
		lightingFixtures.click();
	}
	public void clickOnAllLightingFixtures(){
		allLightingFixtures.click();
	}
	public boolean isDisplayedMoreToConsiderText(){
		return moreToConsiderText.isDisplayed();
	}
	public void clickOnChandelierShades(){
		chandelierShades.click();
	}
	public void clickOnPoolTableLights(){
		poolTableLights.click();
	}
	public void clickOnCeilingMedallions(){
		ceilingMedallions.click();
	}
	public void clickOnDimmersAndControls(){
		dimmersAndControls.click();
	}
	public void clickOnLightBulbs(){
		lightBulbs.click();
	}
	public void clickLightingCollections(){
		lightingCollections.click();
	}

}
