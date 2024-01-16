package UtilityLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseLayer.BaseClass;

public class ActionsClass extends BaseClass {

	public static void MoveToElement(WebElement wb) {
		if (wb.isDisplayed() && wb.isEnabled()) {
			new Actions(driver).moveToElement(wb).build().perform();
		}
	}

}
