package POM;

import static StepDefination.Hooks.driver;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Mange.properties;

public class Loginpage extends properties{
	 
	WebDriverWait wait = new WebDriverWait(driver,20);
	public void clickOnSigninOnHeader() throws IOException {
		String xpath = properties.obj("clickOnSignIn");
		System.out.println(xpath);
		System.out.println(properties.obj("clickOnSignIn"));
		driver.findElement(By.xpath(properties.obj("clickOnSignIn"))).click();
	}
	public void enterUsernameAndPassword() throws IOException {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.obj("enterUsername"))));
		driver.findElement(By.xpath(properties.obj("enterUsername"))).sendKeys("thupatidileep@gmail.com");
		driver.findElement(By.xpath(properties.obj("clickOnContinueBtn"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.obj("enterPassword"))));
		driver.findElement(By.xpath(properties.obj("enterPassword"))).sendKeys("dileep335");
		driver.findElement(By.xpath(properties.obj("clickOnLoginBtn"))).click();
	}

}
