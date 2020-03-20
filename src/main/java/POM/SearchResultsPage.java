package POM;
import static StepDefination.Hooks.driver;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Mange.properties;

public class SearchResultsPage {
	WebDriverWait wait = new WebDriverWait(driver,20);
	public void selectPrime() throws IOException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.obj("clickOnPrimeRadioBtn"))));
		driver.findElement(By.xpath(properties.obj("clickOnPrimeRadioBtn"))).click();
	}
	public void selectPayOnDelivery() throws IOException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.obj("clickOnPayOnDeliveryBtn"))));
		driver.findElement(By.xpath(properties.obj("clickOnPayOnDeliveryBtn"))).click();
	}
	public void selectItem() throws IOException {
		
		List<WebElement> AllResults = driver.findElements(By.xpath(properties.obj("listOfResults")));
		System.out.println(AllResults);
		Random random = new Random();
		int listOfResults = random.nextInt(AllResults.size());
		System.out.println(listOfResults);
		AllResults.get(listOfResults).click();
	}
	

}
