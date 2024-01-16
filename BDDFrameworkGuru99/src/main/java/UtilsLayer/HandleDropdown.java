package UtilsLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.baseclass;

public class HandleDropdown extends baseclass {

	public static void selectByVisibletext(WebElement wb,String value) {
		WebElement wbs=new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb));
		new Select(wbs).selectByVisibleText(value);
	}
	public static void selectByvalue(WebElement wb,String value) {
		WebElement wa=new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb));
		new Select(wa).selectByValue(value);
		
	}
	public static void selectByIndex(WebElement wb,int index) {
		WebElement wa=new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb));
		new Select(wa).selectByIndex(index);
		
	}
	public static void getOption(WebElement wb) {
		WebElement wa=new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb));
		List<WebElement>ls=new Select(wa).getOptions();
		for(WebElement ws:ls) {
			System.out.println(ws.getText());
		}
	}
	public static void getSize(WebElement wb) {
		WebElement wa=new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb));
		List<WebElement>ls=new Select(wa).getOptions();
		ls.size();
	}
	public static String checkSpecificValue(WebElement wb,String value) {
		WebElement wa=new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb));
		List<WebElement>ls=new Select(wa).getOptions();
		for(WebElement wd:ls) {
			if(wd.getText().equalsIgnoreCase(value)) {
				return wd.getText();
			}
		}return null;
	}
	public static String getFirstselectedOption(WebElement wb) {
	WebElement wa=new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb));
	return new Select(wa).getFirstSelectedOption().getText();	
	}	
}