package UtilityLayer;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class UtilsClass extends BaseClass{

	public static void sendKeys(WebElement wb,String value)
	{
		if(wb.isDisplayed()&&wb.isEnabled()) 
		{
			wb.sendKeys(value);
		}
	}
	
	public static void click(WebElement wb)
	{
		if(wb.isDisplayed()&&wb.isEnabled())
		{
			wb.click();
		}
	}
	
	public static String getCurrunturl()
	{
		return driver.getCurrentUrl();
	}
	
	public static String getCurrentTitle()
	{
		return driver.getTitle();
	}
	public static String getText(WebElement wb)
	{
		return wb.getText();
	}
}
