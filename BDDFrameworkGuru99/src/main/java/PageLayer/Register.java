package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.baseclass;
import UtilsLayer.HandleDropdown;

public class Register extends baseclass {

	@FindBy(xpath = "//input[@name='firstName']")
	WebElement fname;
	@FindBy(xpath = "//input[@name='lastName']")
	WebElement lname;
	@FindBy(xpath = "//input[@name='phone']")
	WebElement phn;
	@FindBy(xpath = "//input[@name='userName']")
	WebElement email;
	@FindBy(xpath = "//input[@name='address1']")
	WebElement addr;
	@FindBy(xpath = "//input[@name='city']")
	WebElement city;
	@FindBy(xpath = "//input[@name='state']")
	WebElement state;
	@FindBy(xpath = "//input[@name='postalCode']")
	WebElement pcode;
	@FindBy(xpath = "//select[@name='country']")
	WebElement country;
	@FindBy(xpath = "//input[@name='email']")
	WebElement uname;
	@FindBy(xpath = "//input[@name='password']")
	WebElement pass;
	@FindBy(xpath = "//input[@name='confirmPassword']")
	WebElement cpass;
	@FindBy(xpath="//input[@name='submit']")
	WebElement button;

	public Register() {
		PageFactory.initElements(driver, this);
	}

	public void AddUserInfo(String firstname, String lastname, String phno, String mailid, String address,
			String cityname, String statename, String postcode, String countryname, String username, String password,
			String cpassword) {
		fname.sendKeys(firstname);
		lname.sendKeys(lastname);
		phn.sendKeys(phno);
		email.sendKeys(mailid);
		addr.sendKeys(address);
		city.sendKeys(cityname);
		state.sendKeys(statename);
		pcode.sendKeys(postcode);
//		Select sel=new Select(country);
//		sel.selectByVisibleText(countryname);
		HandleDropdown.selectByVisibletext(country, countryname);
		uname.sendKeys(username);
		pass.sendKeys(password);
		cpass.sendKeys(cpassword);
		button.click();
	}

}
