package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDef extends BaseClass{
	RegisterPage reg;
	@Given("user open a guru99 register page url")
	public void user_open_a_guru99_register_page_url() {
	    inialization();
	}

	@When("user enter firstname and lastname and emai and phone info")
	public void user_enter_firstname_and_lastname_and_emai_and_phone_info() {
	     reg=new RegisterPage ();
		reg.RegisterContactFunctionality("pooja", "dake","pooja@gmail.com","9999999999");
		
	}

	@Then("user enter address and city and state and Country info")
	public void user_enter_address_and_city_and_state_and_country_info() {
	   reg.RegisterMailinginfoFunctionality( "navi mumbai","mumbai", "maharastra", "431131", "INDIA");
	}

	@Then("user enter username and pass and confirmpass")
	public void user_enter_username_and_pass_and_confirmpass() {
	   reg.RegisteruserinfoFunctionality("pooja@123", "pooja123", "pooja123");
	}

	@Then("Click on submit button")
	public void click_on_submit_button() {
	    reg.clickonsubmit();
	}

}
