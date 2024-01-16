package StepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	static WebDriver driver;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("user enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();

	}

	@Then("user validate home page URL")
	public void user_validate_home_page_url() {
		String actualurl = driver.getCurrentUrl();

		Assert.assertEquals(actualurl.contains("hrm"), true);
	}

	@Then("user is on home page and validate home page title")
	public void user_is_on_home_page_and_validate_home_page_title() {

		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "OrangeHRM");

	}

	@When("user click on pim link")
	public void user_click_on_pim_link() {
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
	}

	@Then("validate user is on pim page")
	public void validate_user_is_on_pim_page() {
		String actualurl = driver.getCurrentUrl();
		Assert.assertEquals(actualurl.contains("pim"), true);
	}

	@Then("click on add employee")
	public void click_on_add_employee() {
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
	}

	@Then("user enter {string} and {string} and {string}")
	public void user_enter_and_and(String fname, String mname, String lname) throws InterruptedException {

		driver.findElement(By.name("firstName")).sendKeys(fname);
		driver.findElement(By.name("middleName")).sendKeys(mname);
		driver.findElement(By.name("lastName")).sendKeys(lname);
		Thread.sleep(5000);

	}

	@Then("click on save button")
	public void click_on_save_button() {
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
	}

}
