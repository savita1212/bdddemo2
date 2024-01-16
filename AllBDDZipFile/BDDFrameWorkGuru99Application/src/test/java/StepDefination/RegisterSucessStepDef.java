package StepDefination;

import org.junit.Assert;

import BaseLayer.BaseClass;
import PageLayer.RegisterSucessPage;
import io.cucumber.java.en.Then;


public class RegisterSucessStepDef extends BaseClass{
	RegisterSucessPage regsucess;
	@Then("valide regiser sucess pageurl")
	public void valide_regiser_sucess_pageurl() {
		 regsucess=new RegisterSucessPage();
		String ActualUrl= regsucess.curruntUrl();
		Assert.assertEquals(ActualUrl.contains("sucess"), true);
		
	}

	@Then("click on sign in link")
	public void click_on_sign_in_link() {
		regsucess.clickonsigninlink();
	}
}
