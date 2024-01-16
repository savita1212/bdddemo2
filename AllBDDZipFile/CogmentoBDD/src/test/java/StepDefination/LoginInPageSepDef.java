package StepDefination;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.AfterStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginInPageSepDef {

	static WebDriver driver;

	@Given("User on login page")
	public void user_on_login_page() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		driver.get("https://ui.cogmento.com/");

	}

	@When("User enter the valid username and password")
	public void user_enter_the_valid_username_and_password() {

		driver.findElement(By.name("email")).sendKeys("prafulp1010@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Pr@ful0812");
	}

	@Then("Click on login button")
	public void click_on_login_button() {

		driver.findElement(By.xpath("//div[text()='Login']")).click();
	}

	@Then("User validate Home page Title and Url")
	public void user_validate_home_page_title_and_url() {

		Assert.assertEquals(driver.getTitle(), "Cogmento CRM");
		boolean b = driver.getCurrentUrl().contains("cogmento");
		Assert.assertTrue(b);

	}

	@Then("Click on the contact button")
	public void click_on_the_contact_button() {
		driver.findElement(By.xpath("//a[@href='/contacts']")).click();

	}

	@Then("click on create button")
	public void click_on_create_button() {

		driver.findElement(By.xpath("//a[@href='/contacts/new']")).click();

	}

	@Then("User enter {string} and {string} and {string} and {string}")
	public void user_enter_and_and_and(String fname, String lname, String email, String status) {

		driver.findElement(By.name("first_name")).sendKeys(fname);
		driver.findElement(By.name("last_name")).sendKeys(lname);
		driver.findElement(By.name("value")).sendKeys(email);
		driver.findElement(By.name("status")).click();
		List<WebElement> ls = driver.findElements(By.xpath("//div[@name='status']/span"));

		for (WebElement abc : ls) {

			if (abc.getText().equalsIgnoreCase(status)) {
				abc.click();
				break;
			}
		}

	}

	@Then("Click on save button")
	public void click_on_save_button() {

		driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();

	}

	public String date() {

		return new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());

	}

	@Then("Take a screenshot")
	public void take_a_screenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File f = ts.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "//Screenshot//" + date() + ".png";
		FileUtils.copyFile(f, new File(path));

	}

	@Then("Click on delete button")
	public void click_on_delete_button() {

		driver.findElement(By.xpath("//button[@class='ui button icon']")).click();
	}

	@Then("Click on confirm delete button")
	public void click_on_confirm_delete_button() {

		driver.findElement(By.xpath("//button[@class='ui red button']")).click();
	}

	@AfterStep
	public static void threadsleep() throws InterruptedException {

		Thread.sleep(5000);
	}
}
