package StepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EndToEndPIMPage {
	public static WebDriver driver;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@When("user enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() {

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
	}

	@Then("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}

	@When("user is on home page then validate home page logo")
	public void user_is_on_home_page_then_validate_home_page_logo() {

		boolean actualLogoStatus = driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
		Assert.assertTrue(actualLogoStatus);

	}

	@When("validate home page title")
	public void validate_home_page_title() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}

	@When("validate home page url")
	public void validate_home_page_url() {
		Assert.assertEquals(driver.getCurrentUrl().endsWith("dashboard/index"), true);
	}

	@When("user click on pim link")
	public void user_click_on_pim_link() {
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
	}

	@Then("user click on add employee button")
	public void user_click_on_add_employee_button() {
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
	}

	@Then("user enter {string} and {string} and {string}")
	public void user_enter_and_and(String fname, String mname, String lname) {
		driver.findElement(By.name("firstName")).sendKeys(fname);
		driver.findElement(By.name("middleName")).sendKeys(mname);
		driver.findElement(By.name("lastName")).sendKeys(lname);

	}

	@Then("click on save button")
	public void click_on_save_button() {

		driver.findElement(By.xpath("//button[text()=' Save ']")).click();

	}

	@After
	public static void takeScreenshot(Scenario scenario) {
		if (scenario.isFailed()) {
			byte[] abc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(abc, "image/png", scenario.getName());

		} else {
			byte[] abc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(abc, "image/png", scenario.getName());

		}
	}

	@AfterStep
	public void abc() throws InterruptedException {
		Thread.sleep(5000);
	}

}
