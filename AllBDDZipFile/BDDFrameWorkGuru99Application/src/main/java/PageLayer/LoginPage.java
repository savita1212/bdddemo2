package PageLayer;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static UtilityLayer.UtilsClass.*;
import BaseLayer.BaseClass;

public class LoginPage extends BaseClass{
	
	@FindBy(name="userName")
	 private WebElement Username;
	 
	 @FindBy(name="password")
	 private WebElement password2;
	 
	  @FindBy(name="submit")
	  private WebElement submit2;
	  
	  public LoginPage()
	  {
		  PageFactory.initElements(driver, this);
	  }

	  public String currunturl()
	  {
		  return getCurrunturl();
	  }
	  public void loginFunctionality(String uname,String pass)
	  {
		  sendKeys(Username, uname);
		  sendKeys(password2, pass);
	  }
	  public void clickonsubmit()
	  {
		  click(submit2);
	  }
}
