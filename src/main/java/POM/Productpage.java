package POM;
import static StepDefination.Hooks.driver;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;

import Mange.properties;

public class Productpage {
	
	public void getCurrentPrice() throws IOException {
		Set handles = driver.getWindowHandles();
	    handles.size();
	    System.out.println("Handles");
	    for (String handle1 : driver.getWindowHandles()) {
	    	 
        	System.out.println(handle1);
        	
        	driver.switchTo().window(handle1);
        
        	}
	    for(String handle2 : driver.getWindowHandles())
	    {
	    	System.out.println(handle2);
	        driver.switchTo().window(handle2);
        	
	    }
		boolean currentPrice = driver.findElements(By.xpath(properties.obj("getCurrentPrice"))).size()>0;
		if(currentPrice == true) {
			String CurrentPrice = driver.findElement(By.xpath(properties.obj("getCurrentPrice"))).getText();
			System.out.println("current Price is ::"+CurrentPrice);
		}
	}
	public void getMrpPrice() throws IOException {
		boolean MrpPrice = driver.findElements(By.xpath(properties.obj("getMRPprice"))).size()>0;
		if(MrpPrice == true) {
			String Mrp = driver.findElement(By.xpath(properties.obj("getMRPprice"))).getText();
			System.out.println("MRP Price is ::"+Mrp);
		}
	}
	
	public void getSavingPrice() throws IOException {
		boolean SavingPrice = driver.findElements(By.xpath(properties.obj("getsavingPrice"))).size()>0;
		if(SavingPrice == true) {
			String savingPrice = driver.findElement(By.xpath(properties.obj("getsavingPrice"))).getText();
			System.out.println("Saving Price Is ::"+savingPrice);
		}
	}
	public void clickOnAddToCartBtn() throws IOException {
		try {
			driver.findElement(By.xpath(properties.obj("clickOnAddToCartBtn"))).click();
		}
		catch(Exception e){
			driver.findElement(By.xpath(properties.obj("clickOnAddToCartBtnInDealBox"))).click();
		}
	}
	public void successMsg() throws IOException {
		String AltMsg = driver.findElement(By.xpath(properties.obj("checkAlertMessage"))).getText();
		System.out.println(AltMsg);
	}
	public void deliveryInform() throws IOException {
		String deliveryInformation = driver.findElement(By.xpath(properties.obj("getTheDeliveryDetails"))).getText();
		System.out.println(deliveryInformation);
	}
	public void clickOnCart() throws IOException {
		driver.findElement(By.xpath(properties.obj("clickOnCart"))).click();
	}
	

}
