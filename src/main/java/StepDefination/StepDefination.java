package StepDefination;

import POM.Homepage;
import POM.Loginpage;
import POM.Productpage;
import POM.SearchResultsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import static StepDefination.Hooks.driver;

public class StepDefination {
	
	Homepage Hpage = new Homepage();
	Loginpage Lpage = new Loginpage();
	Productpage Ppage = new Productpage();
	SearchResultsPage srpage = new SearchResultsPage();
	
	 	@Given("^User visits the website$")
	    public void user_visits_the_website() throws Throwable {
	 		
	       driver.get("https://www.amazon.in/");
	    }
	 	 @And("^User click on signin button$")
	     public void user_click_on_signin_button() throws Throwable {
//	     	 Lpage.clickOnSigninOnHeader();
		}

	 	@When("^User enter the username and password and click on Login button$")
	    public void user_enter_the_username_and_password_and_click_on_login_button() throws Throwable {
	      
//	       Lpage.enterUsernameAndPassword();
	    }

	 	@When("^search for iteam and select$")
	 	public void search_for_iteam_and_select() throws Throwable {
	        Hpage.searchfor();
	    }

	 	 @And("^select the iteam from search results page$")
	     public void select_the_iteam_from_search_results_page() throws Throwable {
	      srpage.selectPrime();
	      srpage.selectPayOnDelivery();
	      srpage.selectItem();
	    }

	 	@And("^click on add to cart$")
	    public void click_on_add_to_cart() throws Throwable {
	        Ppage.getMrpPrice();
	        Ppage.getCurrentPrice();
	        Ppage.getSavingPrice();
	        Ppage.deliveryInform();
	    }

	    @And("^check the iteam in cart is present$")
	    public void check_the_iteam_in_cart_is_present() throws Throwable {
	    	Ppage.clickOnAddToCartBtn();
	    }

	    @And("^logout fro the website$")
	    public void logout_fro_the_website() throws Throwable {
	        
	    }

}
