package StepDefination;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	public static WebDriver driver;
	public static Properties obj; 
	@Before
	public void openbrpwser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dhilip\\Downloads\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@After
	public void quitTheBrowser() {
//		driver.close();
//		driver.quit();
	}
	public void object() throws IOException {
		 obj = new Properties();			
	    FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\elements.properties");									
	    obj.load(objfile);	
	}

}
