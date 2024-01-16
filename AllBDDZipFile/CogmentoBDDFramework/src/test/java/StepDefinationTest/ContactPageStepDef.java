package StepDefinationTest;

import BaseLayer.BaseClass;
import PageLayer.ContactPage;
import io.cucumber.java.en.Then;

public class ContactPageStepDef extends BaseClass {
	private ContactPage contactpage;

	@Then("click on contactPage and click on create and Enter Firstname, Enter MiddleName ,Enter Lastname,Enter Mail,Enter Status")
	public void click_on_contact_page_and_click_on_create_and_enter_firstname_enter_middle_name_enter_lastname_enter_mail_enter_status() {
		contactpage = new ContactPage();
		contactpage.ConatactPageFunctionality("Ajit", "Hanumantrao", "Pawar", "Ajit@gmail.com", "inactive");

	}

}
