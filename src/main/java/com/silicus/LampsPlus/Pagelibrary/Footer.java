package com.silicus.LampsPlus.Pagelibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.silicus.LampsPlus.CommonMethods.BasePage;

public class Footer extends BasePage{

	@FindBy(xpath="//div[@id='lblStandardFooter']/div[2]")
	private WebElement disclaimer; 
	@FindBy(xpath="//div[@id='ftrContact']/div/div[1]/span[2]")
	private WebElement phoneText;
	@FindBy(xpath="//div[@id='ftrContact']/div/div[2]")
	private WebElement footerLiveChat;
	@FindBy(xpath="//div[@id='ftrContact']/div/div[3]")
	private WebElement footerEmailUs  ;
	@FindBy(xpath="//div[@id='ftrSubscribe']/form/strong")
	private WebElement subscribeText;
	@FindBy(xpath="//div[@id='ftrSubscribe']/form/fieldset/div/input[@id='txtEmailUpdatesRequest']")
	private WebElement subscribeEmail;
	@FindBy(xpath="//div[@id='ftrSubscribe']/form/fieldset/input[@id='ftrSubscribeBtn']")
	private WebElement footerSubscribeSubmitBtn;
	@FindBy(xpath="//div[@id='ftrSubscribe']/form/fieldset/div/div")
	private WebElement subemialError;
	@FindBy(xpath="//div[@id='ftrSubscribe']/a")
	private WebElement emailSettings;
	
	
	@FindBy(xpath="//div[@id='ftrLinkList']/dl[1]/dt")
	private WebElement ourCompany;
	@FindBy(xpath="//div[@id='ftrLinkList']/dl[1]/dd[1]")
	private WebElement aboutLampsPLus;
	@FindBy(xpath="//div[@id='ftrLinkList']/dl[1]/dd[2]")
	private WebElement contactUs;
	@FindBy(xpath="//div[@id='ftrLinkList']/dl[1]/dd[3]")
	private WebElement tradeProgram;
	@FindBy(xpath="//div[@id='ftrLinkList']/dl[1]/dd[4]")
	private WebElement careers;
	@FindBy(xpath="//div[@id='ftrLinkList']/dl[1]/dd[5]")
	private WebElement privacyPolicy;
	
	
	@FindBy(xpath="//div[@id='ftrLinkList']/dl[2]/dt")
	private WebElement ourStores;
	@FindBy(xpath="//div[@id='ftrLinkList']/dl[2]/dd[1]")
	private WebElement storeLocator;
	@FindBy(xpath="//div[@id='ftrLinkList']/dl[2]/dd[2]")
	private WebElement installationServices;
	@FindBy(xpath="//div[@id='ftrLinkList']/dl[2]/dd[3]")
	private WebElement inHomeConsultation;
	@FindBy(xpath="//div[@id='ftrLinkList']/dl[2]/dd[4]")
	private WebElement storeCoupans;
	@FindBy(xpath="//div[@id='ftrLinkList']/dl[2]/dd[5]")
	private WebElement newHomeOwnerSavings;
	
	
	@FindBy(xpath="//div[@id='ftrLinkList']/dl[3]/dt")
	private WebElement help;
	@FindBy(xpath="//div[@id='ftrLinkList']/dl[3]/dd[1]")
	private WebElement customerService;
	@FindBy(xpath="//div[@id='ftrLinkList']/dl[3]/dd[2]")
	private WebElement orderStatus;
	@FindBy(xpath="//div[@id='ftrLinkList']/dl[3]/dd[3]")
	private WebElement faqs;
	@FindBy(xpath="//div[@id='ftrLinkList']/dl[3]/dd[4]")
	private WebElement returnPolicy;
	@FindBy(xpath="//div[@id='ftrLinkList']/dl[3]/dd[5]")
	private WebElement shippingInformation;
	@FindBy(xpath="//div[@id='ftrLinkList']/dl[3]/dd[6]")
	private WebElement manageAccount;
	
	
	@FindBy(xpath="//div[@id='ftrLinkList']/dl[4]/dt")
	private WebElement resources;
	@FindBy(xpath="//div[@id='ftrLinkList']/dl[4]/dd[1]")
	private WebElement footerIdeasAndAdvice;
//	@FindBy(xpath="//div[@id='ftrLinkList']/dl[4]/dd[2]")
//	private WebElement footerAdviceandTips;
	@FindBy(xpath="//div[@id='ftrLinkList']/dl[4]/dd[2]")
	private WebElement catalogs;
	@FindBy(xpath="//div[@id='ftrLinkList']/dl[4]/dd[3]")
	private WebElement siteMap;
	@FindBy(xpath="//div[@id='ftrLinkList']/dl[4]/dd[4]")
	private WebElement termOfUse;
	@FindBy(xpath="//div[@id='ftrLinkList']/dl[4]/dd[5]")
	private WebElement caTransparancyAct;
	
	
	@FindBy(xpath="//div[@id='ftrLinkList']/ul/li[1]")
	private WebElement proLogo;
	@FindBy(xpath="//div[@id='ftrLinkList']/ul/li[3]")
	private WebElement hospitalityLogo;
	
	//Footer Last Line elements
	@FindBy(xpath="//div[@id='ftrLegal']/table/tbody/tr/td[1]/span/a")
	private WebElement footerLightingRetailerLink;
	@FindBy(xpath="//div[@id='ftrLegal']/table/tbody/tr/td[1]/span/span")
	private WebElement footer2018Text;
	
	//Social Media icons Elements
	@FindBy(xpath="//div[@id='ftrLegal']/table/tbody/tr/td[3]/a[1]")
	private WebElement pinterest;
	@FindBy(xpath="//div[@id='ftrLegal']/table/tbody/tr/td[3]/a[2]")
	private WebElement instagram;
	@FindBy(xpath="//div[@id='ftrLegal']/table/tbody/tr/td[3]/a[3]")
	private WebElement facebook;
	@FindBy(xpath="//div[@id='ftrLegal']/table/tbody/tr/td[3]/a[4]")
	private WebElement twitter;
	@FindBy(xpath="//div[@id='ftrLegal']/table/tbody/tr/td[3]/a[5]")
	private WebElement houzz;
	@FindBy(xpath="//div[@id='ftrLegal']/table/tbody/tr/td[3]/a[6]")
	private WebElement googlePlus;
	@FindBy(xpath="//div[@id='ftrLegal']/table/tbody/tr/td[3]/a[7]")
	private WebElement youTube;
	
	public Footer(WebDriver driver) {
		super(driver);
	}
	
	public boolean isDisplayedDisclaimer(){
		return disclaimer.isDisplayed();
	}
	public boolean isDisplayedPhoneText(){
		return phoneText.isDisplayed();
	}
	public void clickOnFooterLiveChat(){
		footerLiveChat.click();
	}
	public void clickOnFooterEmailUs(){
		footerEmailUs.click();
	}
	
	//Subscribe and email s
	public boolean isDisplyedSubscribeText(){
		return subscribeText.isDisplayed();
	}
	public String getSubscribeText(){
		return subscribeText.getText().trim();
	}
	public void emailSubscription(String email){
		subscribeEmail.sendKeys(email);
		footerSubscribeSubmitBtn.click();
	}
	public String getFieldValidationmsg(){
		return subemialError.getText().trim();
	}
	public void clickOnEmailSettings(){
		emailSettings.click();
	}
	
   //OUR COMPANY -FOOTER
	public boolean isDisplayedOurCompany(){
		return ourCompany.isDisplayed();
	}
	public void clickOnAboutLampsPlus(){
		aboutLampsPLus.click();
	}
	public void clickOnContactUs(){
		contactUs.click();
	}
	public void clickOnTradProgarm(){
		tradeProgram.click();
	}
	public void clickOnCareers(){
		careers.click();
	}
	public void clickOnPrivacyPolicy(){
		privacyPolicy.click();
	}
	
	//OUR STORES FOOTER
	public boolean isDisplayedOurStores(){
		return ourStores.isDisplayed();
	}
	public void clicOnStoreLocator(){
		storeLocator.click();
	}
    public void clicOnInstallationServices(){
		installationServices.click();
	}
    public void clicOnInHomeConsultation(){
		inHomeConsultation.click();
	}
    public void clicOnStoreCoupans(){
		storeCoupans.click();
	}
    public void clicOnNewHomeownerSavings(){
		newHomeOwnerSavings.click();
	}

	//HELP- FOOTER
	public boolean isDisplayedHelp(){
		return help.isDisplayed();
	}
	public void clicOnCustomeService(){
		customerService.click();
	}
	public void clicOnOrderStatus(){
		orderStatus.click();
	}
	public void clicOnFaqs(){
		faqs.click();
	}
	public void clicOnReturnPolicy(){
		returnPolicy.click();
	}
	public void clicOnShippingInformation(){
		shippingInformation.click();
	}
	public void clicOnManageAccount(){
		manageAccount.click();
	}
	
	
	//RESOURCES -FOOTER
	public boolean isDisplayedResources(){
		return resources.isDisplayed();
	}
    public void clicOnIdeasAndService(){
		footerIdeasAndAdvice.click();
	}
    public void clicOnCatalogs(){
		catalogs.click();
	}
	public void clicOnSiteMap(){
		siteMap.click();
	}
	public void clicOnTermsOfUse(){
		termOfUse.click();
	}
	public void clicOnCATransperncyAct(){
		caTransparancyAct.click();
	}
	
	//Footer siteLogo
	public boolean isDisplayedProfessionalLogo() {
		return proLogo.isDisplayed();
	}
	public void clickOnProLogo() {
		proLogo.click();
	}
	public boolean isDisplayedLPHLogo() {
		return hospitalityLogo.isDisplayed();
	}
	public void clickOnLPHLogo() {
		hospitalityLogo.click();
	}
	
	//footer Last line copy
	public boolean isDisplayedFooterLightingRetailerLink() {
		return footerLightingRetailerLink.isDisplayed();
	}
	public void clickOnFooterLightingRetailer() {
		footerLightingRetailerLink.click();
	}
	public boolean isDisplayedFooter2018Text() {
		return footer2018Text.isDisplayed();
	}
	
	//Social Media Icons
	public void clickOnPinterest() {
		pinterest.click();
	}
	public void clickOnInstagram() {
		instagram.click();
	}
	public void clickOnFacebook() {
		facebook.click();
	}
	public void clickOnTwitter() {
		twitter.click();
	}
	public void clickOnHouzz() {
		houzz.click();
	}
	public void clickOnGooglePlus() {
		googlePlus.click();
	}
	public void clickOnYoutube() {
		youTube.click();
	}
	
}
