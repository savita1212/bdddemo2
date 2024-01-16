package UtilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass {

	public static void findElements(List<WebElement> ls, String Value) {
		for (WebElement abc : ls) {
			String a = abc.getText();
			if (a.equalsIgnoreCase(Value)) {
				abc.click();
			}
		}
	}

}
