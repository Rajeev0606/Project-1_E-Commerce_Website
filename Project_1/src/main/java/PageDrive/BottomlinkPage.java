package PageDrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDrive.UtilityClass;


public class BottomlinkPage extends UtilityClass {
	
	WebDriver driver;

	public BottomlinkPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Trade-In Program")
	WebElement TradeInProgram;
	
	@FindBy(linkText="Advertise with Us")
	WebElement Advertisewithus;
	
	@FindBy(linkText="Product Recalls")
	WebElement Productrecalls;
	
	@FindBy(linkText="Affiliate Program")
	WebElement AffiliateProgram;
	
	@FindBy(linkText="Discover & Learn")
	WebElement DiscoverandLearn;
	
    public boolean verifythedisplayofTradeInProgram() {
		
    	return TradeInProgram.isDisplayed();
	}
	
    public boolean verifythedisplayofAdvertisewithus() {
		
    	return Advertisewithus.isDisplayed();
	}
    
    public boolean verifythedisplayofProductrecalls() {
		
    	return Productrecalls.isDisplayed();
	}
    
    public boolean verifythedisplayofAffiliateprogram() {
		
    	return AffiliateProgram.isDisplayed();
	}
    
    public boolean verifythedisplayofDiscoverAndLearn() {
		
    	return DiscoverandLearn.isDisplayed();
	} 
	


}
