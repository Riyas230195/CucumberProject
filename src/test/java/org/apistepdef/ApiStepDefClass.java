package org.apistepdef;

import org.apibaseclass.ApiBaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class ApiStepDefClass extends ApiBaseClass {
	
	Response response;
	
	@Given("User enters baseURI {string} and create requestObject for GETRequest")
	public void user_enters_base_uri_and_create_request_object_for_get_request(String string) {
     
		requestObject(string);
		
	}
	
	@When("User adds the headers for GETRequest")
	public void user_adds_the_headers_for_get_request() {
		
		addHeaders("Content-Type", "application/json");
	}
	
	@When("User adds the QueryParameter for GETRequest")
	public void user_adds_the_query_parameter_for_get_request() {
		
		addQueryParam("page", "2");
	}
	
	@When("User create {string} responseObject to for GETRequest")
	public void user_should_create_response_object_to_for_get_request(String string) {
		
		Response response = responseObject("GET", "/api/users");
		responseBody(response);
	}
	
//	@Then("user should validate the statuscode {int} for GETRequest")
//	public void user_should_validate_the_statuscode_for_get_request(Integer int1) {
//		
//		assertCheck(response, int1);
//	}


	@Given("User enters baseURI {string} and create requestObject for GETRequest1")
	public void user_enters_base_uri_and_create_request_object_for_get_request1(String string) {
		requestObject(string);
		
	}
	
	@When("User adds the headers for GETRequest1")
	public void user_adds_the_headers_for_get_request1() {
		addHeaders("Content-Type", "application/json");
		
	}
	
	@When("User adds the QueryParameter for GETRequest1")
	public void user_adds_the_query_parameter_for_get_request1() {
		addPathParam("page", "2");
		
		
	}
	
	@When("User create {string} responseObject to for GETRequest1")
	public void user_create_response_object_to_for_get_request1(String string) {
		Response response= responseObject("GET", "/api/users/{page}");
		responseBody(response);
	}
	
	
//	@Then("user should validate the statuscode {int} for GETRequest")
//	public void user_should_validate_the_statuscode_for_get_request(Integer int1) {
//		
//		assertCheck(response, 200);
//	}


	@Given("User enters baseURI {string} and create requestObject for PostRequest")
	public void user_enters_base_uri_and_create_request_object_for_post_request(String string) {
		requestObject(string);
		
	}
	@When("User adds the headers for PostRequest")
	public void user_adds_the_headers_for_post_request() {
		addHeaders("Content-Type", "application/json");
		
	}
	@When("User adds the JSON Body")
	public void user_adds_the_json_body() {
		jsonObject("bala", "QA", "name", "id");
		
	}
	

	@When("User create {string} responseObject to for PostRequest")
	public void user_create_response_object_to_for_post_request(String string) {
		Response response = responseObject("POST", "/api/users");
		responseBody(response);
	}



//	@Then("user should validate the statuscode {int} for PostRequest")
//	public void user_should_validate_the_statuscode_for_post_request(Integer int1) {
//		assertCheck(response, int1);
//	}

	
	
	







	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
