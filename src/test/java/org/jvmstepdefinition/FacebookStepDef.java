package org.jvmstepdefinition;

import org.base.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookStepDef extends BaseClass{
	

	@Given("User should be in the login page")
	public void user_should_be_in_the_login_page() {
		browserLaunch("https://www.facebook.com/");
		
	}
	@When("User should enter the {string} and {string}")
	public void user_should_enter_the_and(String username, String password) {
		findElementId("email").sendKeys(username);
		findElementId("pass").sendKeys(password);
	}
	@When("User should click the login button")
	public void user_should_click_the_login_button() {
		findElementName("login").click();
	}
	@Then("User should verify the successful message")
	public void user_should_verify_the_successful_message() {
		System.out.println("Login Successful");
		
	}



	

}
