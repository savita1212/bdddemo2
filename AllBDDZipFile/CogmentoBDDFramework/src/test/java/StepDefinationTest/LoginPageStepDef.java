package StepDefinationTest;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDef extends BaseClass {

	private LoginPage loginpage;

	@Given("User should be on LoginPage")
	public void user_should_be_on_login_page() {
		initialization();
	}

	@When("User Enter Valid Username and Password")
	public void user_enter_valid_usename_and_password() {
		loginpage = new LoginPage();
		loginpage.LoinPageFunctionality("prafulp1010@gmail.com", "Pr@ful0812");

	}

	@Then("Click on Login")
	public void click_on_login() {
		System.out.println("user is Logged in");

	}

}
