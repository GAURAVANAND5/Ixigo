package com.cast.TicketBookingTest;

import org.openqa.selenium.Keys;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


import com.cast.GenericLibaray.BaseClass;
import com.cast.Pom_Lib.HomePage;



import java.awt.AWTException;
 class IxigoTicketBookingTest extends BaseClass {
	
	@Test
	public void ticketBooking() throws InterruptedException, AWTException
	{
		HomePage hp= new HomePage(driver);
		String expectedtitle="ixigo: Free Cancellation on Flights, IRCTC Train Booking, Bus Booking";
        String hometitle=driver.getTitle();
        Assert.assertEquals(hometitle,expectedtitle);
        Reporter.log("Home page is dispalying",true);
        
		wLib.doubleClick(driver, hp.getSourcefiled());
		Actions action = new Actions(driver);
		
		Thread.sleep(2000);
		hp.getSourcefiled().sendKeys("DEL");
		hp.getFromLocation().click();
		action.sendKeys(Keys.ESCAPE);
		Thread.sleep(2000);
		hp.getImg_logo().click();
		hp.getTofiled().sendKeys("Bangalore");
		hp.getToLocation().click();
		Thread.sleep(5000);
		hp.getDept_Field().click();
		hp.getDepatureTime().click();
		Thread.sleep(2000);
		hp.getReturnField().click();
		
		Thread.sleep(2000);
		hp.getReturnTime().click();
		
		hp.getTravellerfield().click();
		
		hp.getChooseTraveller().click();
		
		hp.getBtn_serach().click();
		wLib.waitUntilPageLoad(driver);
		Thread.sleep(5000);
		String exptitle="Bengaluru - New Delhi, Economy Flights, roundtrip, 26 Jul - 23 Aug";
        String serachtitle=driver.getTitle();
        Assert.assertEquals(exptitle, serachtitle);
        Reporter.log(serachtitle+"=serach page is displaying",true);
        
        Thread.sleep(20000);
		hp.getBtn_NonStops().click();
		Thread.sleep(10000); 
		boolean txtstop = hp.getDis_filter().isDisplayed();
		Assert.assertEquals(txtstop, true);
		Reporter.log("Filter option is working for shops,Depature, airlines",true);
		Thread.sleep(5000);
		hp.flightDetail();
		
	}

	

}
