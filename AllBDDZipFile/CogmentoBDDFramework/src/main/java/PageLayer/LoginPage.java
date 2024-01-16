package PageLayer;

import static UtilityLayer.UtilsClass.click;
import static UtilityLayer.UtilsClass.sendkeys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class LoginPage extends BaseClass {

	@FindBy(name = "email")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = "//div[text()='Login']")
	private WebElement LoginButton;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void LoinPageFunctionality(String User, String Pass) {

		sendkeys(username, User);
		sendkeys(password, Pass);
		click(LoginButton);
	}

}
