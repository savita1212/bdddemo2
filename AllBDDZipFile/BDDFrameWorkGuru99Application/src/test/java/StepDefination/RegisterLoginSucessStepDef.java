package StepDefination;

import org.junit.Assert;

import BaseLayer.BaseClass;
import PageLayer.LoginSucessPage;
import io.cucumber.java.en.Then;

public class RegisterLoginSucessStepDef extends BaseClass
{
     @Then("Capture LoginSuccessfully physicalText")
	  public void capture_login_successfully_physical_text() {
		LoginSucessPage logsucess = new LoginSucessPage();
		String Actualtext = logsucess.gettext();
		Assert.assertEquals(Actualtext, "Login Successfully");
	}
}