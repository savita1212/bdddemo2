package PageLayer;

import static UtilityLayer.UtilsClass.click;
import static UtilityLayer.UtilsClass.sendkeys;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import static UtilityLayer.UtilsClass.*;
import static UtilityLayer.HandleDropDown.*;

public class ContactPage extends BaseClass {

	@FindBy(xpath = "//i[@class='users icon']")
	private WebElement contactButton;

	@FindBy(xpath = "(//span[text()='Contacts'])[2]")
	private WebElement contact;
	@FindBy(xpath = "//button[text()='Create']")
	private WebElement createContact;

	@FindBy(name = "first_name")
	private WebElement fname;

	@FindBy(name = "middle_name")
	private WebElement mname;

	@FindBy(name = "last_name")
	private WebElement lname;

	@FindBy(name = "status")
	private WebElement status;

	@FindBy(xpath = "//div[@name='status']")
	private List<WebElement> AllStatus;

	@FindBy(xpath = "//button[text()='Save']")
	private WebElement save;
	@FindBy(name="value")
	private WebElement Email;

	public ContactPage() {
		PageFactory.initElements(driver, this);
	}

	public void ConatactPageFunctionality(String Fname, String Mname, String Lname,String email, String Status) {

		click(contactButton);
		click(createContact);
		sendkeys(fname, Fname);
		sendkeys(mname, Mname);
		sendkeys(lname, Lname);
		sendkeys(Email, email);
		click(status);
		findElements(AllStatus, Status);
		click(save);
	}

}
