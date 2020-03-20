package Ruuner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\Dhilip\\eclipse-workspace\\Amazon\\src\\test\\java\\Features\\AmazonAddToCart.feature"},
		glue     = {"StepDefination"},
		plugin = { "pretty", "html:target/cucumber-reports" },
        monochrome = true)
	
public class Runner {

}
