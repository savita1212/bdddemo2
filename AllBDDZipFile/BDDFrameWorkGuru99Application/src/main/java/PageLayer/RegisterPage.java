package PageLayer;

import static UtilityLayer.HandleDropDown.handleDropDown;
import static UtilityLayer.UtilsClass.click;
import static UtilityLayer.UtilsClass.sendKeys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class RegisterPage extends BaseClass {

	@FindBy(name= "firstName")
	private WebElement firstname;

	@FindBy(name= "lastName")
	private WebElement lastname;

	@FindBy(name = "phone")
	private WebElement Email;

	@FindBy(id = "userName")
	private WebElement phone;

	@FindBy(name = "address1")
	private WebElement address;

	@FindBy(name = "city")
	private WebElement city;

	@FindBy(name= "state")
	private WebElement state;

	@FindBy(name = "postalCode")
	private WebElement pincode;

	@FindBy(name= "country")
	private WebElement Country;

	@FindBy(name= "email")
	private WebElement username;

	@FindBy(name= "password")
	private WebElement password;

	@FindBy(name = "confirmPassword")
	private WebElement confpass;

	@FindBy(name = "submit")
	private WebElement submit;

	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}

	public void RegisterContactFunctionality(String fname, String lname, String email, String mob)
	{
      sendKeys(firstname,fname);
      sendKeys(lastname, lname);
      sendKeys(Email, email);
      sendKeys(phone, mob);
      }
	public void RegisterMailinginfoFunctionality(String add, String City,
			String State, String code, String country) 
	{
		sendKeys(address, add);
	      sendKeys(city, City);
	      sendKeys(state, State);
	      sendKeys(pincode, code);
	      handleDropDown(Country, country);
	}
	public void RegisteruserinfoFunctionality(String uname, String pass, String cpass)
	{
		sendKeys(username, uname);
	      sendKeys(password, pass);
	      sendKeys(confpass, cpass);
		
	}
	public void clickonsubmit() {
		 click(submit);
	}

}
