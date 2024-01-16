package StepDefinationTest;

import org.junit.Assert;

import BaseLayer.BaseClass;
import PageLayer.HomePage;

import io.cucumber.java.en.When;

public class HomePageStepDef extends BaseClass {
	private HomePage homepage;

	@When("User On HomePage Validate HomePage Title")
	public void user_on_home_page_validate_home_page_title() {
		homepage = new HomePage();
		Assert.assertEquals(homepage.ContactPageTitle(), "Cogmento CRM");
	}

}
