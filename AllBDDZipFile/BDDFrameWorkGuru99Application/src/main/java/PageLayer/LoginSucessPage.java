package PageLayer;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static UtilityLayer.UtilsClass.*;
import BaseLayer.BaseClass;

public class LoginSucessPage extends BaseClass{
	
	@FindBy(xpath="//h3[text()='Login Successfully']")
	private WebElement physicaltextliginsuccesfully;
	
	public LoginSucessPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String gettext()
	{
		return getText(physicaltextliginsuccesfully);
	}

}
