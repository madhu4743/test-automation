package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_steps {
	

	@Given("^user is on login page$")
	public void user_is_on_login_page() {
	   
		System.out.println("Inside Step - user is on login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		
		System.out.println("Inside step - user enters username and password");
	    
	}

	@When("user clicks on login")
	public void user_clicks_on_login() {
	System.out.println("Iside Step - user clicks on login");
	}

	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() {
	System.out.println("Inside Step - user is navigated to homepage");
	}

}
