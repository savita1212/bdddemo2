package StepDefination;

import BaseLayer.baseclass;
import PageLayer.Register;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class register extends baseclass {

	@Given("user on regestor page")
	public void user_on_regestor_page() {
		baseclass.initilization();
	}

	@When("enter valid {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string} and {string} and submit")
	public void enter_valid_and_and_submit(String firstname, String lastname, String phno, String mailid,
			String address, String cityname, String statename, String postcode, String countryname, String username,
			String password, String cpassword) {
		Register reg = new Register();
		reg.AddUserInfo(firstname, lastname, phno, mailid, address, cityname, statename, postcode, countryname,
				username, password, cpassword);
	}
}
