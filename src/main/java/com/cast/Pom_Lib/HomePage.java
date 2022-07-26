package com.cast.Pom_Lib;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cast.GenericLibaray.WebDriverUtility;

public class HomePage extends WebDriverUtility{

	WebDriver driver;
	public HomePage(WebDriver driver) {
	
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//div[text()='From']/following-sibling::input")
	private WebElement sourcefiled;
	
	public WebElement getSourcefiled() {
		return sourcefiled;
	}
	@FindBy(xpath="//img[@class='ixigo-logo']")
	private WebElement img_logo;
	
	
	public WebElement getImg_logo() {
		return img_logo;
	}

	public void setImg_logo(WebElement img_logo) {
		this.img_logo = img_logo;
	}

	@FindBy(xpath="(//div[@class='city-row '])[1]")
	private WebElement fromLocation;
	
	public WebElement getFromLocation() {
		return fromLocation;
	}
	@FindBy(xpath="//div[text()='To']/following-sibling::input")
	private WebElement tofiled;
	

	public WebElement getTofiled() {
		
		return tofiled;
	}


	@FindBy(xpath="(//div[@class='dstn u-ib u-v-align-bottom u-text-left']/descendant::div[@class='text-cntr'])[1]")
	private WebElement toLocation;
	
	public WebElement getToLocation() {
		return toLocation;
	}
	@FindBy(xpath="(//input[@class='c-input u-v-align-middle'])[3]")
	private WebElement dept_Field;
	

	public WebElement getDept_Field() {
		return dept_Field;
	}

	

	@FindBy(xpath="(//div[text()='July 2022']/ancestor::div[@class='rd-month']/descendant::div[text()='26'])[2]")
	private WebElement depatureTime;
	
	public WebElement getDepatureTime() {
		return depatureTime;
	}
	
	@FindBy(xpath="(//input[@class='c-input u-v-align-middle'])[4]")
	private WebElement returnField;
	
	

	public WebElement getReturnField() {
		return returnField;
	}


	@FindBy(xpath="(//div[text()='August 2022']/following-sibling::table[@class='rd-days']//div[text()='23'])[2]")
	private WebElement returnTime;
	
	public WebElement getReturnTime() {
		return returnTime;
	}
	
	@FindBy(xpath="(//input[@class='c-input u-v-align-middle'])[5]")
	private WebElement travellerfield;

	@FindBy(xpath="(//span[text()='2'])[1]")
	private WebElement chooseTraveller;
	
	public WebElement getTravellerfield() {
		return travellerfield;
	}

	public void setTravellerfield(WebElement travellerfield) {
		this.travellerfield = travellerfield;
	}

	public WebElement getChooseTraveller() {
		return chooseTraveller;
	}

	public void setChooseTraveller(WebElement chooseTraveller) {
		this.chooseTraveller = chooseTraveller;
	}
   
	@FindBy(xpath="//button[text()='Search']")
	private WebElement btn_serach;
	

	public WebElement getBtn_serach() {
		return btn_serach;
	}
	

    @FindBy(xpath="(//div[@class='checkbox-list-item '])[1]")
    private WebElement btn_NonStops;
	
    public WebElement getBtn_NonStops() {
		return btn_NonStops;
	}

	
    
    @FindBy(xpath="//div[@class='result-wrpr']")
    private List<WebElement> flight_Details;
	
    public List<WebElement> getFlight_Details() {
		return flight_Details;
	}	
    
    @FindBy(xpath="(//div[@class='c-flight-listing-split-row selected hide-detail']//descendant::div[@class='c-price-display u-text-ellipsis '])[1]")
    private WebElement fare;
    
    
    
    
    public WebElement getFare() {
		return fare;
	}

	

	public void flightDetail()//Remaining part is I have to implement the condition less then 7000 ticket price  and separate the flight details.
    {
    	
    	String price=fare.getText();
    	System.out.println(price);
        int count=flight_Details.size();
    	for (int i = 0; i < count; i++) {
    		
    		 String text=flight_Details.get(i).getText();
    		 
    		 
    		 System.out.println(text);
			
		}
    }
    
    @FindBy(xpath="//div[text()='Stops']")
    private WebElement dis_stops;
	
    public WebElement getDis_stops() {
		return dis_stops;
	}
    
    @FindBy(xpath="//div[contains(text(),'Filter Selected')]")
    private WebElement dis_filter;
	

	
	public WebElement getDis_filter() {
		return dis_filter;
	}
    

	
	
}
