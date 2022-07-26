package com.cast.GenericLibaray;

import java.util.Iterator;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;





public class WebDriverUtility {
	
	
	
	public void windowMaximize(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	
	
	public void waitUntilPageLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	public void waitForElementVisibility(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
	
	
	
	
	public void doubleClick(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.contextClick(element).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
	}
	
	
	
	
	public void scrollToWebElement(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		int y=element.getLocation().getY();
		js.executeScript("window.scrollBy(0,"+y+")", element);
	}
	

	
}
