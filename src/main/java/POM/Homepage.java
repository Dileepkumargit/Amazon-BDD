package POM;
import static StepDefination.Hooks.driver;

import java.io.IOException;

import org.openqa.selenium.By;
import Mange.properties;
public class Homepage extends properties{
	
	public void searchfor() throws IOException {
		driver.findElement(By.xpath(properties.obj("enterTheSearchKeyword"))).sendKeys("Mobiles");
		driver.findElement(By.xpath(properties.obj("clickOnSearchBtn"))).click();
	}

}
