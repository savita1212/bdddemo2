package StepDefination;

import org.junit.Assert;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Then;


public class RegisterLoginStepDef extends BaseClass{
	 public static LoginPage log;
	@Then("Check valid LoginPage url")
	public void check_valid_login_page_url() {
		
		log=new LoginPage();
	String actualurl=log.currunturl();
	Assert.assertEquals(actualurl.contains("login"), true);
	}

	@Then("user enter username and password")
	public void user_enter_username_and_password() throws InterruptedException {
		Thread.sleep(5000);
	  log.loginFunctionality("pooja@123", "pooja123");
	}

	@Then("user click on LoginPage submit button")
	public void user_click_on_login_page_submit_button() {
	log.clickonsubmit();
	}
}
