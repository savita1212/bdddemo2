package BaseLayer;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class baseclass {

	public static Properties prop;
	public static FileInputStream fis;
	public static WebDriver driver;
	public baseclass() {
		File f = new File(System.getProperty("user.dir") + "\\src\\main\\java\\Configuration\\config.properties");
		prop = new Properties();
		try {
			fis = new FileInputStream(f);
			prop.load(fis);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void initilization() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\AllDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		String url = prop.getProperty("URL");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get(url);
	}

}
