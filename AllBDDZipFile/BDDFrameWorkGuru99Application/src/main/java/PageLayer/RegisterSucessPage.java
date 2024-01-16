package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static UtilityLayer.UtilsClass.*;
import BaseLayer.BaseClass;

public class RegisterSucessPage extends BaseClass {
	
	@FindBy(xpath="//a[text()=' sign-in ']")
	private WebElement link;
	
	public RegisterSucessPage()
	{
		PageFactory.initElements(driver, this);
	}
	public String curruntUrl()
	{
		return getCurrunturl();
	}
	public void clickonsigninlink()
	{
		click(link);
	}

}
