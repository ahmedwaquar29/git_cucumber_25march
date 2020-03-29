package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class background_steps {
	@Given("^I navigate to the login page$")
	public void i_navigate_to_the_login_page() throws Throwable {
	    System.out.println("navigated to login page");
	}

	@When("^I submit username and password$")
	public void i_submit_username_and_password() throws Throwable {
		System.out.println("username password submitted");
	}

	@Then("^I should be logged in$")
	public void i_should_be_logged_in() throws Throwable {
		System.out.println("logged in");
	    
	}

	@Given("^User search for Lenovo Laptop$")
	public void user_search_for_Lenovo_Laptop() throws Throwable {
		System.out.println("Search for lenovo laptops");
	    
	}

	@When("^Add the first laptop that appears in the search result to the basket$")
	public void add_the_first_laptop_that_appears_in_the_search_result_to_the_basket() throws Throwable {
		System.out.println("Add the first laptop that appears in the search result to the basket");
	    
	}

	@Then("^User basket should display with added item$")
	public void user_basket_should_display_with_added_item() throws Throwable {
		System.out.println("Basket displayed with added items");
	   
	}

	@Given("^User navigate for Lenovo Laptop$")
	public void user_navigate_for_Lenovo_Laptop() throws Throwable {
		System.out.println("User navigated to lenovo laptops");
	   
	}

	@When("^Add the laptop to the basket$")
	public void add_the_laptop_to_the_basket() throws Throwable {
		System.out.println("Laptop added");
	    
	}


}
