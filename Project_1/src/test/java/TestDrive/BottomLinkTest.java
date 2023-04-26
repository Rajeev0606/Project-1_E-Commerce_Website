package TestDrive;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseDrive.BaseClass;
import PageDrive.BottomlinkPage;
import PageDrive.LandingPage;

public class BottomLinkTest extends BaseClass {
	
	@Test(priority = 0)
	public void Bottomlink1() {
		
		LandingPage landingpage = new LandingPage(driver);
		landingpage.clickonUnitedStates();
		BottomlinkPage bottomlink = new BottomlinkPage(driver);
		bottomlink.verifythedisplayofAdvertisewithus();
		Assert.assertTrue(bottomlink.verifythedisplayofAdvertisewithus(), "Advertise with Us");
	}
	
	@Test(priority = 1)
	public void Bottomlink2() {
		
		LandingPage landingpage = new LandingPage(driver);
		landingpage.clickonUnitedStates();
		BottomlinkPage bottomlink = new BottomlinkPage(driver);
		bottomlink.verifythedisplayofAffiliateprogram();
		Assert.assertTrue(bottomlink.verifythedisplayofAffiliateprogram(), "Affiliate Program");
	}
	
	@Test(priority = 2)
	public void Bottomlink3() {
		
		LandingPage landingpage = new LandingPage(driver);
		landingpage.clickonUnitedStates();
		BottomlinkPage bottomlink = new BottomlinkPage(driver);
		bottomlink.verifythedisplayofDiscoverAndLearn();
		Assert.assertTrue(bottomlink.verifythedisplayofDiscoverAndLearn(), "Discover & Learn");
	}
	
	@Test(priority = 3)
	public void Bottomlink4() {
		
		LandingPage landingpage = new LandingPage(driver);
		landingpage.clickonUnitedStates();
		BottomlinkPage bottomlink = new BottomlinkPage(driver);
		bottomlink.verifythedisplayofProductrecalls();
		Assert.assertTrue(bottomlink.verifythedisplayofProductrecalls(), "Product Recalls");
	}
	
	@Test(priority = 4)
    public void Bottomlink5() {
		
		LandingPage landingpage = new LandingPage(driver);
		landingpage.clickonUnitedStates();
		BottomlinkPage bottomlink = new BottomlinkPage(driver);
		bottomlink.verifythedisplayofTradeInProgram();
		Assert.assertTrue(bottomlink.verifythedisplayofTradeInProgram(), "Trade-In Program");
	}
		

}
